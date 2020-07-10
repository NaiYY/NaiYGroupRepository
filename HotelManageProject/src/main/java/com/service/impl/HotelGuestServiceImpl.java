package com.service.impl;

import com.pojo.HotelGuest;
import com.dao.IHotelGuestDao;
import com.service.IHotelGuestService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class HotelGuestServiceImpl extends ServiceImpl<IHotelGuestDao, HotelGuest> implements IHotelGuestService {
}