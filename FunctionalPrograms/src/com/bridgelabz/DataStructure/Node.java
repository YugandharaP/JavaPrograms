package com.bridgelabz.DataStructure;

public class Node {
	Node next;
	Object element;
	Node(Object element)
	{
		this.element=element;
	}
	Node(Object element,Node next)
	{
		this.element=element;
		this.next=next;
	}

}
