package com.bridgelaz.logicprogramming;

import java.util.HashMap;
import java.util.Map;

import com.bridgelabz.utility.utility;
import com.bridgelabz.utility.utilitylogi;

public class Stopwatch {

	public static void main(String[] args) {
		Map<String,Long>map=new HashMap<String,Long>();
      
       map=utilitylogi.startPointstopPoint(map); 
       for (Map.Entry< String,Long>mm:map.entrySet()) {
		System.out.println(" " + mm.getKey() + "  " + mm.getValue());
		
	}
   
	}

}
