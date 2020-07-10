package com.controller;

import com.pojo.BbsUserInfo;
import com.service.IBbsUserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class BbsUserInfoController {

    //    @RequestMapping("/test.do")
//    apublic String test(Model model){
//        System.out.println("test");
//        model.addAttribute("test","test");
//        return "test";
//    }
    @Autowired
    IBbsUserInfoService bbsUserInfoService;

    @RequestMapping("/bbsUserShowAll.do")
    public String showAllBbsUser(Model model) {
        List<BbsUserInfo> bbsUserInfoList = bbsUserInfoService.list();
        model.addAttribute("bbsUserInfoList", bbsUserInfoList);
        return "bbsUserShowAll";
    }

    @RequestMapping("/bbsUserInsert.do")
    public String bbsUserInsert(BbsUserInfo userInfo, Model model) {
        boolean flag = bbsUserInfoService.save(userInfo);
        model.addAttribute("user", userInfo);
        model.addAttribute("bbsUserInsert", userInfo);
        if (flag) {
            return "bbsUserSuccessfulExecution";
        } else {
            return "bbsUserError";
        }
    }

    @RequestMapping("/bbsUserUpdate.do")
    public String bbsUserUpdate(BbsUserInfo userInfo, Model model) {
        bbsUserInfoService.getById(userInfo.getUId());
        boolean flag = bbsUserInfoService.updateById(userInfo);
        model.addAttribute("user", userInfo);
        model.addAttribute("bbsUserUpdate", userInfo);
        if (flag) {
            return "bbsUserSuccessfulExecution";
        } else {
            return "bbsUserError";
        }
    }

}