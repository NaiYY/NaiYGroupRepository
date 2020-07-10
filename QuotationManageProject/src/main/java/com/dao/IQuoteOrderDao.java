package com.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.pojo.QuoteOrder;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface IQuoteOrderDao extends BaseMapper<QuoteOrder> {
}