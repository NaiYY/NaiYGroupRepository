package com.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.dao.IMallUserDao;
import com.pojo.MallUser;
import com.service.IMallUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class MallUserServiceImpl extends ServiceImpl<IMallUserDao, MallUser> implements IMallUserService {
    @Autowired
    IMallUserDao iMallUserDao;

    @Override
    public IPage<MallUser> selectByPage(int start, int size) {
        Page<MallUser> page = new Page<>(start, size);
        iMallUserDao.selectPage(page, null);
        return page;
    }
}