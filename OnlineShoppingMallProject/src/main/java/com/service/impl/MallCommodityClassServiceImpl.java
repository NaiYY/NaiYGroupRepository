package com.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.dao.IMallCommodityClassDao;
import com.pojo.MallCommodityClass;
import com.service.IMallCommodityClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class MallCommodityClassServiceImpl extends ServiceImpl<IMallCommodityClassDao, MallCommodityClass> implements IMallCommodityClassService {

    @Autowired
    IMallCommodityClassDao iMallCommodityClassDao;

    @Override
    public IPage<MallCommodityClass> selectByPage(int start, int size) {
        Page<MallCommodityClass> page = new Page<>(start, size);
        iMallCommodityClassDao.selectPage(page, null);
        return page;
    }
}