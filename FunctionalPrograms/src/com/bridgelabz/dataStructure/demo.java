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
	
	
	
	System.out.println("size: "+stack.size());
	MyLinkedList list=new MyLinkedList();
	list.addElement("yuga");
	list.addElement("rani");
	list.addElement("priya");
	list.addElement("riya");
	list.addElement("shivani");
	
	list.display();
	System.out.println("search elemnt "+ list.searchElement(20));
	list.removeElement("shivani");
	System.out.println("************");
	//list.display();
	//System.out.println("pop elemnt"+list.pop());
	
	//System.out.println("pop at index at 2"+list.popAtPosition(2));
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
	//MyDeque.addFront(10);
//	MyDeque.addFront(20);
	MyDeque.display();
	System.out.println("***addFront complete****");
	MyDeque.addRaer(30);
	MyDeque.addRaer(40);
	MyDeque.display();
	System.out.println("***addRaer complete****");
	MyDeque.removeFront();
	MyDeque.display();
	System.out.println("***removeFront complete****");
}


}
