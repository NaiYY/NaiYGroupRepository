package com.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.pojo.MallCommodity;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface IMallCommodityDao extends BaseMapper<MallCommodity> {
}