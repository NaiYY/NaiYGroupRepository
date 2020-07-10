package com.service.impl;

import com.pojo.HotelRoomInfo;
import com.dao.IHotelRoomInfoDao;
import com.service.IHotelRoomInfoService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class HotelRoomInfoServiceImpl extends ServiceImpl<IHotelRoomInfoDao, HotelRoomInfo> implements IHotelRoomInfoService {
}