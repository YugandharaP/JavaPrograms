package com.bridgelabz.objectorientedprograms.CliniqueManagement;

import com.bridgelabz.utility.Utility;

public class Patients {
	private String patientName;
	private long pId;
	private long mobileNumber;
	private long age;

	public String getPatientName() {
		return patientName;
	}

	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	public long getpId() {
		return pId;
	}

	public void setpId(long pId) {
		this.pId = pId;
	}

	public long getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public long getAge() {
		return age;
	}

	public void setAge(long age) {
		this.age = age;
	}

	/*@Override
	public String toString() {
		return "Patients [patientName=" + patientName + ", pId=" + pId + ", mobileNumber=" + mobileNumber + ", age="
				+ age + "]";
	}*/
	
	public void addPatients() {
		System.out.println("Enter Your Details ...");
		System.out.println("Enter Name: ");
		this.patientName=Utility.retNext();
		System.out.println();
		
		System.out.println("Enter Id: ");
		this.pId=Utility.readLong();
		System.out.println();
		
		System.out.println("Enter mobileNumber: ");
		this.mobileNumber=Utility.readLong();
		System.out.println();
		
		System.out.println("Enter Age: ");
		this.age=Utility.readLong();
		System.out.println();
	}

	
}
