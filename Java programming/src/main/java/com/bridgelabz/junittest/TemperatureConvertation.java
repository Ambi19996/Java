package com.bridgelabz.junittest;

import com.bridgelabz.utility.utility;
import com.bridgelabz.utility.utilitylogi;

public class TemperatureConvertation {
	public static void main(String[] args) {
		
		System.out.println("Enter the termperature: ");
        int temperature1=utility.inputinteger();
        System.out.println("Enter the string: ");
        String enterword=utility.inputString();

double printing=utilitylogi.convertTemperaturetoFernaheit(temperature1,enterword); 
System.out.println(" " + printing);
} 

}