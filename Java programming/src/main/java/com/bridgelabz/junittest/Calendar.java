package com.bridgelabz.junittest;

import java.util.HashMap;
import java.util.Map;

import com.bridgelabz.utility.utility;
import com.bridgelabz.utility.utilitylogi;

public class Calendar {
	public static void main(String[] args) {
		Map<Integer,String>map=new HashMap<Integer,String>();
		System.out.println("enter the year");
		int  y=utility.inputinteger();
		System.out.println("enter the month");
		int m=utility.inputinteger();
		System.out.println("enter the day");
		int d=utility.inputinteger();
		
		
		map.put(0, "Sunday");
		map.put(1, "monday");
		map.put(2, "Tuesday");
		map.put(3, "Wednesday");
		map.put(4, "Thursday");
		map.put(5, "Friday");
		map.put(6, "Saturday");
		
	
		
		int y0 = y - (14 - m) / 12;
        int x = y0 + y0/4 - y0/100 +y0/400;
        int m0 = m + 12 * ((14 - m) / 12) - 2;
        int d0 = (d + x + 31 * m0 / 12) % 7;  
        
       System.out.println(" " + map.get(d0));
	}

}
