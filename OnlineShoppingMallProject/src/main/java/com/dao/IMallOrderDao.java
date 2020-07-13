package com.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.pojo.MallOrder;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface IMallOrderDao extends BaseMapper<MallOrder> {

    IPage<MallOrder> queryOrderPage(Page<?> page, int state);

    MallOrder queryOrderById(String orderNo);

    int addOrder(MallOrder order);
}