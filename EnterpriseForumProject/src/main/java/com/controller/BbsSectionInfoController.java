package com.controller;


import com.pojo.BbsSectionInfo;
import com.service.IBbsSectionInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class BbsSectionInfoController {
    @Autowired
    IBbsSectionInfoService bbsSectionInfoService;

    @RequestMapping("section/bbsSectionSelect.do")
    public String bbsSectionSelect(Model model){
        List<BbsSectionInfo> sectionInfoList = bbsSectionInfoService.list();
        model.addAttribute("sectionInfoList", sectionInfoList);
        return "section/bbsSectionSelect";
    }

    @RequestMapping("section/bbsSectionInsert.do")
    public String bbsUpdateInsert(BbsSectionInfo sectionInfo, Model model) {
        String performingFunction = "bbsSectionInsert";
        bbsSectionInfoService.save(sectionInfo);
        model.addAttribute("performingFunction", performingFunction);
        model.addAttribute("section", sectionInfo);
        return "section/bbsSectionSuccessfulExecution";
    }

    @RequestMapping("section/bbsSectionUpdate.do")
    public String bbsSectionUpdate(int sId, Model model) {
        String performingFunction = "bbsSectionUpdate";
        BbsSectionInfo sectionInfo = bbsSectionInfoService.getById(sId);
        model.addAttribute("performingFunction", performingFunction);
        model.addAttribute("section", sectionInfo);
        if (sectionInfo!=null) {
            return "section/update";
        } else {
            return "section/bbsSectionError";
        }
    }

    @RequestMapping("section/update.do")
    public String update(BbsSectionInfo sectionInfo, Model model) {
        String performingFunction = "update";
        BbsSectionInfo update = bbsSectionInfoService.getById(sectionInfo.getSId());
        model.addAttribute("performingFunction", performingFunction);
        model.addAttribute("section", update);
        if (update!=null) {
            bbsSectionInfoService.updateById(sectionInfo);
            return "section/bbsSectionSuccessfulExecution";
        } else {
            return "section/bbsSectionError";
        }
    }


    @RequestMapping("section/bbsSectionDelete.do")
    public String bbsSectionDelete(int sId, Model model) {
        String performingFunction = "bbsSectionDelete";
        BbsSectionInfo sectionInfo = bbsSectionInfoService.getById(sId);
        model.addAttribute("performingFunction", performingFunction);
        model.addAttribute("section", sectionInfo);
        if (sectionInfo!=null) {
            bbsSectionInfoService.removeById(sId);
            return "section/bbsSectionSuccessfulExecution";
        } else {
            return "section/bbsSectionError";
        }
    }
}