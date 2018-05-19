package com.bridgelabz.Algorithms;

import com.bridgelabz.utility.Utility;

public class PrimeNumber {

	public static void main(String[] args) {
		String result="";
		for(int number=2;number<=1000;number++)
		{
			if(Utility.isPrime(number)==true)
			{
				result+=number+" ";
			}
		}
		System.out.println("Prime numbers between 0-1000 are : \n "+result);
	}
}
