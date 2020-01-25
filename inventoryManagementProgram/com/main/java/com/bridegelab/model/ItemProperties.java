package com.bridegelab.model;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.bridgelab.utility.Utility;

public class ItemProperties {
	
	private String name;
	private double weight,price;	
	BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));

	public void provider() throws IOException {
		System.out.println("Enter the name ");
		this.name=bf.readLine();
		System.out.println("Enter the weight ");
		this.weight=Utility.inputdouble();
		System.out.println("Enter the price ");
		this.price=Utility.inputdouble();
	}
	
	public String getName() {
		return name;
		
	}
	public void setname(String name) {
		this.name=name;
	}
	
	public double getWeight() {
		return weight;
		
	}
	
	public void setweight(double weight) {
		
	this.weight=weight;
	}
	
	public double getPrice() {
		return price;	
	}
	
	public void setprice(double price) {
		this.price=price;
	}
	
	

}
