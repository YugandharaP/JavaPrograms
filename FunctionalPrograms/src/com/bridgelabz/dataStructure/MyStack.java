package com.bridgelabz.dataStructure;

import java.io.Serializable;

public class MyStack<T> implements Serializable{
	private static Node top=null;
	private static Integer count=0;
	
	public static boolean isEmpty()
	{
		return top==null;
	}
	 public static <T>void push(T element)
	 {
		
			 Node node=new Node(element);
			 node.next=top;
			 top=node;
			 count++;
		 
		 }
	 public static <T> T pop()
	 {
		 if(isEmpty()) 
		 {
		  try {
			throw new MyException("Stack is Empty");
		  } catch (MyException e) {
			e.printStackTrace();
			}
		  return null;
		 }
		 else{
		 T temp=(T) top.element;
		 count--;
		 return temp;
		 }
	 }
	 public static Integer size()
	 {
		return count;
	 }
	 
	 public static <T>void displayStack()
	 {
		 if(isEmpty())
		 {
			 System.err.println("Stack Underflow");
			 return;
		 }
		Node temp=top;
		while(temp!=null) {
			System.out.println("Elements are: "+temp.element);
			temp=temp.next;
		}
	}
		

}
