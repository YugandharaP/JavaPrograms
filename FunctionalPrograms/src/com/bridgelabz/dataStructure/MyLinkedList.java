package com.bridgelabz.dataStructure;

import java.io.Serializable;

public class MyLinkedList  implements Serializable{
	private static Node HEAD;
	private static Node LAST;
	private static int COUNT;
	
    /**check the linked list is null or not
     */
    public static boolean isEmpty()
    {
    	return COUNT==0;
    }
	
	/**To add element in linked list at last
	 */
	public static void addElement(Object element)
	{
		if(HEAD==null)
		{
			HEAD=new Node(element);
			LAST=HEAD;
			COUNT++;
			return;
		}
		LAST.next=new Node(element);
		LAST=LAST.next;
		COUNT++;
	}
	/**To add element in linked list in particular position
	 */
	public static void addElementOnIndex(int index,Object element)
	{
		if(index>=size())throw new IndexOutOfBoundsException("index not fount");
		if(index==0)
		{
			HEAD=new Node(element,HEAD);
			COUNT++;
			return;
		}
		Node node=HEAD;
		for(int i=1;i<index;i++)
		{
			node=node.next;
		}
		node.next=new Node(element,node.next);
		COUNT++;
				
	}
	/**It retuns size
	 */
	public static int size() {
	
		return COUNT;
	}
	
	/**Fetch element from particular index
	 */
	public static Object getElement(int index)
	{
		if(index>=size()) throw new IndexOutOfBoundsException("Index Not Found");
			Node node=HEAD;
			for(int i=0;i<index;i++)
			{
				node=node.next;
			}
		return node.element;
	}
	
	/**This function is used to search element
	 */
	public static boolean searchElement(Object element)
	{
		
		if(HEAD.element==element)
		{
			return true;
		}
		Node node=HEAD;
		while(node!=null)
		{
			if(node.element==element)
				return true;
			node=node.next;
		}
		return false;
	}
	 /**This function used to remove element from particular index
	 */
	public static void removeAt(int index)
	 {
		 if(index>=size())throw new IndexOutOfBoundsException("index not found");
		 if(index==0)
		 {
			 HEAD=HEAD.next;
			 COUNT--;
			 return;
		 }
		 Node node=HEAD;
		 for(int i=0;i<index;i++)
		 {
			 node=node.next;
		 }
		 node=(node.next).next;
		 COUNT--;
	 }
	
	public static Object popAtPosition(int index)
	 {
		 if(index>=size())throw new IndexOutOfBoundsException("index not found");
		 if(index==0)
		 {
			 Object temp=HEAD.element;
			 HEAD=HEAD.next;
			 COUNT--;
			 return temp;
		 }
		 Node node=HEAD;
		 for(int i=0;i<index;i++)
		 {
			 node=node.next;
		 }
		 Object temp=(node.next).element;
		 node=(node.next).next;
		 COUNT--;
		 return temp;
	 }
	public static Object pop() {
		Node node=HEAD;
		while(node.next!=null)
		{
			node=node.next;
		}
		COUNT--;
		return node.element;
	}
	public static void display() {
		if(isEmpty())
		{
			System.out.println("List is empty!");
		}
	
			Node temp=HEAD;
			for(int i=0;i<size();i++) {
				System.out.println("elements are: "+temp.element);
				temp=temp.next;
			}
	
	}

}
