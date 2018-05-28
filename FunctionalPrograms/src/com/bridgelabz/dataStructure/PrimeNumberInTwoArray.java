package com.bridgelabz.dataStructure;

import com.bridgelabz.utility.Utility;

public class PrimeNumberInTwoArray {

	public static void main(String[] args) {
		String [][]array=new String[10][30];
		int rDimention=2;
		int cDimention=100;
		int column=0;
		
		for(int row=0;row<10;row++)
		{
			for(int colmD=rDimention;colmD<cDimention;colmD++)
			{
				if(Utility.isPrime(colmD))
				{
					array[row][column++]=colmD+"";
				}
			}
			rDimention+=100;
			cDimention+=100;
			column=0;
		}
		printTwoDArray(array);
	}
	private static void printTwoDArray(String[][] array) {
		for(int i=0;i<10;i++)
		{
			for(int j=0;j<30;j++)
			{
				if(array[i][j]==null)
				{
					array[i][j]=" ";
				}
				System.out.print(array[i][j]+" ");
			}
			System.out.println();
		}
	}

}
