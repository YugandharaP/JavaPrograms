package com.bridgelabz.dataStructure;

public class demo {
public static <T> void main(String[] args) {
	
	/*
	MyStack stack=new MyStack<>();
	stack.displayStack();
	T option=stack.pop();
	System.out.println(option);
	stack.push(10);
	stack.push(20);
	stack.push(30);
	stack.push(40);
	stack.displayStack();
	System.out.println("***");
	
	
	
	System.out.println("size: "+stack.size());*/
	/*MyLinkedList list=new MyLinkedList();
	list.addElement(10);
	list.addElement(20);
	list.addElement(30);
	list.addElement(40);
	list.addElement(50);
	
	list.display();
	//list.pop();
	//list.popAtPosition(2);
	System.out.println("after pop");
	list.display();
	
*/
	/*MyQueue.enqueue(10);
	MyQueue.enqueue(20);
	MyQueue.enqueue(30);
	MyQueue.enqueue(40);
	MyQueue.enqueue(50);
	System.out.println("after add");
	MyQueue.display();
	MyQueue.dequeue();
	System.out.println("after delete");
	MyQueue.display();
*/
	
//	MyDeque.addFront(10);
	//MyDeque.addFront(20);
	//MyDeque.display();
	//System.out.println("***addFront complete****");
	MyDeque.addRaer(30);
	MyDeque.addRaer(40);
	MyDeque.display();
	System.out.println("***addRaer complete****");
	MyDeque.removeFront();
	MyDeque.display();
	System.out.println("***removeFront complete****");
}


}
