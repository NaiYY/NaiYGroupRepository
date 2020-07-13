package com.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.dao.IMallUserDao;
import com.pojo.MallUser;
import com.service.IMallUserService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class MallUserServiceImpl extends ServiceImpl<IMallUserDao, MallUser> implements IMallUserService {
}