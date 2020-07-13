package com.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.pojo.MallCommodity;
import com.pojo.MallCommodityClass;
import com.service.IMallCommodityClassService;
import com.service.IMallCommodityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.sql.Timestamp;

@Controller
@RequestMapping("/comm")
public class MallCommodityController {

    @Autowired
    IMallCommodityService iMallCommodityService;

    @Autowired
    IMallCommodityClassService iMallCommodityClassService;

    @RequestMapping("queryComm.ny")
    public String queryCommClass(Model model,
                                 @RequestParam(required = false, defaultValue = "1", value = "pn") Integer pn) {

        Page<MallCommodity> page = new Page<>(pn, 5);
        IPage<MallCommodity> test = iMallCommodityService.queryCommPage(page, 2);

        model.addAttribute("commList", test.getRecords());
        model.addAttribute("pageInfo", test);

        return "comm/queryComm";
    }

    @RequestMapping("getCommClassList.ny")
    public String getCommClassList(Model model) {
        model.addAttribute("classList", iMallCommodityClassService.list());
        return "comm/addComm";
    }

    @RequestMapping("addComm.ny")
    public String addComm(MallCommodity commodity, String clazzName, Model model,
                          @RequestParam("imgUp") MultipartFile imgUp) {

        // 上传路径
        String pathName = new File("OnlineShoppingMallProject/src/main/resources/static/img").getAbsolutePath();

        // 图片
        String img = pathName + "/" + imgUp.getOriginalFilename();

        File uploadImg = new File(img);

        // 上传
        try {
            imgUp.transferTo(uploadImg);
        } catch (IOException e) {
            e.printStackTrace();
        }

        String imgSrc = "img/" + imgUp.getOriginalFilename();

        QueryWrapper<MallCommodityClass> clazzNameWrapper = new QueryWrapper<>();
        clazzNameWrapper.lambda().eq(MallCommodityClass::getCommodityClassName, clazzName);

        commodity.setCommodityImage(imgSrc);
        commodity.setCommodityClass(iMallCommodityClassService.getOne(clazzNameWrapper));
        commodity.setCommodityRegTime(new Timestamp(System.currentTimeMillis()));

        iMallCommodityService.addCommodity(commodity);

        model.addAttribute("url", "1;url=queryComm.ny");
        model.addAttribute("message", "添加成功！");

        return "tips/tips";
    }

    @RequestMapping("deleteComm.ny")
    public String deleteComm(Model model, Integer id) {
        iMallCommodityService.removeById(id);
        model.addAttribute("url", "1;url=queryComm.ny");
        model.addAttribute("message", "删除成功！");
        return "tips/tips";
    }

    @RequestMapping("getUpdateComm.ny")
    public String getUpdateComm(Model model, Integer id) {
        MallCommodity mallCommodity = iMallCommodityService.queryCommById(id);
        model.addAttribute("classList", iMallCommodityClassService.list());
        model.addAttribute("comm", mallCommodity);
        return "comm/updateComm";
    }

    @RequestMapping("updateComm.ny")
    public String updateComm(MallCommodity commodity, String clazzName, Model model) {

        QueryWrapper<MallCommodityClass> clazzNameWrapper = new QueryWrapper<>();
        clazzNameWrapper.lambda().eq(MallCommodityClass::getCommodityClassName, clazzName);

        commodity.setCommodityClass(iMallCommodityClassService.getOne(clazzNameWrapper));

        iMallCommodityService.updateCommodity(commodity);

        model.addAttribute("url", "1;url=queryComm.ny");
        model.addAttribute("message", "修改成功！");
        return "tips/tips";
    }

}