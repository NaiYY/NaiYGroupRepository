package com.controller;

import com.pojo.MallAdmin;
import com.service.IMallAdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class MallAdminController {

    @Autowired
    IMallAdminService iMallAdminService;

    @RequestMapping("/login.ny")
    public void login(MallAdmin admin) {

    }
}