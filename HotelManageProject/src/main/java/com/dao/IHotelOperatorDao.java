package com.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.pojo.HotelOperator;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface IHotelOperatorDao extends BaseMapper<HotelOperator> {
}