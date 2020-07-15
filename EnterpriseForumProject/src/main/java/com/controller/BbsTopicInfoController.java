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

    @RequestMapping("topic/bbsTopicSelect.do")
    public String bbsTopicSelect(Model model){
        List<BbsTopicInfo> bbsTopicInfoList = bbsTopicInfoService.list();
        model.addAttribute("bbsTopicInfoList", bbsTopicInfoList);
        return "topic/bbsTopicSelect";
    }

    @RequestMapping("topic/bbsTopicSelectGeneral.do")
    public String bbsTopicSelectGeneral(Model model){
        List<BbsTopicInfo> bbsTopicInfoList = bbsTopicInfoService.list();
        model.addAttribute("bbsTopicInfoList", bbsTopicInfoList);
        return "topic/bbsTopicSelectGeneral";
    }


    @RequestMapping("topic/bbsTopicInsert.do")
    public String bbsTopicInsert(BbsTopicInfo topicInfo, Model model) {
        String performingFunction = "bbsTopicInsert";
        bbsTopicInfoService.save(topicInfo);
        model.addAttribute("performingFunction", performingFunction);
        model.addAttribute("topic", topicInfo);
        return "topic/bbsTopicSuccessfulExecution";
    }

    @RequestMapping("topic/bbsTopicUpdate.do")
    public String bbsTopicUpdate(int tId, Model model) {
        String performingFunction = "bbsTopicUpdate";
        BbsTopicInfo topicInfo = bbsTopicInfoService.getById(tId);
        model.addAttribute("performingFunction", performingFunction);
        model.addAttribute("topic", topicInfo);
        if (topicInfo!=null) {
            return "topic/update";
        } else {
            return "topic/bbsTopicError";
        }
    }

    @RequestMapping("topic/update.do")
    public String update(BbsTopicInfo topicInfo, Model model) {
        String performingFunction = "update";
        BbsTopicInfo update = bbsTopicInfoService.getById(topicInfo.getTId());
        model.addAttribute("performingFunction", performingFunction);
        model.addAttribute("topic", update);
        if (update!=null) {
            bbsTopicInfoService.updateById(topicInfo);
            return "topic/bbsTopicSuccessfulExecution";
        } else {
            return "topic/bbsTopicError";
        }
    }


    @RequestMapping("topic/bbsTopicDelete.do")
    public String bbsTopicDelete(int tId, Model model) {
        String performingFunction = "bbsTopicDelete";
        BbsTopicInfo topicInfo = bbsTopicInfoService.getById(tId);
        model.addAttribute("performingFunction", performingFunction);
        model.addAttribute("topic", topicInfo);
        if (topicInfo!=null) {
            bbsTopicInfoService.removeById(tId);
            return "topic/bbsTopicSuccessfulExecution";
        } else {
            return "topic/bbsTopicError";
        }
    }
}