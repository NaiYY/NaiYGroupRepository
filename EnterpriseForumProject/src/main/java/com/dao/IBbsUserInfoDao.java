package com.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.pojo.BbsUserInfo;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface IBbsUserInfoDao extends BaseMapper<BbsUserInfo> {
}