package com.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.pojo.QuoteUser;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface IQuoteUserDao extends BaseMapper<QuoteUser> {
}