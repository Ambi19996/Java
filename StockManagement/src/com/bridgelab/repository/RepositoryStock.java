package com.bridgelab.repository;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import com.bridgelal.model.ItemStock;

public class RepositoryStock {

	FileWriter fw;
	PrintWriter pw;
	JSONObject obj = new JSONObject();
	JSONArray list = new JSONArray();

	public void add(String path, ItemStock item) {
		try {
			File fr = new File(path);
			if (fr.length() != 0) {
				try {
					list = (JSONArray) new JSONParser().parse(new FileReader(path));

				} catch (Exception e) {
					System.out.println(e);

				}
			}
			obj.put("StockNames", ((ItemStock) item).getStockNames());
			obj.put("NumberofShare", ((ItemStock) item).getNumberofShare());
			obj.put("SharePrice", ((ItemStock) item).getSharePrice());

			FileWriter fw = new FileWriter(path);
			PrintWriter pw = new PrintWriter(fw);
			list.add(obj);
			pw.println(list.toString());
			fw.close();
			pw.close();
		} catch (Exception e) {
			System.out.println(e);
		}

	}

	public void display(String path) {

		JSONParser parser = new JSONParser();

		double total;
//		double sum;
		try {

			FileReader fr = new FileReader(path);
			Object ob = parser.parse(fr);
			JSONArray st = new JSONArray();
			st = (JSONArray) ob;

			for (int i = 0; i < st.size(); i++) {
				JSONObject object = (JSONObject) st.get(i);
				total = (double) (object.get("NumberofShare")) * (double) (object.get("SharePrice"));

				System.out.println(object);
				System.out.println(object.get("StockNames") + "\n" + object.get("NumberofShare") + "\n"
						+ object.get("SharePrice"));
				System.out.println(" individual share is : " + total);
				total = total+ (double) (object.get("NumberofShare")) * (double) (object.get("SharePrice"));

				System.out.println("enter the 3 company is : " + total);
			}

		} catch (Exception e) {

			System.out.println(e);
		}

	}

}
