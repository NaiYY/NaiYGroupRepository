package com.controller;

import com.pojo.BbsTopicInfo;
import com.service.IBbsTopicInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class BbsTopicInfoController {
    @Autowired
    IBbsTopicInfoService bbsTopicInfoService;

    @RequestMapping("bbsTopicSelect.do")
    public String bbsTopicSelect(Model model){
        List<BbsTopicInfo> bbsTopicInfoList = bbsTopicInfoService.list();
        model.addAttribute("bbsTopicInfoList", bbsTopicInfoList);
        return "topic/bbsTopicSelect";
    }
}