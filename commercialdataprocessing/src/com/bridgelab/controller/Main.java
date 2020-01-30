package com.bridgelab.controller;

import java.io.IOException;

import org.json.simple.JSONArray;

import com.bridgelab.Utility.Utility;
import com.bridgelab.model.Itemaccounts;
import com.bridgelab.repository.RepositoryAccounts;

public class Main {

	public static void main(String[] args) throws IOException {
		int choose=0;
		String sharename=null;
		String exit=null;
		 System.out.println("choose the value 1 add and  2 display and 3 delete ");
		String path="/home/user/eclipse-workspace/commercialdataprocessing/src/com/bridgelab/controller/accounts.json";
         
        
         System.out.println("Please read the following options and enter the choice");

 		System.out.println("1 to add a new share \n 2 to update/substract stock shares \n 3 to delete shares \n 4 to display");

 		choose=Utility.inputinteger();
        Itemaccounts item=new Itemaccounts();
        RepositoryAccounts rep=new RepositoryAccounts();
       //
        if (choose==1) {
        	while(exit==null||exit.equalsIgnoreCase("Yes")) {
        		item.setting();
        		rep.add(path,item);
        		System.out.println("another one to add yes/no");
        		exit=Utility.inputString();
             	}
        	rep.display(path);
		
      }
//        
        else if (choose==2) {
        	double numberOfShares = -1;

			double sharePrice = -1;
			
			System.out.println("enter the share name1 to make the changes");
			
			String sharename1=Utility.inputString();
	System.out.println("Enter 1 to make changes to number of Shares \n2 to make changes to price \n3 to make changes to both ");
		int change=Utility.inputinteger();
		
		if (change==1) {
			System.out.println("enter the number of shares to update");
			numberOfShares=Utility.inputdouble();
			rep.update(path, numberOfShares, sharePrice, sharename1);
		}
		else if (change==2) {
			
			System.out.println("enter the  shares price to update");
			sharePrice=Utility.inputdouble();
			rep.update(path, numberOfShares, sharePrice, sharename1);
		}
		else if (change==3) {
			System.out.println("enter the number of shares to update");
			numberOfShares=Utility.inputdouble();
			
			System.out.println("enter the  shares price to update");
			sharePrice=Utility.inputdouble();			
			rep.update(path, numberOfShares, sharePrice, sharename1);
			
		}
		}
        
//        
           else  if (choose==3) {
            	  System.out.println("enter the stock name to delete the Stock records");
                    sharename=Utility.inputString();
                    rep.delete(path,sharename);
		              } 
        
           else if (choose==4) {
			rep.display(path);
		}
        
              
 	}
	}


