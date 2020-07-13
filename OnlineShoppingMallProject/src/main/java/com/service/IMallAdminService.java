package com.service;

import com.pojo.MallAdmin;
import com.baomidou.mybatisplus.extension.service.IService;

public interface IMallAdminService extends IService<MallAdmin> {
    int updatePassword(MallAdmin admin);
}