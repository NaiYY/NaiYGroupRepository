package com.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.pojo.MallOrderList;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface IMallOrderListDao extends BaseMapper<MallOrderList> {
}