package com.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.dao.IMallOrderDao;
import com.pojo.MallOrder;
import com.service.IMallOrderService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class MallOrderServiceImpl extends ServiceImpl<IMallOrderDao, MallOrder> implements IMallOrderService {
}