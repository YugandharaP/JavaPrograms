/************************************************************************************************************
 * purpose-to check the elapse time bubble sort,insertion sort and binary search
 *@author  Yuga
 *@version 1.0
 *@since   23-05-2018
 **************************************************************************************************************/
package com.bridgelabz.algorithms;

import java.util.Arrays;

import com.bridgelabz.utility.Utility;

public class EfficiencyOfAlgorithms {
	static long START;
	static long STOP;
	static long ELAPSE_TIME;
	public static <T> void main(String[] args) {
		System.out.println("Enter size of array:");
		int size=Utility.reInteger();
		System.out.println("What type of elements you want to insert : \n 1. Integer \t 2.String");
		System.out.println("Press 1 for Integer \nPress 2 for String");
		int input = Utility.reInteger();
		switch (input) {
		case 1:
			System.out.println("Enter Integer Elements: ");
			Integer[] array = new Integer[size];
			for (int i = 0; i < size; i++) {
				array[i] = Utility.reInteger();
			}
			System.out.println("*****Bubble sort****");
			START =System.nanoTime();
			Utility.bubbleSort(array);
			Utility.printArray(array);
			STOP =System.nanoTime();
			ELAPSE_TIME=STOP-START;
			System.out.println("Elapse time for bubble sort = "+ELAPSE_TIME+" ns \n");
			System.out.println("*****Insertion sort****");
			START =System.nanoTime();
			Utility.insertionSort(array);
			Utility.printArray(array);
			STOP =System.nanoTime();
			ELAPSE_TIME=STOP-START;
			System.out.println("Elapse time for Insertion sort = "+ELAPSE_TIME+" ns\n");
			System.out.println("*****Binary search****");
			System.out.println("Enter Search element");
			int searchWord=Utility.reInteger();
			START =System.nanoTime();
			System.out.println(Utility.binarySearch(array, searchWord));
			STOP =System.nanoTime();
			ELAPSE_TIME=STOP-START;
			System.out.println("Elapse time for Binary search  = "+ELAPSE_TIME+" ns\n");
			break;
		case 2:
			System.out.println("Enter Strings: ");
			String[] array1 = new String[size];
			for (int i = 0; i < size; i++) {
				array1[i] = Utility.retNext();
			}
			System.out.println("*****Bubble sort****");
			START =System.nanoTime();
			Utility.bubbleSort(array1);
			Utility.printArray(array1);
			STOP =System.nanoTime();
			ELAPSE_TIME=STOP-START;
			System.out.println("Elapse time for bubble sort = "+ELAPSE_TIME+" ns \n");
			System.out.println("*****Insertion sort****");
			START =System.nanoTime();
			Utility.insertionSort(array1);
			Utility.printArray(array1);
			STOP =System.nanoTime();
			ELAPSE_TIME=STOP-START;
			System.out.println("Elapse time for Insertion sort = "+ELAPSE_TIME+" ns\n");
			System.out.println("*****Binary search****");
			System.out.println("Enter Search word");
			String searchWord1=Utility.retNext();
			START =System.nanoTime();
			System.out.println(Utility.binarySearch(array1, searchWord1));
			STOP =System.nanoTime();
			ELAPSE_TIME=STOP-START;
			System.out.println("Elapse time for Binary search  = "+ELAPSE_TIME+" ns\n");
			break;
		default:
			System.out.println("No such a type !");
		}
	}

	
	
}
