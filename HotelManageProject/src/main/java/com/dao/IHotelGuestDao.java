package com.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.pojo.HotelGuest;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface IHotelGuestDao extends BaseMapper<HotelGuest> {
}