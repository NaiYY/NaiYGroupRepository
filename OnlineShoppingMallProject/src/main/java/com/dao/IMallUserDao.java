package com.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.pojo.MallUser;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface IMallUserDao extends BaseMapper<MallUser> {
}