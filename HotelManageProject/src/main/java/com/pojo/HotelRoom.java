package com.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

@TableName("hotel_room")
public class HotelRoom  {
	@TableId(type = IdType.AUTO)
	private Integer roomId;
	private String roomArea;
	private String roomFloor;
	private Double roomPrctPrice;
	private String roomTelephone;
	private Integer roomState;
	private Integer roomAvalable;
	private String roomCatalog;
	private String roomPicture;
	private Double roomPrctDiscount;

	public Integer getRoomId() {
		return roomId;
	}

	public void setRoomId(Integer roomId) {
		this.roomId = roomId;
	}

	public String getRoomArea() {
		return roomArea;
	}

	public void setRoomArea(String roomArea) {
		this.roomArea = roomArea;
	}

	public String getRoomFloor() {
		return roomFloor;
	}

	public void setRoomFloor(String roomFloor) {
		this.roomFloor = roomFloor;
	}

	public Double getRoomPrctPrice() {
		return roomPrctPrice;
	}

	public void setRoomPrctPrice(Double roomPrctPrice) {
		this.roomPrctPrice = roomPrctPrice;
	}

	public String getRoomTelephone() {
		return roomTelephone;
	}

	public void setRoomTelephone(String roomTelephone) {
		this.roomTelephone = roomTelephone;
	}

	public Integer getRoomState() {
		return roomState;
	}

	public void setRoomState(Integer roomState) {
		this.roomState = roomState;
	}

	public Integer getRoomAvalable() {
		return roomAvalable;
	}

	public void setRoomAvalable(Integer roomAvalable) {
		this.roomAvalable = roomAvalable;
	}

	public String getRoomCatalog() {
		return roomCatalog;
	}

	public void setRoomCatalog(String roomCatalog) {
		this.roomCatalog = roomCatalog;
	}

	public String getRoomPicture() {
		return roomPicture;
	}

	public void setRoomPicture(String roomPicture) {
		this.roomPicture = roomPicture;
	}

	public Double getRoomPrctDiscount() {
		return roomPrctDiscount;
	}

	public void setRoomPrctDiscount(Double roomPrctDiscount) {
		this.roomPrctDiscount = roomPrctDiscount;
	}

}