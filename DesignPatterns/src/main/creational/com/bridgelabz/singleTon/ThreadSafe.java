package com.bridgelabz.singleTon;
/**
 * changes:use synchronized when getting instance because in synchronized at a time only one thread will be allowed
 * @author user Ambi
 *
 */
public class ThreadSafe 
{
	static ThreadSafe obj;
	private ThreadSafe()
	{
		System.out.println("thread safe");
	}
	public static synchronized ThreadSafe getInstance()
	{
		if(obj==null)
		obj=new ThreadSafe();
		return obj;
	}
}