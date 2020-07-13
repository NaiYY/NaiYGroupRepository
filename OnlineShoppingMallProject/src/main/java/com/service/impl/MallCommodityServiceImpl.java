package com.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.dao.IMallCommodityDao;
import com.pojo.MallCommodity;
import com.service.IMallCommodityService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class MallCommodityServiceImpl extends ServiceImpl<IMallCommodityDao, MallCommodity> implements IMallCommodityService {
}