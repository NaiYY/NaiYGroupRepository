package com.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.pojo.QuoteQuotation;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface IQuoteQuotationDao extends BaseMapper<QuoteQuotation> {
}