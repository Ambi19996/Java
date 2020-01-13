package com.bridgelaz.logicprogramming;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import com.bridgelabz.utility.utility;
import com.bridgelabz.utility.utilitylogi;

public class Gambler {

	public static void main(String[] args) {
		Map<String,Float>map=new HashMap<String,Float>();
		System.out.println("enter the $stake :");
		int stake=utility.inputinteger();
		System.out.println("enter the $goal: ");
		int goal=utility.inputinteger();
		System.out.println("Enter the numberofN: ");
		
		int numberofN=utility.inputinteger();

		map=utilitylogi.GamblerWonOrNot(stake,goal,numberofN);
		for (Map.Entry<String,Float>mm:map.entrySet()) {
			System.out.println(mm.getKey() + "  " + mm.getValue());
			
		}
		
	}

}
