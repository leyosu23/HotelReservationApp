package com.spring.boot;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;
import javax.persistence.ManyToOne;

@Entity
@Table(name="reservation")
public class Reservation {
	
	

	@Id
	@Column(name="reservationid")
	private int reservationId;
	@Column(name="totalnights")
	private int totalNights;

	@Column(name="totalguest")
	private int totalGuest;
    

	@ManyToOne
	@JoinColumn(name="custid")
	private Customer custId;
	
	@Column(name="roomid")
	private int roomId;
	
	public int getRoomId() {
		return roomId;
	}

	public void setRoomId(int roomId) {
		this.roomId = roomId;
	}

	public Customer getCustId() {
		return custId;
	}

	public void setCustId(Customer custId) {
		this.custId = custId;
	}

	public int getReservationId() {
		return reservationId;
	}

	public void setReservationId(int reservationId) {
		this.reservationId = reservationId;
	}

	public int getTotalNights() {
		return totalNights;
	}

	public void setTotalNights(int totalNights) {
		this.totalNights = totalNights;
	}

	public int getTotalGuest() {
		return totalGuest;
	}

	public void setTotalGuest(int totalGuest) {
		this.totalGuest = totalGuest;
	}
	
	public Reservation()
	{
		
	}
	

	public Reservation(int totalNights, int totalGuest, Customer custId, int roomId) {
		super();
		this.roomId = roomId;
		this.totalNights = totalNights;
		this.totalGuest = totalGuest;
		this.custId = custId;
	}

	public Reservation(int reservationId , int totalNights, int totalGuest, Customer custId, int roomId) {
		super();
		this.reservationId = reservationId;
		this.totalNights = totalNights;
		this.totalGuest = totalGuest;
		this.custId = custId;
		this.roomId = roomId;
	}
	

	
}
