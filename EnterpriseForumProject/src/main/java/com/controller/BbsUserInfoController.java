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

    @Autowired
    IBbsUserInfoService bbsUserInfoService;


    @RequestMapping("user/bbsUserSelect.do")
    public String bbsUserSelect(Model model) {
        List<BbsUserInfo> bbsUserInfoList = bbsUserInfoService.list();
        model.addAttribute("bbsUserInfoList", bbsUserInfoList);
        return "user/bbsUserSelect";
    }

    @RequestMapping("user/bbsUserInsert.do")
    public String bbsUserInsert(BbsUserInfo userInfo, Model model) {
        String performingFunction = "bbsUserInsert";
        boolean flag = bbsUserInfoService.save(userInfo);
        model.addAttribute("performingFunction", performingFunction);
        model.addAttribute("user", userInfo);
        return "user/bbsUserSuccessfulExecution";
    }

    @RequestMapping("user/bbsUserUpdate.do")
    public String bbsUserUpdate(int uId, Model model) {
        String performingFunction = "bbsUserUpdate";
        BbsUserInfo userInfo = bbsUserInfoService.getById(uId);
        model.addAttribute("performingFunction", performingFunction);
        model.addAttribute("user", userInfo);
        if (userInfo!=null) {
            return "user/update";
        } else {
            return "user/bbsUserError";
        }
    }

    @RequestMapping("user/update.do")
    public String Update(BbsUserInfo userInfo, Model model) {
        String performingFunction = "update";
        BbsUserInfo update = bbsUserInfoService.getById(userInfo.getUId());
        model.addAttribute("performingFunction", performingFunction);
        model.addAttribute("user", update);
        if (update!=null) {
            bbsUserInfoService.updateById(userInfo);
            return "user/bbsUserSuccessfulExecution";
        } else {
            return "user/bbsUserError";
        }
    }


    @RequestMapping("user/bbsUserDelete.do")
    public String bbsUserDelete(int uId, Model model) {
        String performingFunction = "bbsUserDelete";
        BbsUserInfo userInfo = bbsUserInfoService.getById(uId);
        model.addAttribute("performingFunction", performingFunction);
        model.addAttribute("user", userInfo);
        if (userInfo!=null) {
            bbsUserInfoService.removeById(uId);
            return "user/bbsUserSuccessfulExecution";
        } else {
            return "user/bbsUserError";
        }
    }
}