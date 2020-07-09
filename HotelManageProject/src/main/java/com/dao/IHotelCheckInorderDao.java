package com.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.pojo.HotelCheckInorder;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface IHotelCheckInorderDao extends BaseMapper<HotelCheckInorder> {
}