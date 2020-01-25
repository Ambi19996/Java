package inventoryManagement;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class Demo {
	static JSONObject employeeDetails = new JSONObject();
	static JSONArray employeeList = new JSONArray();

	public static void main(String[] args) {
		
        employeeDetails.put("firstName", "mark");
        employeeDetails.put("lastName", "ambi");
        employeeDetails.put("hobbies", "kabbadi");
        employeeList.add(employeeDetails);
         
     /*   JSONObject employeeObject = new JSONObject(); 
        employeeObject.put("employee", employeeDetails);*/
         
        //Second Employee
   // employDetails=new JSONObject();
        JSONObject employeeDetails2 = new JSONObject();
        employeeDetails2.put("firstName", "mukesh");
        employeeDetails2.put("lastName", "gg");
        employeeDetails2.put("hobbies", "coder");
         
        /*JSONObject employeeObject2 = new JSONObject(); 
        employeeObject2.put("employee", employeeDetails2);*/
         
        //Add employees to list
        //JSONArray employeeList = new JSONArray();
       // employeeList.add(employeeObject);
        employeeList.add(employeeDetails2);
         
        //Write JSON file
        try (FileWriter file = new FileWriter("/home/user/Desktop/demo.json")) {
 
            file.write(employeeList.toJSONString());
            file.flush();
 
        } catch (IOException e) {
            e.printStackTrace();
        }
        read(employeeList);
    }

	private static void read(JSONArray employeeList) {
		JSONParser parser=new JSONParser();
		try(FileReader reader=new FileReader("/home/user/Desktop/demo.json")) {
			Object obj=parser.parse(reader);
			JSONArray managemen=(JSONArray) obj;
			
			for (int i = 0; i < managemen.size(); i++) {
				JSONObject ob=(JSONObject) managemen.get(i);
			    System.out.println(ob);	
			    System.out.println("First nqame:"+ob.get("firstName") + "\n" + ob.get("lastName") + "\n" + ob.get("hobbies"));	
			}
			
			
			
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	}


