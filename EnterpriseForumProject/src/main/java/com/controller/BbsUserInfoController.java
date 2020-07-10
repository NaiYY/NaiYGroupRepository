package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BbsUserInfoController  {
    @RequestMapping("/test.do")
    public String test(Model model){
        System.out.println("test");
        model.addAttribute("test","test");
        return "test";
    }
}