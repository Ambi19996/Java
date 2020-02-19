package com.bridgelabz.singleTon;
/**
 * enum is a special type of class which creates single object called INSTANCE.In enum it had inbuilt private constructor
 *  which assigning class instance as INSTANCE.
 * @author user :Ambi
 
 */
public enum EnumSingleton 
{
	INSTANCE;
//	private EnumSingleton()
//	{
//		System.out.println("hello");
//	}
//	int i;
	public  void someMeth()
	{
//		System.out.println(i);
		//do something
	}
//	public static void main(String[] args) 
//	{
//		EnumSingleton obj=EnumSingleton.INSTANCE;
//		obj.i=10;
//		obj.someMeth();
//		EnumSingleton obj1=EnumSingleton.INSTANCE;
//		obj1.i=20;
//		obj.someMeth();
//	}
}
