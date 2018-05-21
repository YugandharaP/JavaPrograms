
/************************************************************************************************************
 * purpose-to sort the Strings using Insertion sort algorithm
 *@author  Yuga
 *@version 1.0
 *@since   21-05-2018
 **************************************************************************************************************/
package com.bridgelabz.Algorithms;

import com.bridgelabz.utility.Utility;

public class InsertionSort {

	public static void main(String[] args) {
		System.out.println("How many String you want to sort ?: ");
		int input = Utility.reInteger();
		String[] array=new String[input];
		System.out.println("Enter the Elements");
		for(int i=0;i<input;i++)
		{
			array[i]=Utility.retNext();
		}
		Utility.insertionSortOfStrings(array);
		for(int i=0;i<array.length;i++)
		{
			System.out.println(array[i]);
		}
		/*
		int[] array=new int[input];
		System.out.println("Enter the Strings");
		for(int i=0;i<input;i++)
		{
			array[i]=Utility.reInteger();
		}
		Utility.insertionSortOfInteger(array);
		for(int i=0;i<array.length;i++)
		{
			System.out.println(array[i]);
		}
		*/
	}
	

}
