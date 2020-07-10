package com.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.pojo.QuoteCustomer;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface IQuoteCustomerDao extends BaseMapper<QuoteCustomer> {
}