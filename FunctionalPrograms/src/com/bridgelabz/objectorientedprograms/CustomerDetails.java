package com.bridgelabz.objectorientedprograms;

import java.io.Serializable;
import java.util.ArrayList;

import com.bridgelabz.dataStructure.MyLinkedList;
import com.bridgelabz.dataStructure.MyQueue;
import com.bridgelabz.dataStructure.MyStack;

@SuppressWarnings("serial")
public class CustomerDetails implements Serializable{
	private ArrayList<CustomerInfo>customerArray=new ArrayList<CustomerInfo>();
	
	public ArrayList<CustomerInfo> getCustomerArray() {
		return customerArray;
	}

	public void setCustomerArray(ArrayList<CustomerInfo> customerArray) {
		this.customerArray = customerArray;
	}
	
}
