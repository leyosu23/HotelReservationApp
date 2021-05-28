package com.spring.boot;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="hotel")
public class Hotel {

	@Id
	@Column(name="roomid")
	private int roomId;
	@Column(name="roomtype")
	private String roomType;
	@Column(name="price")
	private double price;
    
	
	public int getroomId() {
		return roomId;
	}

	public void setroomId(int roomId) {
		this.roomId = roomId;
	}

	public String getRoomType() {
		return roomType;
	}

	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	
	public Hotel()
	{}
    
	public Hotel(String roomType, double price) {
		super();
		this.roomType = roomType;
		this.price = price;
	}
	



}
