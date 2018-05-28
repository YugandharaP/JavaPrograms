package com.bridgelabz.dataStructure;

import com.bridgelabz.utility.Utility;

/**
 * 
 *
 */
public class PrimeAnagramUsingStack {
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
					MyStack.push(array[i]);
					MyStack.push(array[j]);
				}
			}
		}
		System.out.println("Prime anagram in Stack");
		MyStack.displayStack();
	}

}
