package com.service.impl;

import com.pojo.QuoteProducttype;
import com.dao.IQuoteProducttypeDao;
import com.service.IQuoteProducttypeService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class QuoteProducttypeServiceImpl extends ServiceImpl<IQuoteProducttypeDao, QuoteProducttype> implements IQuoteProducttypeService {
}