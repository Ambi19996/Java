package com.bridgelab.model;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.bridgelab.Utility.Utility;

public class Itemaccounts {

	private String nameofshare;
	private double numberOfShares;
	private double SharePrice;
	BufferedReader file = new BufferedReader(new InputStreamReader(System.in));

	public void setting() throws IOException {
		
		System.out.println("Enter the name of the stock");
		this.nameofshare = file.readLine();
		System.out.println("Enter the number of the share");
		this.numberOfShares = Utility.inputinteger();
		System.out.println("Enter the price of the share");
		this.SharePrice = Utility.inputinteger();
			}

	public String getnameofshare() {
		return nameofshare;
	}

	public void setnameofshare(String nameofshare) {
		nameofshare = nameofshare;
	}

	public double getnumberOfShares() {
		return numberOfShares;
	}

	public void setnumberOfShares(double numberOfShares) {
		numberOfShares = numberOfShares;
	}

	public double getsharePrice() {
		return SharePrice;
	}

	public void setsharePrice(double SharePrice) {
		SharePrice = SharePrice;
	}

	
	

}
