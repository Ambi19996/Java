package com.bridgelabz.utility;

import java.util.Random;
import java.util.Scanner;

public class utility {
	/*create the scanner object to use the programs
	 * and set static and final
	 * 
	 * */
	
private static final Scanner scan=new Scanner(System.in);
public static int inputinteger;


	public static int inputinteger() {      /*scanner object to use integer*/
		return scan.nextInt();          	
	}
	
	public static float inputFloat() {     /*scanner object to use float*/
		return scan.nextFloat();         	
	}
	
	public static long inputLong() {       /*scanner object to use long*/
		return scan.nextLong();         	
	}
	
	public static String inputString() {   /*scanner object to use string*/
		return scan.next();          	
}
	
	public static boolean inputboolean() {  /*scanner object to use boolean*/
		return scan.nextBoolean();
	          	
	}
	
	public static double inputdouble() {  /*scanner object to use boolean*/
		return scan.nextDouble();
	          	
	}
	

}
