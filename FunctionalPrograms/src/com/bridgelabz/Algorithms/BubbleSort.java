/************************************************************************************************************
 * purpose-to sort the elements using Bubble sort algorithm
 *@author  Yuga
 *@version 1.0
 *@since   21-05-2018
 **************************************************************************************************************/
package com.bridgelabz.Algorithms;
import java.util.ArrayList;
import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class BubbleSort {

	public static <T> void main(String[] args) {
		System.out.println("How many elements you want to sort? ");
		int size = Utility.reInteger();
		Integer[] array = new Integer[size];
		for(int i=0;i<size;i++)
		{
			array[i]=Utility.reInteger();
		}
		String[] array1 = new String[size];
		for(int i=0;i<size;i++)
		{
			array1[i]=Utility.retNext();
		}
		Utility.bubbleSortForInteger(array);
		printArray(array);
	}

	//**Function used to print the array *//*
	private static <T> void printArray(T[] array) {
		String print="";
		for(int i=0;i<array.length;i++)
		{
			print+=array[i]+" " ;
		}
		System.out.println("Elements after sort : "+print);
	}
}
