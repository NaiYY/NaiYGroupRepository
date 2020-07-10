package com.service.impl;

import com.pojo.QuoteProduct;
import com.dao.IQuoteProductDao;
import com.service.IQuoteProductService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class QuoteProductServiceImpl extends ServiceImpl<IQuoteProductDao, QuoteProduct> implements IQuoteProductService {
}