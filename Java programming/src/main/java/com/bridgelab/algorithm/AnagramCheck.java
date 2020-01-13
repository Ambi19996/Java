package com.bridgelab.algorithm;

import com.bridgelabz.utility.utility;
import com.bridgelabz.utility.utilitylogi;
/*main method anagram user give name it will check the  its is anagram or not*/
public class AnagramCheck {
public static void main(String[] args) {
	String user1=utility.inputString();
	String user2=utility.inputString() ;
	String printing=utilitylogi.anagramOrnot(user1,user2);
}
}
