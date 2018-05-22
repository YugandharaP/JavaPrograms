package com.bridgelabz.Algorithms;

import com.bridgelabz.utility.Utility;
import com.bridgelabz.utility.UtilityForAlgorithms;

public class MergeSort {

	public static <T> void main(String[] args) {
		System.out.println("Enter how many elements you want to sort");
		int input=Utility.reInteger();
		System.out.println("Enter elements");
		String [] array=new String[input];
		for(int i=0;i<input;i++)
		{
			array[i]=Utility.retNext();
		}
		UtilityForAlgorithms.mergeSort(array);
		
	}

	

}
