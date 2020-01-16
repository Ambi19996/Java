package com.bridgelab.algorithm;

import java.util.ArrayList;

import com.bridgelabz.utility.utility;
import com.bridgelabz.utility.utilitylogi;

public class MergeSort {
	static int arr[]=new int[5];
	
	public static void main(String args[]) {
	for (int i = 0; i < arr.length; i++) {
		arr[i]=utility.inputinteger();
		
	}
	
	
		// Print array before merge sort
		System.out.println("Array before sorting:");
		printArray(arr,0,arr.length-1);
		System.out.println("-----------------------------");
 
		mergeSort(0,arr.length-1);
 
		System.out.println("-----------------------------");
 
		// Print array after sorting
		System.out.println("Array After sorting:");
		printArray(arr,0,arr.length-1);
 
 
	}
 
	// Recursive algorithm for merge sort
	public static void mergeSort(int start,int end)
	{
		int mid=(start+end)/2;
		
		if(start<end)
		{
			// Sort left half
			mergeSort(start,mid);
			// Sort right half
			mergeSort(mid+1,end);
			// Merge left and right half
			merge(start,mid,end);
		}
 
	}
 
 
	private static void merge(int start, int mid, int end) {
		// Initializing temp array and index
		int[] tempArray=new int[arr.length];
		int i=start;
		int j=mid+1;
		int k=start; /*temp to declare*/
		
 
		// It will iterate until smaller list reaches to the end
		while(i<=mid && j<=end)
		{
			if(arr[i]< arr[j])
			{
				tempArray[k]=arr[i];
				i++;
			}
			else
			{
				tempArray[k]=arr[j];
                 j++;			
			}
			k++;
		}
 
		// Copy remaining elements
		while(i<=mid) {
			tempArray[k]=arr[i];
			i++;k++;
		}
		while(j<=end) {
			tempArray[k]=arr[j];
			j++;k++;
		}
		// Copy tempArray to actual array after sorting 
		for (int temp = start; temp <=end; temp++) {
			arr[temp]=tempArray[temp];
		}
 
		System.out.print("After merging:   ");
		printArray(tempArray,start,end);
		System.out.println();
	}
 
	public static void printArray(int arr[],int start,int end)
	{
		for (int i = start; i <=end; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	} }
