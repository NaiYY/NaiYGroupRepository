package com.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.pojo.HotelRoom;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface IHotelRoomDao extends BaseMapper<HotelRoom> {
}