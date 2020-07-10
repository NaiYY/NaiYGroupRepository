package com.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.sql.Timestamp;

@TableName("hotel_check_init_em")
public class HotelCheckInitEm  {
	@TableId(type = IdType.AUTO)
	private Integer checkInitEmId;
	private Integer checkInitEmOrderId;
	private Integer checkInitEmRoomId;
	private Double checkInitEmPrctPrice;
	private Double checkInitEmDiscount;
	private Timestamp checkInitEmInDatetime;
	private Timestamp checkInitEmOutDatetime;
	private String checkInitEmState;

	public Integer getCheckInitEmId() {
		return checkInitEmId;
	}

	public void setCheckInitEmId(Integer checkInitEmId) {
		this.checkInitEmId = checkInitEmId;
	}

	public Integer getCheckInitEmOrderId() {
		return checkInitEmOrderId;
	}

	public void setCheckInitEmOrderId(Integer checkInitEmOrderId) {
		this.checkInitEmOrderId = checkInitEmOrderId;
	}

	public Integer getCheckInitEmRoomId() {
		return checkInitEmRoomId;
	}

	public void setCheckInitEmRoomId(Integer checkInitEmRoomId) {
		this.checkInitEmRoomId = checkInitEmRoomId;
	}

	public Double getCheckInitEmPrctPrice() {
		return checkInitEmPrctPrice;
	}

	public void setCheckInitEmPrctPrice(Double checkInitEmPrctPrice) {
		this.checkInitEmPrctPrice = checkInitEmPrctPrice;
	}

	public Double getCheckInitEmDiscount() {
		return checkInitEmDiscount;
	}

	public void setCheckInitEmDiscount(Double checkInitEmDiscount) {
		this.checkInitEmDiscount = checkInitEmDiscount;
	}

	public Timestamp getCheckInitEmInDatetime() {
		return checkInitEmInDatetime;
	}

	public void setCheckInitEmInDatetime(Timestamp checkInitEmInDatetime) {
		this.checkInitEmInDatetime = checkInitEmInDatetime;
	}

	public Timestamp getCheckInitEmOutDatetime() {
		return checkInitEmOutDatetime;
	}

	public void setCheckInitEmOutDatetime(Timestamp checkInitEmOutDatetime) {
		this.checkInitEmOutDatetime = checkInitEmOutDatetime;
	}

	public String getCheckInitEmState() {
		return checkInitEmState;
	}

	public void setCheckInitEmState(String checkInitEmState) {
		this.checkInitEmState = checkInitEmState;
	}

}