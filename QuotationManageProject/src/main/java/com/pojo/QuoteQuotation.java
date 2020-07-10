package com.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.sql.Date;

@TableName("quote_quotation")
public class QuoteQuotation  {
	@TableId(type = IdType.AUTO)
	private Integer quotationId;
	private Integer customerId;
	private Integer productcId;
	private String quotationMan;
	private Date quotationTime;
	private String otherInfo;

	public Integer getQuotationId() {
		return quotationId;
	}

	public void setQuotationId(Integer quotationId) {
		this.quotationId = quotationId;
	}

	public Integer getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}

	public Integer getProductcId() {
		return productcId;
	}

	public void setProductcId(Integer productcId) {
		this.productcId = productcId;
	}

	public String getQuotationMan() {
		return quotationMan;
	}

	public void setQuotationMan(String quotationMan) {
		this.quotationMan = quotationMan;
	}

	public Date getQuotationTime() {
		return quotationTime;
	}

	public void setQuotationTime(Date quotationTime) {
		this.quotationTime = quotationTime;
	}

	public String getOtherInfo() {
		return otherInfo;
	}

	public void setOtherInfo(String otherInfo) {
		this.otherInfo = otherInfo;
	}

}