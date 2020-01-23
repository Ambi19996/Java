package com.bridgelab.datastructure;

import com.bridgelabz.utility.utilitylogi;

public class Calender {
	public static void main(String[] args) {
		int month=1;
		int year=2020;
		int no_Of_days[]= {0,31,28,31,30,31,30,31,31,30,31,30,31};
		String[] name_of_month= {"","jan","feb","march","april","may","june","july","aug","sep","oct","nov","dec"};
	   
	    if (leapyear(year)&&month==2) {
			no_Of_days[2]=29;
		}
	    utilitylogi.calenderofday(month,year,no_Of_days,name_of_month);
	    
	}

	private static boolean leapyear(int year) {
		
		return year/4==0;
	}

}
