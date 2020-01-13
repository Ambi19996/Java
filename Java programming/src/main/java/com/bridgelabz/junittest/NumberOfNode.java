package com.bridgelabz.junittest;



import java.awt.List;
import java.util.ArrayList;

import com.bridgelabz.utility.utility;
import com.bridgelabz.utility.utilitylogi;

public class NumberOfNode {
	public static void main(String arg[]) {
		ArrayList<Integer>list=new ArrayList<Integer>();
int number_of_node[]= {1000,500,100,50,10,5,2,1};
System.out.println(" Enter the ammount :");
int user=utility.inputinteger();
list=utilitylogi.minimumNumberOfnode(user,list,number_of_node);

System.out.println("ammount is ");

for (int i = 0; i < list.size(); i++) {
	System.out.println(" " + list.get(i));
}
System.out.println("............... " + list.size());


	}

	private static void printing(int user, ArrayList<Integer> list, int[] number_of_node) {
	
	}
}
