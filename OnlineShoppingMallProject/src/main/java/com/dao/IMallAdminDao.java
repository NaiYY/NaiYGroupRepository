package com.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.pojo.MallAdmin;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface IMallAdminDao extends BaseMapper<MallAdmin> {
}