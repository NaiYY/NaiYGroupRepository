package com.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.sql.Date;

@TableName("quote_producttype")
public class QuoteProducttype  {
	@TableId(type = IdType.AUTO)
	private Integer producttypeId;
	private String producttypeName;

	public Integer getProducttypeId() {
		return producttypeId;
	}

	public void setProducttypeId(Integer producttypeId) {
		this.producttypeId = producttypeId;
	}

	public String getProducttypeName() {
		return producttypeName;
	}

	public void setProducttypeName(String producttypeName) {
		this.producttypeName = producttypeName;
	}

}