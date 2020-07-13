package com.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.dao.IMallCommodityDao;
import com.pojo.MallCommodity;
import com.service.IMallCommodityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class MallCommodityServiceImpl extends ServiceImpl<IMallCommodityDao, MallCommodity> implements IMallCommodityService {

    @Autowired
    IMallCommodityDao iMallCommodityDao;

    @Override
    public IPage<MallCommodity> queryCommPage(Page<MallCommodity> page, int state) {
        page.setOptimizeCountSql(false);
        return iMallCommodityDao.queryCommPage(page, state);
    }

    @Override
    public List<MallCommodity> queryCommByClazzId(int id) {
        return iMallCommodityDao.queryCommByClazzId(id);
    }

    @Override
    public MallCommodity queryCommById(int id) {
        return iMallCommodityDao.queryCommById(id);
    }

    @Override
    public int updateNum(MallCommodity commodity) {
        return iMallCommodityDao.updateNum(commodity);
    }

    @Override
    public int addCommodity(MallCommodity commodity) {
        return iMallCommodityDao.addCommodity(commodity);
    }

    @Override
    public int updateCommodity(MallCommodity commodity) {
        return iMallCommodityDao.updateCommodity(commodity);
    }
}