package com.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.pojo.MallCart;
import com.pojo.MallUser;
import com.service.IMallUserService;
import com.tools.Tools;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.LinkedList;

@Controller
public class MallUserController {

    @Autowired
    IMallUserService iMallUserService;

    @RequestMapping("/login.ny")
    public void login(MallUser user, HttpServletRequest request, HttpServletResponse response) {

        QueryWrapper<MallUser> loginWrapper = new QueryWrapper<>();

        loginWrapper.lambda().eq(MallUser::getUserName, user.getUserName());
        loginWrapper.lambda().eq(MallUser::getUserPassword, user.getUserPassword());

        MallUser loginUser = iMallUserService.getOne(loginWrapper);

        if (loginUser == null) {
            Tools.sendUrl(response, "Login fail!Please check the username and password", "login.html");
        } else {

            // 免登陆
            Cookie nameCookie = new Cookie("username", user.getUserName());
            Cookie passCookie = new Cookie("password", user.getUserPassword());

            // 7天
            nameCookie.setMaxAge(60 * 60 * 24 * 7);
            passCookie.setMaxAge(60 * 60 * 24 * 7);

            response.addCookie(nameCookie);
            response.addCookie(passCookie);

            // 新增该用户的购物车
            HttpSession session = request.getSession();
            session.setAttribute(user.getUserName() + "Card", new LinkedList<MallCart>());

            Tools.sendUrl(response, "Login success!", "init.ny");
        }
    }


}