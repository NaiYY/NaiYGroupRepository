package com.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.dao.IMallCommodityClassDao;
import com.pojo.MallCommodityClass;
import com.service.IMallCommodityClassService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class MallCommodityClassServiceImpl extends ServiceImpl<IMallCommodityClassDao, MallCommodityClass> implements IMallCommodityClassService {
}