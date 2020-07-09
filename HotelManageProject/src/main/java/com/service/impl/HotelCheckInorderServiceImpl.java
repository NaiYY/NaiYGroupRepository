package com.service.impl;

import com.pojo.HotelCheckInorder;
import com.dao.IHotelCheckInorderDao;
import com.service.IHotelCheckInorderService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class HotelCheckInorderServiceImpl extends ServiceImpl<IHotelCheckInorderDao, HotelCheckInorder> implements IHotelCheckInorderService {
}