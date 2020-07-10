package com.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.pojo.QuoteProduct;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface IQuoteProductDao extends BaseMapper<QuoteProduct> {
}