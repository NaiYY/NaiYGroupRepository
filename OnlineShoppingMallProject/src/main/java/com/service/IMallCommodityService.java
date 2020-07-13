package com.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.pojo.MallCommodity;

import java.util.List;

public interface IMallCommodityService extends IService<MallCommodity> {

    IPage<MallCommodity> queryCommPage(Page<MallCommodity> page, int state);

    List<MallCommodity> queryCommByClazzId(int id);

    MallCommodity queryCommById(int id);

    int updateNum(MallCommodity commodity);

    int addCommodity(MallCommodity commodity);

    int updateCommodity(MallCommodity commodity);
}