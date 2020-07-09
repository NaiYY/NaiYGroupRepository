package com.service.impl;

import com.pojo.BbsTopicInfo;
import com.dao.IBbsTopicInfoDao;
import com.service.IBbsTopicInfoService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class BbsTopicInfoServiceImpl extends ServiceImpl<IBbsTopicInfoDao, BbsTopicInfo> implements IBbsTopicInfoService {
}