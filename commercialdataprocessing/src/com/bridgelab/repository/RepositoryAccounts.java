package com.bridgelab.repository;



import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.security.cert.TrustAnchor;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import com.bridgelab.Utility.Utility;
import com.bridgelab.model.Itemaccounts;


public class RepositoryAccounts {
	FileWriter fw;
	PrintWriter pw;
	JSONObject obj = new JSONObject();
	JSONArray list = new JSONArray();
	private int user;
	
	public void add(String path, Itemaccounts item) {
		try {
			File fr = new File(path);
			if (fr.length() != 0) {
				try {
					list = (JSONArray) new JSONParser().parse(new FileReader(path));

				} catch (Exception e) {
					System.out.println(e);

				}
			}
			obj.put("nameofshare", ((Itemaccounts) item).getnameofshare());
			obj.put("NumberofShare", ((Itemaccounts) item).getnumberOfShares());
			obj.put("SharePrice", ((Itemaccounts) item).getsharePrice());

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
		double totalValue=0.0;

		try {

			FileReader fr = new FileReader(path);
			
			Object ob = parser.parse(fr);
			
			JSONArray st = new JSONArray();
			st = (JSONArray) ob;
			
			System.out.println("SIZE:"+st.size());
			for (int i = 0; i < st.size(); i++) {
				
				JSONObject object = (JSONObject) st.get(i);
				System.out.println(" " + object.get("NumberofShare"));
				total = (double) (object.get("NumberofShare")) * (double) (object.get("SharePrice"));

				System.out.println(object);
				
				System.out.println(object.get("nameofshare") + "\n" + object.get("NumberofShare") + "\n"
						+ object.get("SharePrice"));
				
				System.out.println(" individual share is : " + total);
											
				double NumberofShare=(double)object.get("NumberofShare");
				double SharePrice=(double)object.get("SharePrice");
				totalValue=(totalValue+(NumberofShare*SharePrice));
			}
			System.out.println("total stock is: " + totalValue);

		} catch (Exception e) {

			System.out.println(e);
		}
	
	}

	public void delete(String path, String sharename) {
		JSONObject obj = new JSONObject();
		JSONArray list=null;
		try {
		list = (JSONArray)new JSONParser().parse(new FileReader(path));}
		catch(Exception e) {System.out.println(e);}
		try {
			for (int i = 0; i < list.size(); i++) 
			{
				obj=(JSONObject) list.get(i);
				 String nameFile=(String) obj.get("nameofshare");
				
				if (nameFile.equals(sharename)) {

					list.remove(obj);
					break;
				}
			}
			FileWriter fw = new FileWriter(path);
			PrintWriter pw = new PrintWriter(fw);
			//list.add(obj);
			pw.println(list.toString());
			fw.close();
			pw.close();
		} catch (Exception e) {
			System.out.println(e);
		}	


	
	}

	public void update(String path, double numberOfShares, double sharePrice, String sharename1) {
		JSONObject obj = new JSONObject();
		JSONArray list=null;
		try {
			list=(JSONArray)new JSONParser().parse(new FileReader(path));
			
		} catch (Exception e) {
			System.out.println(e);
		
		}
		try {
			
			for (int i = 0; i < list.size(); i++) {
			obj=(JSONObject)list.get(i);
			
			if (sharename1.equalsIgnoreCase((String) obj.get("StockNames"))) {
				if (numberOfShares > -1) {

					obj.put("NumberofShare", numberOfShares);

				}
				
				if (sharePrice>-1) {
					obj.put("sharePrice", sharePrice);					
				}
			}
			list.add(obj);
			}
			
			FileWriter fw = new FileWriter(path);
			PrintWriter pw = new PrintWriter(fw);
			//list.add(obj);
			pw.println(list.toString());
			fw.close();
			pw.close();
			
		} catch (Exception e) {
			System.out.println(e);
		}
		
	}}
	

	
	
		
	

	


	

