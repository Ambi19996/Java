package com.bridgelabz.utility;

import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Random;

import com.bridgelab.algorithm.PrimeNumber;
import com.bridgelab.datastructure.Stack.Node;

public class utilitylogi {

	/* String Replace Logic Program */
	public static String ReplaceString(String user_give_the_name) {
		String user_name_to_merge = "hello <<username>> how are u";
		user_name_to_merge = user_name_to_merge.replace("<<username>>", user_give_the_name);
		return user_name_to_merge;

	}

	/* flip coin find percentage Logic Program */
	public static double PercentageOfFlip(int user) {
		double tail = 0;
		double head = 0;
		while (user > 0) {
			double i = Math.random();
			if (i > 0.5) {
				head++;
			} else {
				tail++;
			}
			user--;
		}
		double percentage = (head / tail) * 100;
		return percentage;
	}

	/* here to check the leapyear or not */
	public static boolean CheckLeapYearOrNot(int year) {

		if (((year % 400 == 0) || year % 4 == 0 && year % 100 != 0)) {
			return true;
		}
		return false;
	}

	/* here finds power of 2 logics */
	public static int checkpower(int user) {
		int result = 0;
		for (int i = 0; i <= user; i++) {
			result = (int) (Math.pow(2, i));
		}
		return result;
	}

	/* harmonic number logics */
	public static double HarmonicNumber(int user) {
		double harmonic = 0.0;
		for (int i = 1; i <= user; i++) {
			harmonic += (float) 1 / i;
		}
		return harmonic;
	}

	public static ArrayList<Integer> PrimeFactorial(int user) {
		ArrayList<Integer> fatorial = new ArrayList<Integer>();
		while (user > 1) {
			for (int i = 2; i <= user; i++) {
				if (user % i == 0) {
					fatorial.add(i);
					user = user / i;
					break;
				}

			}
		}
		return fatorial;

	}

	/* logic for the distance to calculate */
	public static double DistanceUsingMathFormat(int user1, int user2) {
		double distance = (Math.sqrt(user1)) + (Math.sqrt(user2));

		return distance;
	}

	/* logics for calculate the quantratic */
	public static Map<String, Float> QuadraticValues(int a, int b, int c) {
		Map<String, Float> map = new HashMap();
		float delta = (float) Math.pow(b, b) - (4 * a * c);
		float root1 = (float) (-b + Math.sqrt(delta)) / (2 * a);
		float root2 = (float) (-b - Math.sqrt(delta)) / (2 * a);
		map.put("root1", root1);
		map.put("root2", root2);

		return map;
	}

	/* logic for windchill to calculate */
	public static double WindChillCalcSpeed(double t, double v, double w) {
		w = (double) 35.74 + 0.6215 * t + (0.42755 * t - 35.75) * Math.pow(v, 0.16);
		return w;
	}

	/* logics for sum of two arrays */
	public static ArrayList<Integer> SumOfNumber(int[] arr) {
		/*
		 * here, we using the arraylist to store in list check three arrays if its 0 or
		 * not
		 */
		ArrayList<Integer> list = new ArrayList<Integer>();
		int length = arr.length;
		for (int i = 0; i < length; i++) {
			for (int j = i + 1; j < length; j++) {
				for (int k = j + 1; k < length; k++) {
					if (arr[i] + arr[j] + arr[k] == 0) {
						list.add(arr[i]);
						list.add(arr[j]);
						list.add(arr[k]);

					}
				}

			}
		}
		return list;
	}

	/*
	 * this logic is using hashmap sepearate string and float find percentageof wind
	 * and loss
	 */
	public static Map<String, Float> GamblerWonOrNot(int stake, int goal, int numberofN) {
		int win = 0;
		int loss = 0;
		int count = 0;
		float result = (float) Math.random();
		while (numberofN > 0) {
			if (Math.random() > 0.5) {
				win = win + 1;
			}
			if (Math.random() < 0.5) {
				loss = loss + 1;
			}
			if (stake == goal) {
				System.out.println("the stake is reached");
				break;
			}
			if (result == 0) {
				System.out.println("random and goal is equal");
				break;
			}
			numberofN = numberofN - 1;
			count = count + 1;

		}
		float totalwin = win;
		float percentagewin = (win * 100) / count;
		float percentageloss = (loss * 100) / count;

		Map<String, Float> map = new HashMap<String, Float>();
		map.put("totalwin", totalwin);
		map.put("percentagewin", percentagewin);
		map.put("percentageloss", percentageloss);
		return map;

	}

	/* logic for coupon number */
	public static HashSet<Integer> RepatedNotAllowedCoupon(int number, HashSet<Integer> set) {
		int count = 0;
		int dist = number;
		while (number > 0) {
			boolean tag = false;
			count = count + 1;
			int coupon = (int) (Math.random() * 10);
			System.out.println("coupon is" + coupon);
			tag = set.add(coupon);
			if (tag == false) {
				number = number + 1;
			}
			number = number - 1;
		}

		return set;
	}
	/*
	 * to calc the hour,sec,min,nanosec in using hashmap to comapaer two string to
	 * statup and stopdown
	 */

	public static Map<String, Long> startPointstopPoint(Map<String, Long> map) {
		long milessecond, hour, mintues, qsecond;
		Instant start1 = null;
		Instant stop2 = null;

		System.out.println("to start stop watch");
		String start = utility.inputString();
		System.out.println("to stop the stop wach");
		String stop = utility.inputString();

		if (start.equalsIgnoreCase("start")) {
			start1 = Instant.now();
		}
		if (stop.equalsIgnoreCase("Stop")) {
			stop2 = Instant.now();
		}
		Duration time = Duration.between(start1, stop2);
		milessecond = (long) time.toMillis();
		hour = (long) time.toHours();
		mintues = (long) time.toMinutes();
		qsecond = (long) time.getSeconds();

		map.put("milesecond", milessecond);
		map.put("totalmintues", mintues);
		map.put("qsecond", qsecond);
		map.put("totalhour", hour);

		return map;
	}

