package com.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.pojo.MallAdmin;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface IMallAdminDao extends BaseMapper<MallAdmin> {

    int updatePassword(MallAdmin admin);
}