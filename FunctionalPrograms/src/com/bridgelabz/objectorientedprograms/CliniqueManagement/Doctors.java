package com.bridgelabz.objectorientedprograms.CliniqueManagement;

import com.bridgelabz.utility.Utility;

public class Doctors {
	private String doctorName;
	private long dId;
	private String specialization;
	private String available;

	public String getDoctorName() {
		return doctorName;
	}

	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}

	public long getdId() {
		return dId;
	}

	public void setdId(long dId) {
		this.dId = dId;
	}

	public String getSpecialization() {
		return specialization;
	}

	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}

	public String getAvailable() {
		return available;
	}

	public void setAvailable(String available) {
		this.available = available;
	}

	@Override
	public String toString() {
		return "Doctors [doctorName=" + doctorName + ", dId=" + dId + ", specialization=" + specialization
				+ ", available=" + available + "]";
	}
	
	public void addDoctors() {
		System.out.println("Enter Your Details ...");
		System.out.println("Enter Name: ");
		this.doctorName=Utility.retNext();
		System.out.println();
		
		System.out.println("Enter Id: ");
		this.dId=Utility.readLong();
		System.out.println();
		
		System.out.println("Enter specialization: ");
		this.specialization=Utility.retNext();
		System.out.println();
		
		System.out.println("Enter Age: ");
		this.available=Utility.retNext();
		System.out.println();
	}
	
}
