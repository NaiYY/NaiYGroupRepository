package com.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.pojo.MallOrder;

public interface IMallOrderService extends IService<MallOrder> {

    IPage<MallOrder> queryOrderPage(Page<MallOrder> page, int state);

    MallOrder queryOrderById(String orderNo);

    int addOrder(MallOrder order);

}