package com.bridge.controller;

import java.io.IOException;

import com.bridegelab.model.ItemProperties;
import com.bridgdlab.repository.InventoryRepository;
import com.bridgelab.utility.Utility;

public class Main {

	public static void main(String[] args) throws IOException {

      String path="/home/user/eclipse-workspace/inventoryManagementProgram/com/main/java/com/bridge/controller/invetor.json";
	   int choose;
	   System.out.println("choose any one ");
	   System.out.println("press 1 add item and press 2 diaplay ");
	   choose=Utility.inputreader();
	   InventoryRepository rep=new InventoryRepository();
	   
	   if (choose==1) {
		   ItemProperties item=new ItemProperties();
		   item.provider();
		   rep.add(item,path);
		
	}
	   else if (choose==2) {
		rep.display(path);
	}
	   else {
		   System.out.println("its is invalid");
	   }
	}

}
