package com.controller;

import com.pojo.BbsUserInfo;
import com.service.IBbsUserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@Controller
public class BbsUserInfoController {

    @Autowired
    IBbsUserInfoService bbsUserInfoService;

    @RequestMapping("/login.do")
    public String login(BbsUserInfo userInfo, Model model) {
        List<BbsUserInfo> bbsUserInfoList = bbsUserInfoService.list();
        boolean flag = false;
        for (int i = 0; i < bbsUserInfoList.size(); i++) {
            if (userInfo.getUName().equals(bbsUserInfoList.get(i).getUName()) && userInfo.getUPassword().equals(bbsUserInfoList.get(i).getUPassword())) {
                flag = true;
                userInfo = bbsUserInfoList.get(i);
                break;
            }
        }
        model.addAttribute("userInfo", userInfo);
        /*Cookie[] cookies = request.getCookies();*/
        /*if (cookies == null) {*/
            if (flag) {
                /*Cookie uName = new Cookie("uName", userInfo.getUName());
                Cookie uPassword = new Cookie("uPassword", userInfo.getUPassword());
                uName.setMaxAge(60*60*12);
                uPassword.setMaxAge(60*60*12);
                response.addCookie(uName);
                response.addCookie(uPassword);*/

                if (userInfo.getUType() == 0) {
                    return "admin";
                } else if (userInfo.getUType() == 1) {
                    return "moderator";
                } else if (userInfo.getUType() == 2) {
                    return "general";
                }else{
                    return "user/bbsUserError";
                }
            }
        /*}else{
            for (Cookie cookie:cookies) {
                if ("uName".equals(cookie.getName())){

                }
                if ("uPassword".equals(cookie.getName())){

                }
            }
        }*/
        return "user/bbsUserError";
    }



    @RequestMapping("user/bbsUserSelect.do")
    public String bbsUserSelect(Model model) {
        List<BbsUserInfo> bbsUserInfoList = bbsUserInfoService.list();
        model.addAttribute("bbsUserInfoList", bbsUserInfoList);
        return "user/bbsUserSelect";
    }

    @RequestMapping("user/bbsUserInsert.do")
    public String bbsUserInsert(BbsUserInfo userInfo, Model model) {
        String performingFunction = "bbsUserInsert";
        bbsUserInfoService.save(userInfo);
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
        if (userInfo != null) {
            return "user/update";
        } else {
            return "user/bbsUserError";
        }
    }

    @RequestMapping("user/update.do")
    public String update(BbsUserInfo userInfo, Model model) {
        String performingFunction = "update";
        BbsUserInfo update = bbsUserInfoService.getById(userInfo.getUId());
        model.addAttribute("performingFunction", performingFunction);
        model.addAttribute("user", update);
        if (update != null) {
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
        if (userInfo != null) {
            bbsUserInfoService.removeById(uId);
            return "user/bbsUserSuccessfulExecution";
        } else {
            return "user/bbsUserError";
        }
    }
}