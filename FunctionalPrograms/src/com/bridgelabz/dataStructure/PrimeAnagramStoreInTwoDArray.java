package com.bridgelabz.dataStructure;

import com.bridgelabz.utility.Utility;

public class PrimeAnagramStoreInTwoDArray {
	static MyQueue queue1=new MyQueue();
	static MyQueue queue2=new MyQueue();
	public static void main(String[] args) {
		for(int num=0;num<=10;num++)
		{
			if(Utility.isPrime(num))
			{
				MyLinkedList.addElement(num);
			}
		}
		checkAnagram();
	}

	private static void checkAnagram() {
		for(int i=0;i<MyLinkedList.size()-1;i++)
		{
			for(int j=i+1;j<MyLinkedList.size();j++) {
				if(Utility.isAnagram(MyLinkedList.getElement(i), MyLinkedList.getElement(j)))
				{
					if(queue1.searchElement(MyLinkedList.getElement(i))||queue1.searchElement(MyLinkedList.getElement(i))==false)
					{
						queue1.enqueue(MyLinkedList.getElement(i));
						queue1.enqueue(MyLinkedList.getElement(j));
					}
				}else
				{
					if(queue1.searchElement(MyLinkedList.getElement(i))&& queue2.searchElement(MyLinkedList.getElement(i))==false)
					{
						queue2.enqueue(MyLinkedList.getElement(i));
				
					}
					if(queue1.searchElement(MyLinkedList.getElement(j))&& queue2.searchElement(MyLinkedList.getElement(j))==false)
					{
						
						queue2.enqueue(MyLinkedList.getElement(j));
					}
				}
			}
		}
		Integer[][] array=new Integer[2][queue2.size()];
		int anagramQueueSize=queue1.size();
        for(int i=0;i<anagramQueueSize;i++)
        {
            array[0][i]=queue1.dequeue();
        }
        int nonAnagramQueueSize=queue2.size();
        for(int j=0;j<nonAnagramQueueSize;j++)
        {
            array[1][j]=queue2.dequeue();
        }
        System.out.println();
        System.out.println("Array elements are:");
        System.out.println("first row shows anagram numbers and second row shows non anagram numbers");
        Utility.printTwoDArray(array);
	}	
}

/***
 * public class PrimeNumberAnagramTwoDArray {
    public static void prime() {
                SinglyLinkedList[][] array = new SinglyLinkedList[100][];
                for (int i = 0; i < 10; i++) {
                    array[i] = new SinglyLinkedList[100];
                    for (int j = 0; j < 100; j++) {
                        array[i][j] = new SinglyLinkedList();
                    }
                }
                for (int i = 0; i < 10; i++) {
                    for (int j = 100 * i; j < 100 * (i + 1) - 1; j++) {
                        int k = 0;
                        if (Utility.prime1(j) == true) {
                            for (int m = j + 1; m < 100 * (i + 1); m++) {
                                if (Utility.stringAnagram(("" + j), ("" + m)) == true) {
                                    array[i][k].add(j);
                                    k++;
                                    System.out.print( j + "," + m );
                                }
                            }
                        }
                    }

                    System.out.println();
                }
    }
    public static void main(String []args) {
        prime();
    }
}


 * 
 * 
 * */
