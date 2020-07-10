package com.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.sql.Date;

@TableName("hotel_guest")
public class HotelGuest  {
	@TableId(type = IdType.AUTO)
	private Integer guestId;
	private String guestName;
	private String guestType;
	private String guestCard;
	private String guestCountry;
	private String guestAddress;
	private String guestZip;
	private String guestCompany;
	private String guestTelephone;
	private String guestMobile;
	private String guestSex;
	private String guestEmail;
	private Date guestCreateTime;

	public Integer getGuestId() {
		return guestId;
	}

	public void setGuestId(Integer guestId) {
		this.guestId = guestId;
	}

	public String getGuestName() {
		return guestName;
	}

	public void setGuestName(String guestName) {
		this.guestName = guestName;
	}

	public String getGuestType() {
		return guestType;
	}

	public void setGuestType(String guestType) {
		this.guestType = guestType;
	}

	public String getGuestCard() {
		return guestCard;
	}

	public void setGuestCard(String guestCard) {
		this.guestCard = guestCard;
	}

	public String getGuestCountry() {
		return guestCountry;
	}

	public void setGuestCountry(String guestCountry) {
		this.guestCountry = guestCountry;
	}

	public String getGuestAddress() {
		return guestAddress;
	}

	public void setGuestAddress(String guestAddress) {
		this.guestAddress = guestAddress;
	}

	public String getGuestZip() {
		return guestZip;
	}

	public void setGuestZip(String guestZip) {
		this.guestZip = guestZip;
	}

	public String getGuestCompany() {
		return guestCompany;
	}

	public void setGuestCompany(String guestCompany) {
		this.guestCompany = guestCompany;
	}

	public String getGuestTelephone() {
		return guestTelephone;
	}

	public void setGuestTelephone(String guestTelephone) {
		this.guestTelephone = guestTelephone;
	}

	public String getGuestMobile() {
		return guestMobile;
	}

	public void setGuestMobile(String guestMobile) {
		this.guestMobile = guestMobile;
	}

	public String getGuestSex() {
		return guestSex;
	}

	public void setGuestSex(String guestSex) {
		this.guestSex = guestSex;
	}

	public String getGuestEmail() {
		return guestEmail;
	}

	public void setGuestEmail(String guestEmail) {
		this.guestEmail = guestEmail;
	}

	public Date getGuestCreateTime() {
		return guestCreateTime;
	}

	public void setGuestCreateTime(Date guestCreateTime) {
		this.guestCreateTime = guestCreateTime;
	}

}