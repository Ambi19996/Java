package com.bridgelab.model;

import com.bridgelab.utility.Utility;

public class Itemsaddress {
	private String name;
	private String address;
	private String city;
	private String state;
	private long zippost;
	private long phone;

	public void alldetails() {
		System.out.println("Enter the Name ");
		this.name = Utility.inputString();
		System.out.println("Enter the Address ");
		this.address = Utility.inputString();
		System.out.println("Enter the City ");
		this.city = Utility.inputString();
		System.out.println("Enter the State");
		this.state = Utility.inputString();
		System.out.println("Enter the Zippost ");
		this.zippost = Utility.inputlong();
		System.out.println("Enter the phonenumber ");
		this.phone = Utility.inputlong();
	}

	public String getname() {
		return name;
	}

	public void setname(String name) {
		this.name = name;
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

	public long getZippost() {
		return zippost;
	}

	public void setZippost(int zippost) {
		this.zippost = zippost;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}

}
