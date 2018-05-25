package com.bridgelabz.dataStructure;

public class Node<N> {
	Node next;
	N element;
	Node(N element)
	{
		this.element=element;
	}
	Node(N element,Node next)
	{
		this.element=element;
		this.next=next;
	}

}
