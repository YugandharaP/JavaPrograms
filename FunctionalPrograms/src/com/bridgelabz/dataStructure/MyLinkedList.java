package com.bridgelabz.dataStructure;

import java.io.Serializable;

public class MyLinkedList  implements Serializable{
	private static Node head;
	private static Node last;
	private static int count;
	
    /**check the linked list is null or not
     */
    public static boolean isEmpty()
    {
    	return count==0;
    }
	
	/**To add element in linked list at last
	 */
	public static void addElement(Object element)
	{
		if(isEmpty())
		{
			head=new Node(element);
			last=head;
			count++;
			return;
		}
		last.next=new Node(element);
		last=last.next;
		count++;
	}
	/**To add element in linked list in particular position
	 */
	public static void addElementOnIndex(int index,Object element)
	{
		if(index>=size())throw new IndexOutOfBoundsException("index not fount");
		if(index==0)
		{
			head=new Node(element,head);
			count++;
			return;
		}
		Node node=head;
		for(int i=0;i<index;i++)
		{
			node=node.next;
		}
		node.next=new Node(element,node.next);
		count++;
				
	}
	/**It retuns size
	 */
	public static int size() {
	
		return count;
	}
	
	/**Fetch element from particular index
	 */
	public static Object getElement(int index)
	{
		if(index>=size()) throw new IndexOutOfBoundsException("Index Not Found");
			Node node=head;
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
		
		if(head.element==element)
		{
			return true;
		}
		Node node=head;
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
			 head=head.next;
			 count--;
			 return;
		 }
		 Node node=head;
		 for(int i=0;i<index-1;i++)
		 {
			 node=node.next;
		 }
		 node.next=(node.next).next;
		count--;
	 }
	
	/*public static Object popAtPosition(int index)
	 {
		 if(index>=size())throw new IndexOutOfBoundsException("index not found");
		 if(index==0)
		 {
			 Object temp=head.element;
			 head=head.next;
			 count--;
			 return temp;
		 }
		 Node node=head;
		 for(int i=0;i<index;i++)
		 {
			 node=node.next;
		 }
		 Object temp=(node.next).element;
		 node=(node.next).next;
		// count--;
		 return temp;
	 } */
	/*public static Object pop() {
		Node node=head;
		for(int i=0;i<size()-1;i++)
		{
			node=node.next;
		}
		int temp=(int) node.next.element;
		node=null;
		return temp;
	}*/
	
	public static void display() {
		if(isEmpty())
		{
			System.out.println("List is empty!");
		}
	
		//Node temp=head;
			for(int i=0;i<size();i++) {
				System.out.println("elements are: "+getElement(i));
				//temp=temp.next;
			}
	
	}

}
