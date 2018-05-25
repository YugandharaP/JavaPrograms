package com.bridgelabz.dataStructure;

public class demo {
public static void main(String[] args) {
	MyLinkedList list=new MyLinkedList();
	list.addElement(10);
	list.addElement(20);
	list.addElement(30);
	list.addElement(40);
	list.addElement(50);
	
	list.display();
	/*for(int i=0;i<list.size();i++)
	{
		System.out.println(list.getElement(i));
	}*/
	list.addElementOnIndex(2, 25);
	System.out.println(list.searchElement(10));
	list.display();
	System.out.println(list.size());
	System.out.println(list.pop());
	list.display();
	System.out.println(list.popAtPosition(3));
	list.display();
	list.removeAt(2);
	list.display();
	/*
	list.removeAt(4);
	list.pop();
	list.display();
	list.popAtPosition(1);
	list.display();
	list.isEmpty();
	list.size();*/
}

}
