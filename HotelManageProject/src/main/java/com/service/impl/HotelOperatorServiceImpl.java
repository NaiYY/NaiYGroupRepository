package com.service.impl;

import com.pojo.HotelOperator;
import com.dao.IHotelOperatorDao;
import com.service.IHotelOperatorService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class HotelOperatorServiceImpl extends ServiceImpl<IHotelOperatorDao, HotelOperator> implements IHotelOperatorService {
}