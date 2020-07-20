package com.controller;

import com.pojo.BbsReplyInfo;
import com.pojo.BbsSectionInfo;
import com.pojo.BbsTopicInfo;
import com.pojo.BbsUserInfo;
import com.service.IBbsReplyInfoService;
import com.service.IBbsSectionInfoService;
import com.service.IBbsTopicInfoService;
import com.service.IBbsUserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class BbsIndexController {
    @Autowired
    IBbsUserInfoService userInfoService;

    @Autowired
    IBbsReplyInfoService replyInfoService;

    @Autowired
    IBbsSectionInfoService sectionInfoService;

    @Autowired
    IBbsTopicInfoService topicInfoService;


    @RequestMapping("/index.do")
    public String index(Model model, HttpServletRequest request) {
        List<BbsUserInfo> userList = userInfoService.list();
        List<BbsReplyInfo> replyList = replyInfoService.list();
        List<BbsSectionInfo> sectionList = sectionInfoService.list();
        List<BbsTopicInfo> topicList = topicInfoService.list();

        model.addAttribute("userList", userList);
        model.addAttribute("replyList", replyList);
        model.addAttribute("sectionList", sectionList);
        model.addAttribute("topicList", topicList);


        return "index";
    }

}
