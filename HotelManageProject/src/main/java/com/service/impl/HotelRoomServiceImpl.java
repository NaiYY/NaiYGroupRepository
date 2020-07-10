package com.service.impl;

import com.pojo.HotelRoom;
import com.dao.IHotelRoomDao;
import com.service.IHotelRoomService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class HotelRoomServiceImpl extends ServiceImpl<IHotelRoomDao, HotelRoom> implements IHotelRoomService {
}