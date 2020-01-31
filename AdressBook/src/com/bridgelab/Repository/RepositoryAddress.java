package com.bridgelab.Repository;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.lang.reflect.Array;
import java.util.Arrays;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.bridgelab.model.Itemsaddress;

public class RepositoryAddress {

	FileWriter fw;
	PrintWriter pw;
	JSONObject obj = new JSONObject();
	JSONArray list = new JSONArray();
 // In the address book push  the details
	public void addperson(String path, Itemsaddress item) {

		try {
			File fr = new File(path);

			try {
			 list=(JSONArray)new JSONParser().parse(new FileReader(path));
			} catch (Exception e) {
				System.out.println(e);
			}
			obj.put("name", ((Itemsaddress) item).getname());
			obj.put("address", ((Itemsaddress) item).getAddress());
			obj.put("city", ((Itemsaddress) item).getCity());
			obj.put("state", ((Itemsaddress) item).getState());
			obj.put("zippost", ((Itemsaddress) item).getZippost());
			obj.put("phone", ((Itemsaddress) item).getPhone());

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
	// In the address book Visualizing the details
	public void display(String path) {
		JSONParser parser = new JSONParser();
		try {
			FileReader file = new FileReader(path);
			Object obj = parser.parse(file);
			JSONArray list = new JSONArray();
			list = (JSONArray) obj;

			for (int i = 0; i < list.size(); i++) {
				JSONObject object = (JSONObject) list.get(i);
				System.out.println(object);
				System.out.println(object.get("name") + "\n" + object.get("address") + "\n" + object.get("city") + "\n"
						+ object.get("state") + "\n" + object.get("zippost") + "\n" + object.get("phone"));
			}
		} catch (Exception e) {
			System.out.println(e);
		}

	}

	
	// In the address book delete the details
	public void removeperson(String path, String delete) {
    JSONArray list=null;
    JSONObject obj=new JSONObject();
    
    try {
    	list=(JSONArray)new JSONParser().parse(new FileReader(path));
    } catch (Exception e) {
		System.out.println(e);
	}
    	try {
			
		
    	for (int i = 0; i < list.size(); i++) {
    		obj=(JSONObject)list.get(i);
			String file=(String) obj.get("name");
			if (file.equalsIgnoreCase(delete)) {
				list.remove(obj);
			}
		}
    	FileWriter fw=new FileWriter(path);
    	PrintWriter pw=new PrintWriter(path);
//    	list.add(obj);
    	pw.println(list.toString());
    	fw.close();
    	pw.close();
		
	} catch (Exception e) {
		System.out.println(e);
	}
		
	}
// In the address book update the details
	public void updatedetails(String path, long phone, String address, String userupdate) {
		JSONObject object=new JSONObject();
		JSONArray list=null;
		JSONArray changeupdate=new JSONArray();
		
		try {
			list=(JSONArray)new JSONParser().parse(new FileReader(path));
		} catch (Exception e) {
		System.out.println(e);
		}
		try {
			for (int i = 0; i < list.size(); i++) {
				object=(JSONObject)list.get(i);
				String filename=(String)object.get("name");
				if (filename.equalsIgnoreCase(userupdate)) {
					if (phone>0) {
						object.put("phone", phone);
						
					}
					
					if (!address.equals(null)) {
						object.put("address", address);
						
					}
					
				}
				changeupdate.add(object);
				
			}
			FileWriter fw = new FileWriter(path);
			PrintWriter pw = new PrintWriter(fw);
			pw.println(changeupdate.toString());
			fw.close();
			pw.close();
			
		} catch (Exception e) {
			
      System.out.println(e);
		}
		
	}
	//sorting method
	public void sort(String path) throws FileNotFoundException, IOException, ParseException {
		JSONArray list=(JSONArray)new JSONParser().parse(new FileReader(path));
		JSONObject object=null;
		String[] str=new String[list.size()];
		JSONArray newlist=new JSONArray();
		try
		{
		 for (int i = 0; i < list.size(); i++) 
		 {
			 object=(JSONObject)list.get(i);
			str[i]=object.get("name").toString();
			
		}
		 Arrays.sort(str);
		 for (String dem:str) {
			System.out.println("hfjbckjc : " + dem);
		}
		 
		 
		 int ind=0;
		 for (int i = 0; i < str.length; i++)
		 {
			ind=0;
			
			for (int j = 0; j < list.size(); j++) 
			{
				JSONObject obj=(JSONObject)list.get(j);
				if (obj.get("name").toString().equalsIgnoreCase(str[i])==true) 
				{
					ind=j;	
				}	
			}
			newlist.add(list.get(ind));
		 }
		 
		
		 FileWriter fw = new FileWriter(path);
			PrintWriter pw = new PrintWriter(fw);
			pw.println(newlist.toString());
			pw.flush();
			fw.close();
			pw.close();
		 
		} catch (Exception e) {
			System.out.println(e);
		
	    	
		}
		
		}
	}

