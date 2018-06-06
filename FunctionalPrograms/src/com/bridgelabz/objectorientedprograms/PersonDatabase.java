package com.bridgelabz.objectorientedprograms;

import java.util.ArrayList;

public class PersonDatabase {
	private ArrayList<PersonDetails>personList=new ArrayList<PersonDetails>();

	public ArrayList<PersonDetails> getPersonList() {
		return personList;
	}

	public void setPersonList(ArrayList<PersonDetails> personList) {
		this.personList = personList;
	}

	
	
}
