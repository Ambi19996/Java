package com.bridgelab.controller;

import com.bridgelab.Repository.RepositoryAddress;
import com.bridgelab.model.Itemsaddress;
import com.bridgelab.utility.Utility;

public class Controller {

	public static void main(String[] args) {
		String exit = null;
		String delete=null;

		String path = "/home/user/eclipse-workspace/AdressBook/src/com/bridgelab/controller/address.json";

		Itemsaddress item = new Itemsaddress();
		RepositoryAddress rep = new RepositoryAddress();

		System.out.println(" ********choose any one******** ");
		System.out.println(
				" press choice \n 1.Add Person \n 2.Delete Person \n 3.update Person \n 4.sort by name \n 5.sort by zip \n 6.display ");
		int choice = Utility.inputinteger();

//		 to call the add method
if (choice == 1) {
			while (exit == null || exit.equalsIgnoreCase("yes")) {
				System.out.println("enter to add the person's details");
				item.alldetails();
				rep.addperson(path, item);

				System.out.println("to add another persson print yes ");
				exit = Utility.inputString();
			}
			rep.display(path);
		}
		
//		to call the delete method
else if (choice==2) {
			while(exit == null || exit.equalsIgnoreCase("yes"))
		
			System.out.println(" to delete the person's details ");
			System.out.println("Enter the person name to delete ");
			delete=Utility.inputString();
			rep.removeperson(path,delete);
		rep.display(path);	
		
		System.out.println("to add another persson print yes ");
		exit = Utility.inputString();
		}
	
	
		
//		to call the update method
else if (choice==3)
	{
			while(exit == null || exit.equalsIgnoreCase("yes")) {
			System.out.println(" to update the person's details ");
			 long phone=0;
			 String address=null;
			 System.out.println("Enter the update person ");
			 String userupdate=Utility.inputString();
			 System.out.println("only you have update 1.PHONEnumber & 2.ADDRESS & 3.Both Address And phone ");
			 int change=Utility.inputinteger();
			 
			  if (change==1) {
		       System.out.println("enter the phone number");
		       phone=Utility.inputlong();
		       rep.updatedetails(path,phone,address,userupdate);
		    			}
			  else if (change==2) {
			       System.out.println("enter the address");
			       address=Utility.inputString();
			       rep.updatedetails(path,phone,address,userupdate);
			    			}
			  
			  else if (change==3) 
			  {
				  System.out.println(" Enter the phone number and Address");
				  phone=Utility.inputlong();
				  address=Utility.inputString();
			       rep.updatedetails(path,phone,address,userupdate);
			}
			  System.out.println("to add another persson print yes ");
				exit = Utility.inputString();
		}
			rep.display(path);
		}
//		sorting methods to call
else if (choice==4) {
	rep.sort(path);
	
		
	}
//		To Display to call
else if (choice==6) {
			rep.display(path);
		}
//		invalid options
else {
			System.out.println("Its is invalid");
		}

	}

}
