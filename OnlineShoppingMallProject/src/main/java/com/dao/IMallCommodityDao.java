package com.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.pojo.MallCommodity;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface IMallCommodityDao extends BaseMapper<MallCommodity> {

    IPage<MallCommodity> queryCommPage(Page<?> page, int state);

    List<MallCommodity> queryCommByClazzId(int id);

    MallCommodity queryCommById(int id);

    int updateNum(MallCommodity commodity);

    int addCommodity(MallCommodity commodity);

    int updateCommodity(MallCommodity commodity);
}