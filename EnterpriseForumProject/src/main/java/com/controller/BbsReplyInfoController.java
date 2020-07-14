package com.controller;

import com.pojo.BbsReplyInfo;
import com.service.IBbsReplyInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class BbsReplyInfoController {
    @Autowired
    IBbsReplyInfoService replyInfoService;

    @RequestMapping("reply/bbsReplySelect.do")
    public String bbsReplySelect(Model model){
        List<BbsReplyInfo> replyInfoList = replyInfoService.list();
        model.addAttribute("replyInfoList", replyInfoList);
        return "reply/bbsReplySelect";
    }

    @RequestMapping("reply/bbsReplyInsert.do")
    public String bbsUpdateInsert(BbsReplyInfo replyInfo, Model model) {
        String performingFunction = "bbsReplyInsert";
        replyInfoService.save(replyInfo);
        model.addAttribute("performingFunction", performingFunction);
        model.addAttribute("reply", replyInfo);
        return "reply/bbsReplySuccessfulExecution";
    }

    @RequestMapping("reply/bbsReplyUpdate.do")
    public String bbsReplyUpdate(int rId, Model model) {
        String performingFunction = "bbsReplyUpdate";
        BbsReplyInfo replyInfo = replyInfoService.getById(rId);
        model.addAttribute("performingFunction", performingFunction);
        model.addAttribute("reply", replyInfo);
        if (replyInfo!=null) {
            return "reply/update";
        } else {
            return "reply/bbsReplyError";
        }
    }

    @RequestMapping("reply/update.do")
    public String update(BbsReplyInfo replyInfo, Model model) {
        String performingFunction = "update";
        BbsReplyInfo update = replyInfoService.getById(replyInfo.getRId());
        model.addAttribute("performingFunction", performingFunction);
        model.addAttribute("reply", update);
        if (update!=null) {
            replyInfoService.updateById(replyInfo);
            return "reply/bbsReplySuccessfulExecution";
        } else {
            return "reply/bbsReplyError";
        }
    }


    @RequestMapping("reply/bbsReplyDelete.do")
    public String bbsReplyDelete(int rId, Model model) {
        String performingFunction = "bbsReplyDelete";
        BbsReplyInfo replyInfo = replyInfoService.getById(rId);
        model.addAttribute("performingFunction", performingFunction);
        model.addAttribute("reply", replyInfo);
        if (replyInfo!=null) {
            replyInfoService.removeById(rId);
            return "reply/bbsReplySuccessfulExecution";
        } else {
            return "reply/bbsReplyError";
        }
    }
}