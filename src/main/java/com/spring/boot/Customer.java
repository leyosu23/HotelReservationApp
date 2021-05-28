package com.spring.boot;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.OneToMany;

@Entity
@Table(name="customer")
public class Customer {
	
	@Id
	@Column(name="custid")
	private int custId;
	@Column(name="username")
	private String userName;
	@Column(name="email")
	private String email;
	@Column(name="pw")
	private String pw;
	@Column(name="firstname")
	private String firstname;
	@Column(name="lastname")
	private String lastname;
	@Column(name="phonenumber")
	private String phoneNumber;
	@Column(name="address")
	private String address;
	@Column(name="city")
	private String city;
	@Column(name="postalcode")
	private String postalCode;
	@Column(name="country")
	private String country;
    
	@OneToMany(mappedBy="custId")
	private List<Reservation> reservations = new ArrayList<Reservation>();
	
	
	public Customer()
	{
		
	}
	
	//edit
	public Customer(int custId, String userName, String pw, String email, String firstname, String lastname,
			String phoneNumber, String address, String city, String postalCode, String country) {
		super();
		this.custId = custId;
		this.userName = userName;
		this.email = email;
		this.pw = pw;
		this.firstname = firstname;
		this.lastname = lastname;
		this.phoneNumber = phoneNumber;
		this.address = address;
		this.city = city;
		this.postalCode = postalCode;
		this.country = country;
	}


	//registration
	public Customer(String userName, String pw, String email, String firstname, String lastname,
			String phoneNumber, String address, String city, String postalCode, String country) {
		// TODO Auto-generated constructor stub
		this.userName = userName;
		this.email = email;
		this.pw = pw;
		this.firstname = firstname;
		this.lastname = lastname;
		this.phoneNumber = phoneNumber;
		this.address = address;
		this.city = city;
		this.postalCode = postalCode;
		this.country = country;
	}


	public int getCustId() {
		return custId;
	}

	public void setCustId(int custId) {
		this.custId = custId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
	
	@Override
	public String toString() {
		return "Customer [custId=" + custId + ", userName=" + userName + ", email=" + email + ", pw=" + pw
				+ ", firstname=" + firstname + ", lastname=" + lastname + ", phoneNumber=" + phoneNumber + ", address="
				+ address + ", city=" + city + ", postalCode=" + postalCode + ", country=" + country + "]";
	}

}
