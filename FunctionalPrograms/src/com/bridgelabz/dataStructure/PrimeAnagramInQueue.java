package com.bridgelabz.dataStructure;

import com.bridgelabz.utility.Utility;

public class PrimeAnagramInQueue  {

	public static void main(String[] args) {
		String temp = "";
		for (int num = 2; num <= 1000; num++) {
			if (Utility.isPrime(num)) {
				temp += num + " ";
			}
		}
		String[] array = temp.split(" ");
		for (int i = 0; i < array.length - 1; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (Utility.isAnagram(array[i], array[j])) {
					MyQueue.enqueue(array[i]);
					MyQueue.enqueue(array[j]);
					//System.out.println(array[i]+" and " +array[j]+" prime Anagram");
				}
			}
		}
		System.out.println("prime Anagram :");
		MyQueue.display();
	}

}
