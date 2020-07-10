package com.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.pojo.HotelRoomInfo;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface IHotelRoomInfoDao extends BaseMapper<HotelRoomInfo> {
}