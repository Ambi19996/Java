package inventoryManagement;

import java.io.FileReader;
import java.io.FileWriter;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class main {
public static void main(String arg[]) {
	
	
	
	
	
//	define the object 
	JSONArray list=new JSONArray();
	
	JSONObject ricedetails1=new JSONObject();
	ricedetails1.put("name", "karanadaponni");
	ricedetails1.put("weight", 40);
	ricedetails1.put("price", 2500);
	ricedetails1.put("kg", 25);
	list.add(ricedetails1);
//	JSONObject objdetails1=new JSONObject();
//	objdetails1.put("RICE", ricedetails1);
	
	
//
	JSONObject pulsesdetails2= new JSONObject();
	pulsesdetails2.put("name", "lugume");
	pulsesdetails2.put("weight", 30);
	pulsesdetails2.put("price", 25000);
	pulsesdetails2.put("kg", 30);
	list.add(pulsesdetails2);
	
//	JSONObject objdetails2=new JSONObject();
//	objdetails2.put("pulses",pulsesdetails2);
	
	
	//
	
	JSONObject wheatsdetails3= new JSONObject();
	wheatsdetails3.put("name", "Asirvaar");
	wheatsdetails3.put("weight", 30);
	wheatsdetails3.put("price", 250);
	wheatsdetails3.put("kg", 22);
	
	list.add(wheatsdetails3);
//	JSONObject objdetails3=new JSONObject();
//	objdetails3.put("Wheat",wheatsdetails3);
//	use the array into object
		
	try (FileWriter file=new FileWriter("/home/user/Desktop/file.json")){
		file.write(list.toJSONString());
		
	} catch (Exception e) {
	e.printStackTrace();

	}
	
	add();
	reading(list);
	
}

private static void reading(JSONArray list) {

JSONParser parser=new JSONParser();
try {
	FileReader file=new FileReader("/home/user/Desktop/file.json");
	Object ob=parser.parse(file);
	JSONArray list1=(JSONArray) ob;
	
	for (int i = 0; i < list.size(); i++) {
		JSONObject obj=(JSONObject) list1.get(i);
		System.out.println(obj);
		System.out.println(obj.get("name") + "\n " + obj.get("weight") + "\n " + obj.get("price") + "\n " + obj.get("kg"));
	}
} catch (Exception e) {
	System.out.println(e);
}

}	
	








}