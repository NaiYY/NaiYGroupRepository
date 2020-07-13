package com.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.pojo.MallCommodityClass;
import com.service.IMallCommodityClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/commClass")
public class MallCommodityClassController {

    @Autowired
    IMallCommodityClassService iMallCommodityClassService;

    @RequestMapping("queryCommClass.ny")
    public String queryCommClass(Model model,
                                 @RequestParam(required = false, defaultValue = "1", value = "pn") Integer pn) {

        IPage<MallCommodityClass> commodityClassIPage = iMallCommodityClassService.selectByPage(pn, 5);

        model.addAttribute("commClassList", commodityClassIPage.getRecords());
        model.addAttribute("pageInfo", commodityClassIPage);

        return "commClass/queryCommClass";
    }

    @RequestMapping("addCommClass.ny")
    public String addCommClass(Model model, MallCommodityClass commodityClass) {
        iMallCommodityClassService.save(commodityClass);
        model.addAttribute("url", "1;url=queryCommClass.ny");
        model.addAttribute("message", "添加成功！");
        return "tips/tips";
    }

    @RequestMapping("deleteCommClass.ny")
    public String deleteCommClass(Model model, Integer id) {
        iMallCommodityClassService.removeById(id);
        model.addAttribute("url", "1;url=queryCommClass.ny");
        model.addAttribute("message", "删除成功！");
        return "tips/tips";
    }

    @RequestMapping("getUpdateCommClass.ny")
    public String getUpdateCommClass(Model model, Integer id) {
        MallCommodityClass mallCommodityClass = iMallCommodityClassService.getById(id);
        model.addAttribute("commClass", mallCommodityClass);
        return "commClass/updateCommClass";
    }

    @RequestMapping("updateCommClass.ny")
    public String updateCommClass(MallCommodityClass commodityClass, Model model) {
        iMallCommodityClassService.updateById(commodityClass);
        model.addAttribute("url", "1;url=queryCommClass.ny");
        model.addAttribute("message", "修改成功！");
        return "tips/tips";
    }
}