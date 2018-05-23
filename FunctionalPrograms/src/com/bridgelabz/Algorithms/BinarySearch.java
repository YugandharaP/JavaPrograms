
/************************************************************************************************************
 * purpose-to search the element from array using binary search algorithm
 *@author  Yuga
 *@version 1.0
 *@since   21-05-2018
 **************************************************************************************************************/package com.bridgelabz.Algorithms;

import java.util.Arrays;

import com.bridgelabz.utility.Utility;

public class BinarySearch {

	public static void main(String[] args) {
		System.out.println("How many elements you want to enter ?");
		int input=Utility.reInteger();
		int[]array=new int[input];
		System.out.println("Enter elements: ");
		for(int i=0;i<input;i++)
		{
			array[i]=Utility.reInteger();
		}
		System.out.println("Which element you want to search?");
		int searchWord=Utility.reInteger();
		Arrays.sort(array);
		System.out.println(Utility.binarySearchForInteger(array,searchWord));
		/*
		String[]array=new String[input];
		System.out.println("Enter elements: ");
		for(int i=0;i<input;i++)
		{
			array[i]=Utility.retNext();
		}
		
		Arrays.sort(array);
		for(int i=0;i<array.length;i++)
		{
			System.out.println(array[i]);
		}
		System.out.println("Which element you want to search?");
		String searchWord=Utility.retNext();
		
		
		System.out.println(Utility.binarySearchForStrings(array,searchWord));*/
	}

	
}
