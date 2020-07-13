package com.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.pojo.MallOrder;
import com.service.IMallOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/order")
public class MallOrderController {

    @Autowired
    IMallOrderService iMallOrderService;

    @RequestMapping("/queryOrder.ny")
    public String queryOrder(Model model,
                             @RequestParam(required = false, defaultValue = "1", value = "pn") Integer pn) {

        Page<MallOrder> page = new Page<>(pn, 5);
        IPage<MallOrder> orderPage = iMallOrderService.queryOrderPage(page, 2);

        model.addAttribute("orderList", orderPage.getRecords());
        model.addAttribute("pageInfo", orderPage);

        return "order/queryOrder";
    }
}