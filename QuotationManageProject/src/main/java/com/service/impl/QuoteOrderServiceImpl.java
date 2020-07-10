package com.service.impl;

import com.pojo.QuoteOrder;
import com.dao.IQuoteOrderDao;
import com.service.IQuoteOrderService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class QuoteOrderServiceImpl extends ServiceImpl<IQuoteOrderDao, QuoteOrder> implements IQuoteOrderService {
}