package com.bridgelabz.dataStructure;

public class MyQueue {
	
	private static Node front;
	private static Node rear;
	private static int count;
	
    /**check the Queue list is null or not
     */
    public static boolean isEmpty()
    {
    	return count==0;
    }
	
	/**To add element in Queue list at rear
	 */
	public static void enqueue(Object element)
	{
		if(isEmpty())
		{
			front=new Node(element);
			rear=front;
			count++;
			return;
		}
		rear.next=new Node(element);
		rear=rear.next;
		count++;
	}
	/**It retuns size
	 */
	public static int size() {
	
		return count;
	}
	/**
	 * @return
	 */
	public static void dequeue() {
		if(isEmpty())
		{
			System.out.println("queue is empty!");
		}
		Object temp=front.element;
		front=front.next;
		count--;
	}
	
	public static void display() {
		if(isEmpty())
		{
			System.out.println("List is empty!");
			return;
		}
		Node temp=front;
		for(int i=0;i<size();i++)
		{
			System.out.println("elements are: " +temp.element);
			temp=temp.next;
		}
	}

}
