package com.bridgelabz.utility;

public class UtilityForAlgorithms {

	public static <T>void mergeSort(T[]array) {
		int left=0;
		int right=array.length-1;
		int mid=0;
		divide(array,left,right);
		
		
	}

	private static <T> void divide(T[] array, int left, int right) {
		if(left<right)
		{
			//find midpoint
			int mid=(left+right)/2;
			//divide the array in two slaves
			divide(array,left,mid);
			divide(array,mid+1,right);
			//merge the both array
			merge(array,left,mid,right);
		}
	}

	private static <T> void merge(T[] array, int left, int mid, int right) {
		//find the size of  both array
		int slaveSize1=(mid-left)+1; 
		int slaveSize2=right-mid;
		//create array
		int []leftSlave=new int[slaveSize1];
		int []rightSlave=new int[slaveSize2];
		for(int i=0;i<slaveSize1;i++)
		{
			//leftSlave[i]=
		}
		
	}
	
	/*public static <T extends Comparable<T>> T genericMax(T first,T second,T third)
	{
		if(first.compareTo(second)>0 && first.compareTo(third)>0 )
			return first;
		else if(second.compareTo(first)>0 && second.compareTo(third)>0)
			return second;
		else
			return third;
	}
	
	public static int integerMax(int first,int second,int third)
	{
		return (first>second && first>third) ? first : (second>first && second>third) ? second : third ;  
	}
	
	
	public static String stringMax(String first,String second,String third)
	{
		return (first.compareTo(second)>0 && first.compareTo(third)>0) ? first : (second.compareTo(first) >0 && second.compareTo(third)> 0) ? second : third ; 
	}*/

}
