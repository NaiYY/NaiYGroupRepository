package com.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

@TableName("hotel_room_info")
public class HotelRoomInfo  {
	@TableId(type = IdType.AUTO)
	private Integer roomInfoId;
	private String roomInfoName;
	private Integer roomInfoNumber;
	private Double roomInfoPrePrice;
	private Double roomInfoPreDiscount;
	private Double roomInfoHourBasePrice;
	private Double roomInfoHourPrice;

	public Integer getRoomInfoId() {
		return roomInfoId;
	}

	public void setRoomInfoId(Integer roomInfoId) {
		this.roomInfoId = roomInfoId;
	}

	public String getRoomInfoName() {
		return roomInfoName;
	}

	public void setRoomInfoName(String roomInfoName) {
		this.roomInfoName = roomInfoName;
	}

	public Integer getRoomInfoNumber() {
		return roomInfoNumber;
	}

	public void setRoomInfoNumber(Integer roomInfoNumber) {
		this.roomInfoNumber = roomInfoNumber;
	}

	public Double getRoomInfoPrePrice() {
		return roomInfoPrePrice;
	}

	public void setRoomInfoPrePrice(Double roomInfoPrePrice) {
		this.roomInfoPrePrice = roomInfoPrePrice;
	}

	public Double getRoomInfoPreDiscount() {
		return roomInfoPreDiscount;
	}

	public void setRoomInfoPreDiscount(Double roomInfoPreDiscount) {
		this.roomInfoPreDiscount = roomInfoPreDiscount;
	}

	public Double getRoomInfoHourBasePrice() {
		return roomInfoHourBasePrice;
	}

	public void setRoomInfoHourBasePrice(Double roomInfoHourBasePrice) {
		this.roomInfoHourBasePrice = roomInfoHourBasePrice;
	}

	public Double getRoomInfoHourPrice() {
		return roomInfoHourPrice;
	}

	public void setRoomInfoHourPrice(Double roomInfoHourPrice) {
		this.roomInfoHourPrice = roomInfoHourPrice;
	}

}