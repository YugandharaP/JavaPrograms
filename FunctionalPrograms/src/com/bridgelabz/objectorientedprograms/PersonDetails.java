package com.bridgelabz.objectorientedprograms;

import java.io.Serializable;

/**
 * @author yuga
 *
 */
@SuppressWarnings("serial")
public class PersonDetails implements Serializable {
	private String firstName;
	private String lastName;
	private String address;
	private String city;
	private String state;
	private long zipCode;
	private long phoneNum;
	public PersonDetails(String firstName, String lastName, String address, String city, String state, long zipCode,
			long phoneNum) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.city = city;
		this.state = state;
		this.zipCode = zipCode;
		this.phoneNum = phoneNum;
	}
	public PersonDetails() {
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
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
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public long getZipCode() {
		return zipCode;
	}
	public void setZipCode(long zipCode) {
		this.zipCode = zipCode;
	}
	public long getPhoneNum() {
		return phoneNum;
	}
	public void setPhoneNum(long phoneNum) {
		this.phoneNum = phoneNum;
	}

}
