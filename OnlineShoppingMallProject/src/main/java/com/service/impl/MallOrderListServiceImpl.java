package com.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.dao.IMallOrderListDao;
import com.pojo.MallOrderList;
import com.service.IMallOrderListService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class MallOrderListServiceImpl extends ServiceImpl<IMallOrderListDao, MallOrderList> implements IMallOrderListService {
}