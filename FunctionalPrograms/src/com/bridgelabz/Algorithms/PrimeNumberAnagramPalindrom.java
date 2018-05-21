package com.bridgelabz.Algorithms;

import com.bridgelabz.utility.Utility;

public class PrimeNumberAnagramPalindrom {

	public static void main(String[] args) {
		String store="";
		for(int num=2;num<=1000;num++)
		{
			if(Utility.isPrime(num))
			{
				store+=num+" ";
			}
		}
		System.out.println(store);
		String[]array=store.split(" ");
		for(int i=0;i<array.length;i++)
		{
			String temp=array[i];
			//System.out.println(temp);
			if(isPalindrome(temp)==true)
			{
				System.out.println(temp);
			}
		}
	}
	public static boolean isPalindrome(String temp) {
		String optional="";
		for(int i=temp.length()-1;i>=0;i--)
		{
			optional+=temp.charAt(i);
		}
		//System.out.println(optional);
		if(temp==optional)
			return true;
		else
			return false;
	}

}
