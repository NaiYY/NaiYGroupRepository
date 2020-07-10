package com.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

@TableName("hotel_balance_ment")
public class HotelBalanceMent  {
	@TableId(type = IdType.AUTO)
	private Integer balanceId;
	private Integer balanceCheckInorderId;
	private Integer balanceGuestId;
	private String balanceType;

	public Integer getBalanceId() {
		return balanceId;
	}

	public void setBalanceId(Integer balanceId) {
		this.balanceId = balanceId;
	}

	public Integer getBalanceCheckInorderId() {
		return balanceCheckInorderId;
	}

	public void setBalanceCheckInorderId(Integer balanceCheckInorderId) {
		this.balanceCheckInorderId = balanceCheckInorderId;
	}

	public Integer getBalanceGuestId() {
		return balanceGuestId;
	}

	public void setBalanceGuestId(Integer balanceGuestId) {
		this.balanceGuestId = balanceGuestId;
	}

	public String getBalanceType() {
		return balanceType;
	}

	public void setBalanceType(String balanceType) {
		this.balanceType = balanceType;
	}

}