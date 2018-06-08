package com.bridgelabz.objectorientedprograms;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.bridgelabz.utility.Utility;

/**
 * purpose-To store all functions(add user,update user details ,delete user
 * details,sort user details either by name or zipcode) which will used to
 * create an address book.
 * 
 * @author yuga
 * @version 1.0
 * @since 07-06-2018
 */

@SuppressWarnings("serial")
public class AddressBook implements Serializable {
	private ArrayList<PersonDetails> personList = new ArrayList<PersonDetails>();

	public ArrayList<PersonDetails> getPersonList() {
		return personList;
	}
	public void setPersonList(ArrayList<PersonDetails> personList) {
		this.personList = personList;
	}
	public AddressBook(String FILEPATH ) {
		ObjectMapper mapper = new ObjectMapper();
		try {
			personList = mapper.readValue(new File(FILEPATH), new TypeReference<ArrayList<PersonDetails>>() {});
		} catch (IOException e) {
			System.err.println("AddressBook is empty..! First add some data.");
		}
	}

}