	public static int ticTacToeMethod(int user) {

		return 0;
	}

	/* logics for nuber of node to count monney */
	public static ArrayList<Integer> minimumNumberOfnode(int user, ArrayList<Integer> list, int[] number_of_node) {
		int remainter = user;
		int i = 0;
		while (true) {
			if (remainter >= number_of_node[i]) {
				int min = number_of_node[i];
				list.add(min);
				remainter = remainter - min;
			} else {
				i++;
			}
			if (remainter == 0) {
				return list;
			}

		}

	}

	/* to convert the celi and ferinheit */
	public static double convertTemperaturetoFernaheit(int temperature1, String enterword) {
		double temp = 0;
		if (enterword.equalsIgnoreCase("far")) {
			temp = (temperature1 * 9 / 35) + 32;

		}
		if (enterword.equalsIgnoreCase("celin")) {
			temp = (temperature1 - 32) * 5 / 9;

		}

		else {
			System.out.println("please enter the far or celin");
		}

		return temp;
	}

	/* decimal number to binary logic just convert */
	public static int binarytoDecimals(int user) {
		int binary[] = new int[1000];
		int i = 0;
		while (user > 0) {
			binary[i] = user % 2;
			user = user / 2;
			i++;

		}
		for (int j = i - 1; j >= 0; j--) {
			System.out.print(binary[j]);
		}
		return 0;
	}

	/* to logic of day of week */
	public static int calendarCalc(int d0, int y, int m, Map<Integer, String> map) {

		map.put(0, "Sunday");
		map.put(1, "monday");
		map.put(2, "Tuesday");
		map.put(3, "Wednesday");
		map.put(4, "Thursday");
		map.put(5, "Friday");
		map.put(6, "Saturday");

		int y0 = y - (14 - m) / 12;
		int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
		int m0 = m + 12 * ((14 - m) / 12) - 2;
		int d = 0;
		d0 = (d + x + 31 * m0 / 12) % 7;

		return d0;
	}

	/* to logics of decimals to binary and swaping */
	public static int binarytoDecimalsAndswag(int user) {
		int binary[] = new int[1000];
		int i = 0;
		while (user > 0) {
			binary[i] = user % 2;
			user = user / 2;
			i++;

		}
		for (int j = i - 1; j >= 0; j--) {
			System.out.print(binary[j]);
		}

		/* swaping */

		return 0;
	}

	/* in bubble sort stored in aeeay */
	public static int[] bubbleSort(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length - 1 - i; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}

		}
		return arr;
	}

	/* in bubble sort printing array */
	public static int[] printing(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(" " + arr[i]);
		}
		System.out.println();
		return arr;
	}

	/* to check the method its is anagram or not */
	public static String anagramOrnot(String user1, String user2) {
		char[] string1 = user1.toCharArray();
		char[] string2 = user2.toCharArray();

		Arrays.sort(string1);
		Arrays.sort(string2);

		if (Arrays.equals(string1, string2)) {
			System.out.println("its is correct");
		} else {
			System.out.println("its wrong");
		}
		String printing = null;
		return printing;
	}

	/* lodic for binary search word in fin index */
	public static int binarySearchtoFindStringitisPresentorNot(String[] str, String find) {

		int l = 0;
		int r = str.length - 1;
		while (l <= r) {
			int mid = l + (r - l) / 2;
			int result = find.compareTo(str[mid]);
			if (result == 0)
				return mid;

			if (result > 0)
				l = mid + 1;
			else
				r = mid - 1;

		}
		return -1;
	}

	/*
	 * n this method logic for the sort in the way of inserting sort using arraylist
	 * to store
	 */
	public static ArrayList<Integer> insertionElement(int[] user, ArrayList<Integer> list) {
		int n = user.length;
		for (int i = 1; i < n; i++) {
			int key = user[i];
			int j = i - 1;

			while (j >= 0 && user[j] > key) {
				user[j + 1] = user[j];
				j = j - 1;
			}
			user[j + 1] = key;
		}
		return list;
	}

	
	//logic for balance Parentheses
	public static boolean checkBalanceOrnot(char[] balance) {
		 for(char word:balance) {
       	  if ((word=='(')||(word=='{')||(word=='[')) {
       		  push(word);  //the condition is correct push the character
 			}
       	  else if (word==')') {
				if (peek()=='(') {
					char r=pop();    //the condition is correct pop the character
					System.out.println("value of RRR:" + r);
				}
							}
       	  
       	  else if (word=='}') {
					if (peek()=='{') {
						pop();
					}
				}
       	  
       	  else if (word==']') {
					if (peek()=='[') {
						pop();
					}
				}  	         	  
         }
	if (head==null) {
		return true;
	}
	else {
		return false;
	}
}

public static class Node{     //create the node class
	char data;
	Node next;
}
 static Node head;
public static char pop() {     //pop condition method
	char node=head.data;
	head=head.next;
	return node;

}

public static char peek() {  //peek condition method
	System.out.println("current head " + head.data);
	
	return head.data;
}

public static void push(char word) {
	Node node=new Node();
	node.data=word;
	node.next=null;
	
	if (head==null) {
		head=node;
				}
	else {
		node.next=head;
		head=node;
	}		

	
	}

}
