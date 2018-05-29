package com.bridgelabz.dataStructure;

import com.bridgelabz.utility.Utility;

public class PrimeAnagramStoreInTwoDArray {
	static MyQueue queue1=new MyQueue();
	public static void main(String[] args) {
		
		
		for(int num=0;num<=10;num++)
		{
			if(Utility.isPrime(num))
			{
				MyLinkedList.addElement(num);
			}
		}
		checkAnagram();
		
		
		//MyLinkedList.display();
	}

	private static void checkAnagram() {
		for(int i=0;i<MyLinkedList.size()-1;i++)
		{
			for(int j=i+1;j<MyLinkedList.size();j++) {
		
			}
		}
		MyQueue.display();
	}	
}
