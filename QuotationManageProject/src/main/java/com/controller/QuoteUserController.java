package com.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.pojo.QuoteUser;
import com.service.IQuoteUserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@Controller
public class QuoteUserController  {

    @Resource
    IQuoteUserService quoteUserService;

    @RequestMapping("login.do")
    public String login(QuoteUser user, Model model){
        System.out.println(user);
        QueryWrapper<QuoteUser> queryWrapper=new QueryWrapper<>();
        queryWrapper.lambda().eq(QuoteUser::getUserName,user.getUserName());
        queryWrapper.lambda().eq(QuoteUser::getPassword,user.getPassword());

        QuoteUser quoteUser = quoteUserService.getOne(queryWrapper);

        if(quoteUser==null){
            model.addAttribute("text","账号或密码错误");
            model.addAttribute("url","2;url=frame/login.html");
            return "error";
        }

        model.addAttribute("text","登陆成功");
        model.addAttribute("url","2;url=frame/framework.html");
        return "error";
    }

}