package com.bridgelabz.singleTon;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
/**
 * 
 * @author user:Ambi
 *problem:the main problem of serialization is we can create two differenrt objects 1 for transfer data called serialization
 *
 */
public class Serialization implements Serializable
{
	private int i;
	private Serialization()
	{
		System.out.println("created");
	}
	private static Serialization obj=new Serialization();
	public static Serialization getInstance()
	{
		return obj;
	}
	
	public static void main(String[] args) 
	{
		Serialization obj=Serialization.getInstance();
		obj.i=20;
		File f=new File("/home/user/serialization.txt");
		try {
			FileOutputStream fos=new FileOutputStream(f);
			ObjectOutputStream dos;
			dos = new ObjectOutputStream(fos);
			dos.writeObject(obj);
			dos.close();
			FileInputStream fis=new FileInputStream(f);
			ObjectInputStream ois=new ObjectInputStream(fis);
			Serialization obj2=(Serialization) ois.readObject();
			ois.close();
			System.out.println(obj+" "+obj2);
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
}
