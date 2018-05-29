package com.bridgelabz.dataStructure;

public class demo2 {
	public static void main(String[] args) {
		int nodes=2;
		int result=countTree(nodes);
		System.out.println(result);
	}
	public static int countTree(int nodes) {
		int output=0;
		output= factorial(2*nodes)/(factorial(nodes+1) * factorial(nodes));
		return output;
	}
	private static int factorial(int number) {
		int fact=1;
		for(int i=0;i<number;i++)
		{
			fact+= fact*i;
		}
	return fact;
	}
	
	}
