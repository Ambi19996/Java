package com.bridgelab.controller;

import java.io.IOException;

import org.json.simple.parser.ParseException;

import com.bridgelab.Utility.Utility;
import com.bridgelab.repository.RepositoryStock;
import com.bridgelal.model.ItemStock;

public class MainStock {
	public static void main(String[] args) throws IOException, ParseException {
		String path = "/home/user/eclipse-workspace/StockManagement/src/com/bridgelab/controller/stocksrc.json";

		System.out.println("enter the 1 to add or 0 to display");
		int choose = Utility.inputinteger();
		ItemStock item = new ItemStock();
		RepositoryStock rep = new RepositoryStock();
		System.out.println(choose);

		if (choose == 1) {
			item.provider();
			rep.add(path, item);
			rep.display(path);
		} else if (choose == 0) {

			rep.display(path);
		}

		else {
			System.out.println("Invalid ");
		}
	}
}
