package com.bridgelabz.singleTon;
/**
 * same as eagerinitialization
 * @author Ambi

 */
public class LazyInitialization 
{
	static LazyInitialization obj;//lazy initialization
	private LazyInitialization()
	{
		System.out.println("lazy initialization");
	}
	public static LazyInitialization getInstance()
	{
		if(obj==null)
		{
		obj=new LazyInitialization();
		}
		return obj;
	}

}
