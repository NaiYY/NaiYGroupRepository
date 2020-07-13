package com.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.pojo.MallUser;

public interface IMallUserService extends IService<MallUser> {
    IPage<MallUser> selectByPage(int start, int size);
}