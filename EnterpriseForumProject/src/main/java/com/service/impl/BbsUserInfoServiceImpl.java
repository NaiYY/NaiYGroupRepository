package com.service.impl;

import com.pojo.BbsUserInfo;
import com.dao.IBbsUserInfoDao;
import com.service.IBbsUserInfoService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class BbsUserInfoServiceImpl extends ServiceImpl<IBbsUserInfoDao, BbsUserInfo> implements IBbsUserInfoService {
}