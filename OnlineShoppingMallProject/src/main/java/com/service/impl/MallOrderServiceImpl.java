package com.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.dao.IMallOrderDao;
import com.pojo.MallOrder;
import com.service.IMallOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class MallOrderServiceImpl extends ServiceImpl<IMallOrderDao, MallOrder> implements IMallOrderService {
    @Autowired
    IMallOrderDao iMallOrderDao;

    @Override
    public IPage<MallOrder> queryOrderPage(Page<MallOrder> page, int state) {
        page.setOptimizeCountSql(false);
        return iMallOrderDao.queryOrderPage(page, state);
    }

    @Override
    public MallOrder queryOrderById(String orderNo) {
        return iMallOrderDao.queryOrderById(orderNo);
    }

    @Override
    public int addOrder(MallOrder order) {
        return iMallOrderDao.addOrder(order);
    }
}