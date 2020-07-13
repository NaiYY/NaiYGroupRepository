package com.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.pojo.MallCommodityClass;
import com.baomidou.mybatisplus.extension.service.IService;

public interface IMallCommodityClassService extends IService<MallCommodityClass> {

    IPage<MallCommodityClass> selectByPage(int start, int size);

}