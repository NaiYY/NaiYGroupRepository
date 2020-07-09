package com.service.impl;

import com.pojo.BbsSectionInfo;
import com.dao.IBbsSectionInfoDao;
import com.service.IBbsSectionInfoService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class BbsSectionInfoServiceImpl extends ServiceImpl<IBbsSectionInfoDao, BbsSectionInfo> implements IBbsSectionInfoService {
}