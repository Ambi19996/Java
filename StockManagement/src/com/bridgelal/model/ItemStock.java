package com.bridgelal.model;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.swing.text.Utilities;

import com.bridgelab.Utility.Utility;

public class ItemStock {
	private String StockNames;
	private double NumberofShare;
	private double SharePrice;
	BufferedReader file = new BufferedReader(new InputStreamReader(System.in));

	public void provider() throws IOException {
		System.out.println("Enter the name of the stock");
		this.StockNames = file.readLine();
		System.out.println("Enter the number of the share");
		this.NumberofShare = Utility.inputinteger();
		System.out.println("Enter the price of the share");
		this.SharePrice = Utility.inputinteger();
	}

	public String getStockNames() {
		return StockNames;
	}

	public void setStockNames(String stockNames) {
		StockNames = stockNames;
	}

	public double getNumberofShare() {
		return NumberofShare;
	}

	public void setNumberofShare(double numberofShare) {
		NumberofShare = numberofShare;
	}

	public double getSharePrice() {
		return SharePrice;
	}

	public void setSharePrice(double sharePrice) {
		SharePrice = sharePrice;
	}

}
