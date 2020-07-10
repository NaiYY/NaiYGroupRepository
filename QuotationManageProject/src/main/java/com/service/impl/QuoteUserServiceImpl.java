package com.service.impl;

import com.pojo.QuoteUser;
import com.dao.IQuoteUserDao;
import com.service.IQuoteUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class QuoteUserServiceImpl extends ServiceImpl<IQuoteUserDao, QuoteUser> implements IQuoteUserService {
}