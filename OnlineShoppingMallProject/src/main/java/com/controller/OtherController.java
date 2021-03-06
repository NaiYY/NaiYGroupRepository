package com.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.pojo.*;
import com.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.sql.Timestamp;
import java.util.LinkedList;
import java.util.List;

@Controller
public class OtherController {

    @Autowired
    IMallCommodityService iMallCommodityService;

    @Autowired
    IMallCommodityClassService iMallCommodityClassService;

    @Autowired
    IMallUserService iMallUserService;

    @Autowired
    IMallOrderService iMallOrderService;

    @Autowired
    IMallOrderListService iMallOrderListService;

    @RequestMapping("/init.ny")
    public String init(Model model, HttpServletRequest request,
                       @RequestParam(required = false, defaultValue = "0", value = "commId") int commId,
                       @RequestParam(required = false, defaultValue = "info", value = "type") String type,
                       @RequestParam(required = false, defaultValue = "1", value = "clazzId") Integer clazzId) {

        // 获取所有的 商品类型
        List<MallCommodityClass> classList = iMallCommodityClassService.list();
        model.addAttribute("classList", classList);

        // 根据用户名获取用户信息
        Cookie[] cookies = request.getCookies();

        String currName = "";

        for (Cookie cookie : cookies) {
            String name = cookie.getName();

            if ("username".equals(name)) {
                currName = cookie.getValue();
            }
        }

        QueryWrapper<MallUser> userWrapper = new QueryWrapper<>();
        userWrapper.lambda().eq(MallUser::getUserName, currName);

        MallUser user = iMallUserService.getOne(userWrapper);

        // 基本信息
        if ("info".equals(type)) {
            // 根据商品类型ID 获取当前的 商品类型名称
            QueryWrapper<MallCommodityClass> clazzWrapper = new QueryWrapper<>();
            clazzWrapper.lambda().eq(MallCommodityClass::getCommodityClassId, clazzId);
            MallCommodityClass clazz = iMallCommodityClassService.getOne(clazzWrapper);

            // 根据商品类型ID 获取对应的商品
            List<MallCommodity> commodities = iMallCommodityService.queryCommByClazzId(clazzId);

            model.addAttribute("clazzName", clazz.getCommodityClassName());
            model.addAttribute("commodities", commodities);
        }

        // 商品信息
        if ("commInfo".equals(type)) {
            MallCommodity comm = iMallCommodityService.queryCommById(commId);
            model.addAttribute("commodity", comm);
        }

        // 购物车新增
        if ("cardAdd".equals(type)) {
            HttpSession session = request.getSession();

            // 根据商品ID获取商品
            MallCommodity comm = iMallCommodityService.queryCommById(commId);

            LinkedList<MallCart> carts = (LinkedList<MallCart>) session.getAttribute(currName + "Card");

            boolean isNew = true;

            for (MallCart cart : carts) {
                Integer commodityId = cart.getCommodity().getCommodityId();
                if (commId == commodityId) {
                    cart.setCommodityNum(cart.getCommodityNum() + 1);
                    isNew = false;
                }
            }

            if (isNew) {
                MallCart mallCart = new MallCart();
                mallCart.setCommodity(comm);
                mallCart.setUser(user);
                mallCart.setCommodityNum(1);
                carts.add(mallCart);
            }
        }

        // 查看购物车
        if ("myCart".equals(type)) {
            HttpSession session = request.getSession();
            LinkedList<MallCart> carts = (LinkedList<MallCart>) session.getAttribute(currName + "Card");
            model.addAttribute("cards", carts);
        }

        // 移除购物车
        if ("delCart".equals(type)) {
            HttpSession session = request.getSession();
            LinkedList<MallCart> carts = (LinkedList<MallCart>) session.getAttribute(currName + "Card");
            for (MallCart cart : carts) {
                Integer commodityId = cart.getCommodity().getCommodityId();
                if (commId == commodityId) {
                    carts.remove(cart);
                }
            }
        }

        // 结算
        if ("settlement".equals(type)) {
            HttpSession session = request.getSession();

            Integer userId = 0;

            double totalPrice = 0.0;

            LinkedList<MallCart> carts = (LinkedList<MallCart>) session.getAttribute(currName + "Card");
            for (MallCart cart : carts) {
                userId = cart.getUser().getUserId();

                Integer commodityId = cart.getCommodity().getCommodityId();

                totalPrice += cart.getCommodityNum() * cart.getCommodity().getCommodityFcPrice();

                // 将商品数量减去相对应数量 和 移除对应的购物车
                MallCommodity oldComm = iMallCommodityService.queryCommById(commodityId);
                oldComm.setCommodityLeaveNum(oldComm.getCommodityLeaveNum() - cart.getCommodityNum());
                iMallCommodityService.updateNum(oldComm);
            }

            // 新增订单
            String no = "FC" + System.currentTimeMillis();

            MallOrder order = new MallOrder();
            order.setOrderNo(no);
            order.setUser(iMallUserService.getById(userId));
            order.setOrderSubmitTime(new Timestamp(System.currentTimeMillis()));
            // 发货时间 是 当前时间基础上 加上2天
            order.setOrderConsignmentTime(new Timestamp(System.currentTimeMillis() + (60 * 60 * 24 * 2)));
            order.setOrderTotalPrice(totalPrice);
            order.setOrderRemark("无备注");
            order.setOrderIsPayoff(0);
            order.setOrderIsConsignment(0);

            iMallOrderService.addOrder(order);

            MallOrder mallOrder = iMallOrderService.queryOrderById(no);

            for (MallCart cart : carts) {
                MallOrderList orderList = new MallOrderList();
                orderList.setOrderId(mallOrder.getOrderId());
                orderList.setCommodityId(cart.getCommodity().getCommodityId());
                orderList.setAmount(cart.getCommodityNum());

                iMallOrderListService.save(orderList);
            }
            carts.removeAll(carts);
        }

        // 查看订单
        if ("".equals(type)) {
            // 待写
        }

        model.addAttribute("userInfo", user);
        model.addAttribute("type", type);

        return "index";
    }
}