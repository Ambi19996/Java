package com.bridgdlab.repository;




import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import com.bridegelab.model.ItemProperties;


public class InventoryRepository {
	FileWriter fw;
	PrintWriter pw;

	public void add(ItemProperties item, String path) throws IOException {
		try {
		JSONArray list=new JSONArray();
		JSONObject obj=new JSONObject();
		File fr=new File(path);
		if(fr.length()!=0)
		{
		try {
			list=(JSONArray) new JSONParser().parse(new FileReader(path));			
		}
		catch (Exception e) {
			System.out.println(e);
		}
		}
		obj.put("name", ((ItemProperties)item).getName());
		obj.put("weight", ((ItemProperties)item).getWeight());
		obj.put("price", ((ItemProperties)item).getPrice());
		
		FileWriter fw=new FileWriter(path);
		PrintWriter pw=new PrintWriter(fw);
		list.add(obj);
		pw.println(list.toString());
		fw.close();
		pw.close();
		}
	catch(Exception e)
	{
		System.out.println(e);
	}

}
	public void display(String path) {
    JSONParser parser=new JSONParser();
    
    try {
    	FileReader file=new FileReader(path);
    	Object obs=parser.parse(file);
    	JSONArray man=new JSONArray();
    	man=(JSONArray)obs;
    	for (int i = 0; i <man.size(); i++) {
    		JSONObject object=(JSONObject)man.get(i);
    		System.out.println(object);
    		System.out.println(object.get("name") + "/n" + object.get("weight") + "/n" + object.get("price"));
		}
		
	} catch (Exception e) {
		System.out.println(e);
	}
		
	}
}

