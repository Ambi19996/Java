package com.bridgelabz.singleTon;
/**
 * 
 * @author Ambi
 *
 */
public class StaticBlockInitialization 
{
	static StaticBlockInitialization obj=new StaticBlockInitialization();//eager initialization
	private StaticBlockInitialization() 
	{
		System.out.println("static block initialization");
	}
	static
	{
		try {
			obj=new StaticBlockInitialization();
		}
		catch(Exception e)
		{
			throw new RuntimeException("instance creation problem occurs");
		}
	}
	public static StaticBlockInitialization getinstance()
	{
		return obj;
	}
}
