package com.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.pojo.MallAdmin;
import com.service.IMallAdminService;
import com.tools.Tools;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletResponse;

@Controller
@RequestMapping("/admin")
public class MallAdminController {

    @Autowired
    IMallAdminService iMallAdminService;

    @RequestMapping("/login.ny")
    public String login(MallAdmin admin, Model model) {
        if (admin.getAdminUsername() == null || admin.getAdminPassword() == null) {
            model.addAttribute("url", "3;url=login.html");
            model.addAttribute("message", "账号或者密码不能为空！请在3秒后重新登录！");
            return "tips/tips";
        }

        QueryWrapper<MallAdmin> adminWrapper = new QueryWrapper<>();
        adminWrapper.lambda().eq(MallAdmin::getAdminUsername, admin.getAdminUsername());
        adminWrapper.lambda().eq(MallAdmin::getAdminPassword, admin.getAdminPassword());

        MallAdmin mallAdmin = iMallAdminService.getOne(adminWrapper);

        if (mallAdmin == null) {
            model.addAttribute("url", "3;url=login.html");
            model.addAttribute("message", "账号或者密码错误！请在3秒后重新登录！");
            return "tips/tips";
        }

        model.addAttribute("adminInfo", mallAdmin);

        return "admin/index";
    }

    @RequestMapping("/getUpdateUser.ny")
    public String getUpdateUser(Model model, int id) {
        model.addAttribute("id", id);
        return "admin/updatePassword";
    }

    @RequestMapping("/updatePassword.ny")
    public void updatePassword(int id, String password1, String password2, HttpServletResponse response, Model model) {

        if (!password1.equals(password2)) {
            Tools.sendUrl(response, "两次密码不一致！请重新修改！", "getUpdateUser.ny?id=" + id);
        }

        MallAdmin admin = new MallAdmin();
        admin.setAdminId(id);
        admin.setAdminPassword(password2);

        iMallAdminService.updatePassword(admin);

        Tools.reLogin(response, "修改密码成功！请重新登录！");
    }
}