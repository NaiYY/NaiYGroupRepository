package com.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.sql.Timestamp;

@TableName("mall_order")
public class MallOrder  {
	@TableId(type = IdType.AUTO)
	private Integer orderId;
	private String orderNo;
	private Integer userId;
	private Timestamp orderSubmitTime;
	private Timestamp orderConsignmentTime;
	private Double orderTotalPrice;
	private String orderRemark;
	private String orderIpAddress;
	private Integer orderIsPayoff;
	private Integer orderIsConsignment;

	public Integer getOrderId() {
		return orderId;
	}

	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}

	public String getOrderNo() {
		return orderNo;
	}

	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Timestamp getOrderSubmitTime() {
		return orderSubmitTime;
	}

	public void setOrderSubmitTime(Timestamp orderSubmitTime) {
		this.orderSubmitTime = orderSubmitTime;
	}

	public Timestamp getOrderConsignmentTime() {
		return orderConsignmentTime;
	}

	public void setOrderConsignmentTime(Timestamp orderConsignmentTime) {
		this.orderConsignmentTime = orderConsignmentTime;
	}

	public Double getOrderTotalPrice() {
		return orderTotalPrice;
	}

	public void setOrderTotalPrice(Double orderTotalPrice) {
		this.orderTotalPrice = orderTotalPrice;
	}

	public String getOrderRemark() {
		return orderRemark;
	}

	public void setOrderRemark(String orderRemark) {
		this.orderRemark = orderRemark;
	}

	public String getOrderIpAddress() {
		return orderIpAddress;
	}

	public void setOrderIpAddress(String orderIpAddress) {
		this.orderIpAddress = orderIpAddress;
	}

	public Integer getOrderIsPayoff() {
		return orderIsPayoff;
	}

	public void setOrderIsPayoff(Integer orderIsPayoff) {
		this.orderIsPayoff = orderIsPayoff;
	}

	public Integer getOrderIsConsignment() {
		return orderIsConsignment;
	}

	public void setOrderIsConsignment(Integer orderIsConsignment) {
		this.orderIsConsignment = orderIsConsignment;
	}

}