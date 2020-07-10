package com.service.impl;

import com.pojo.QuoteQuotation;
import com.dao.IQuoteQuotationDao;
import com.service.IQuoteQuotationService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class QuoteQuotationServiceImpl extends ServiceImpl<IQuoteQuotationDao, QuoteQuotation> implements IQuoteQuotationService {
}