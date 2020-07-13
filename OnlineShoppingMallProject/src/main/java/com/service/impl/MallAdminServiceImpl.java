package com.service.impl;

import com.pojo.MallAdmin;
import com.dao.IMallAdminDao;
import com.service.IMallAdminService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class MallAdminServiceImpl extends ServiceImpl<IMallAdminDao, MallAdmin> implements IMallAdminService {

    @Autowired
    IMallAdminDao iMallAdminDao;

    @Override
    public int updatePassword(MallAdmin admin) {
        return iMallAdminDao.updatePassword(admin);
    }
}