package com.service.impl;

import com.pojo.HotelBalanceMent;
import com.dao.IHotelBalanceMentDao;
import com.service.IHotelBalanceMentService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class HotelBalanceMentServiceImpl extends ServiceImpl<IHotelBalanceMentDao, HotelBalanceMent> implements IHotelBalanceMentService {
}