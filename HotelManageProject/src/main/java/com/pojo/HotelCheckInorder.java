package com.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.sql.Timestamp;

@TableName("hotel_check_inorder")
public class HotelCheckInorder  {
	@TableId(type = IdType.AUTO)
	private Integer checkInorderId;
	private String checkInorderGuestName;
	private Integer checkInorderManNumber;
	private String checkInorderGuestCatalog;
	private String checkInorderGuestType;
	private String checkInorderGroupName;
	private String checkInorderGuestCardCatalog;
	private String checkInorderGuestCardId;
	private String checkInorderCause;
	private String checkInorderState;
	private Timestamp checkInorderInDatetime;
	private Timestamp checkInorderPreOutDatetime;
	private Timestamp checkInorderPrcOutDatetime;
	private String checkInorderPaymentModel;
	private Double checkInorderPaidMoney;
	private String checkInorderIsReservid;
	private String checkInorderOperator;
	private String checkInorderGuestSex;
	private Double checkInorderTotalRate;
	private Double checkInorderBedRate;
	private Integer checkInorderOrderId;

	public Integer getCheckInorderId() {
		return checkInorderId;
	}

	public void setCheckInorderId(Integer checkInorderId) {
		this.checkInorderId = checkInorderId;
	}

	public String getCheckInorderGuestName() {
		return checkInorderGuestName;
	}

	public void setCheckInorderGuestName(String checkInorderGuestName) {
		this.checkInorderGuestName = checkInorderGuestName;
	}

	public Integer getCheckInorderManNumber() {
		return checkInorderManNumber;
	}

	public void setCheckInorderManNumber(Integer checkInorderManNumber) {
		this.checkInorderManNumber = checkInorderManNumber;
	}

	public String getCheckInorderGuestCatalog() {
		return checkInorderGuestCatalog;
	}

	public void setCheckInorderGuestCatalog(String checkInorderGuestCatalog) {
		this.checkInorderGuestCatalog = checkInorderGuestCatalog;
	}

	public String getCheckInorderGuestType() {
		return checkInorderGuestType;
	}

	public void setCheckInorderGuestType(String checkInorderGuestType) {
		this.checkInorderGuestType = checkInorderGuestType;
	}

	public String getCheckInorderGroupName() {
		return checkInorderGroupName;
	}

	public void setCheckInorderGroupName(String checkInorderGroupName) {
		this.checkInorderGroupName = checkInorderGroupName;
	}

	public String getCheckInorderGuestCardCatalog() {
		return checkInorderGuestCardCatalog;
	}

	public void setCheckInorderGuestCardCatalog(String checkInorderGuestCardCatalog) {
		this.checkInorderGuestCardCatalog = checkInorderGuestCardCatalog;
	}

	public String getCheckInorderGuestCardId() {
		return checkInorderGuestCardId;
	}

	public void setCheckInorderGuestCardId(String checkInorderGuestCardId) {
		this.checkInorderGuestCardId = checkInorderGuestCardId;
	}

	public String getCheckInorderCause() {
		return checkInorderCause;
	}

	public void setCheckInorderCause(String checkInorderCause) {
		this.checkInorderCause = checkInorderCause;
	}

	public String getCheckInorderState() {
		return checkInorderState;
	}

	public void setCheckInorderState(String checkInorderState) {
		this.checkInorderState = checkInorderState;
	}

	public Timestamp getCheckInorderInDatetime() {
		return checkInorderInDatetime;
	}

	public void setCheckInorderInDatetime(Timestamp checkInorderInDatetime) {
		this.checkInorderInDatetime = checkInorderInDatetime;
	}

	public Timestamp getCheckInorderPreOutDatetime() {
		return checkInorderPreOutDatetime;
	}

	public void setCheckInorderPreOutDatetime(Timestamp checkInorderPreOutDatetime) {
		this.checkInorderPreOutDatetime = checkInorderPreOutDatetime;
	}

	public Timestamp getCheckInorderPrcOutDatetime() {
		return checkInorderPrcOutDatetime;
	}

	public void setCheckInorderPrcOutDatetime(Timestamp checkInorderPrcOutDatetime) {
		this.checkInorderPrcOutDatetime = checkInorderPrcOutDatetime;
	}

	public String getCheckInorderPaymentModel() {
		return checkInorderPaymentModel;
	}

	public void setCheckInorderPaymentModel(String checkInorderPaymentModel) {
		this.checkInorderPaymentModel = checkInorderPaymentModel;
	}

	public Double getCheckInorderPaidMoney() {
		return checkInorderPaidMoney;
	}

	public void setCheckInorderPaidMoney(Double checkInorderPaidMoney) {
		this.checkInorderPaidMoney = checkInorderPaidMoney;
	}

	public String getCheckInorderIsReservid() {
		return checkInorderIsReservid;
	}

	public void setCheckInorderIsReservid(String checkInorderIsReservid) {
		this.checkInorderIsReservid = checkInorderIsReservid;
	}

	public String getCheckInorderOperator() {
		return checkInorderOperator;
	}

	public void setCheckInorderOperator(String checkInorderOperator) {
		this.checkInorderOperator = checkInorderOperator;
	}

	public String getCheckInorderGuestSex() {
		return checkInorderGuestSex;
	}

	public void setCheckInorderGuestSex(String checkInorderGuestSex) {
		this.checkInorderGuestSex = checkInorderGuestSex;
	}

	public Double getCheckInorderTotalRate() {
		return checkInorderTotalRate;
	}

	public void setCheckInorderTotalRate(Double checkInorderTotalRate) {
		this.checkInorderTotalRate = checkInorderTotalRate;
	}

	public Double getCheckInorderBedRate() {
		return checkInorderBedRate;
	}

	public void setCheckInorderBedRate(Double checkInorderBedRate) {
		this.checkInorderBedRate = checkInorderBedRate;
	}

	public Integer getCheckInorderOrderId() {
		return checkInorderOrderId;
	}

	public void setCheckInorderOrderId(Integer checkInorderOrderId) {
		this.checkInorderOrderId = checkInorderOrderId;
	}

}