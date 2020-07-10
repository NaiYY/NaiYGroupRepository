package com.service.impl;

import com.pojo.QuoteCustomer;
import com.dao.IQuoteCustomerDao;
import com.service.IQuoteCustomerService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class QuoteCustomerServiceImpl extends ServiceImpl<IQuoteCustomerDao, QuoteCustomer> implements IQuoteCustomerService {
}