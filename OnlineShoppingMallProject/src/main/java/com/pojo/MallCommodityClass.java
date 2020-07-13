package com.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

@TableName("mall_commodity_class")
public class MallCommodityClass  {
	@TableId(type = IdType.AUTO)
	private Integer commodityClassId;
	private String commodityClassName;

	public Integer getCommodityClassId() {
		return commodityClassId;
	}

	public void setCommodityClassId(Integer commodityClassId) {
		this.commodityClassId = commodityClassId;
	}

	public String getCommodityClassName() {
		return commodityClassName;
	}

	public void setCommodityClassName(String commodityClassName) {
		this.commodityClassName = commodityClassName;
	}

}