package com.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.pojo.MallOrder;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface IMallOrderDao extends BaseMapper<MallOrder> {
}