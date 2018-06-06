package com.bridgelabz.objectorientedprograms;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.Serializable;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.bridgelabz.utility.Utility;

/**
 * @author yuga
 *
 */

@SuppressWarnings("serial")
public class AddressBook implements BookFunctions, Serializable {

	static final String FILEPATH = "/home/adminsitrator/Documents/JavaProgramming/FunctionalPrograms/src/com/bridgelabz/objectorientedprograms/PersonDatabase.json";
	static AddressBookManager manager = new AddressBookManager();
	static PersonDatabase personDb = new PersonDatabase();

	@SuppressWarnings("static-access")
	public void addPerson() throws JsonGenerationException, JsonMappingException, IOException {
		String fName;
		String lName;
		String address;
		String city;
		String state;
		long zipCode;
		long phoneNumber;
		System.out.println("Enter First Name: ");
		fName = Utility.retNext();
		System.out.println("Enter Last Name: ");
		lName = Utility.retNext();
		System.out.println("Enter Address: ");
		address = Utility.retNext();
		System.out.println("Enter city: ");
		city = Utility.retNext();
		System.out.println("Enter state: ");
		state = Utility.retNext();
		System.out.println("Enter zipCode: ");
		zipCode = Utility.readLong();
		System.out.println("Enter contact number: ");
		phoneNumber = Utility.readLong();
		PersonDetails person = new PersonDetails(fName, lName, address, city, state, zipCode, phoneNumber);
		personDb.getPersonList().add(person);
		JsonUtil.convertJavaToJson(new File(FILEPATH), personDb);

		manager.showOptions();
	}

	@SuppressWarnings("static-access")
	public void editPerson(int index) throws JsonGenerationException, JsonMappingException, IOException {
		System.out.println("What do you want to update ? ");
		System.out.println("1: To change \"Address\"");
		System.out.println("2: To change \"City\"");
		System.out.println("3: To change \"State\"");
		System.out.println("4: To change \"zipCode\"");
		System.out.println("5: To change \"contact number\"");
		int option = Utility.reInteger();
		switch (option) {
		case 1:
			System.out.println("Enter new Address");
			String newAddress = Utility.retNext();
			personDb.getPersonList().get(index).setAddress(newAddress);
			JsonUtil.convertJavaToJson(new File(FILEPATH), personDb);
			showBook();
			manager.showOptions();
			break;
		case 2:
			System.out.println("Enter the new city name");
			String newCity = Utility.retNext();
			personDb.getPersonList().get(index).setCity(newCity);
			JsonUtil.convertJavaToJson(new File(FILEPATH), personDb);
			showBook();
			manager.showOptions();
			break;
		case 3:
			System.out.println("Enter the new state name");
			String newState = Utility.retNext();
			personDb.getPersonList().get(index).setState(newState);
			JsonUtil.convertJavaToJson(new File(FILEPATH), personDb);
			showBook();
			manager.showOptions();
			break;
		case 4:
			System.out.println("Enter the new ZipCode");
			long newZipCode = Utility.readLong();
			personDb.getPersonList().get(index).setZipCode(newZipCode);
			JsonUtil.convertJavaToJson(new File(FILEPATH), personDb);
			showBook();
			manager.showOptions();
			break;
		case 5:
			System.out.println("Enter the new Contact number");
			long newMobNumber = Utility.readLong();
			personDb.getPersonList().get(index).setZipCode(newMobNumber);
			JsonUtil.convertJavaToJson(new File(FILEPATH), personDb);
			showBook();
			manager.showOptions();
			break;
		}
	}

	@SuppressWarnings("static-access")
	public void deletePerson(int index1) throws JsonGenerationException, JsonMappingException, IOException {
		personDb.getPersonList().remove(index1);
		System.err.println("data delete successfully");
		JsonUtil.convertJavaToJson(new File(FILEPATH), personDb);
		showBook();
		manager.showOptions();
	}

	public void sortByName() {

	}

	public void sortByZip() throws JsonGenerationException, JsonMappingException, IOException {
		for (int i = 0; i < personDb.getPersonList().size() - 1; i++) {
			for (int j = i + 1; j < personDb.getPersonList().size(); j++) {
				long temp1 = personDb.getPersonList().get(i).getZipCode();
				long temp2 = personDb.getPersonList().get(j).getZipCode();
				if (temp1 > temp2) {
					long optional = temp1;
					temp1 = temp2;
					temp2 = optional;
				}
			}
		}
		System.err.println("sorted by zipcode successfully");
		JsonUtil.convertJavaToJson(new File(FILEPATH), personDb);
		showBook();
		manager.showOptions();
	}

	public void showBook() throws JsonGenerationException, JsonMappingException, IOException {
		System.out.println("\t\t\t---This is our addressBook---");
		JSONParser parser = new JSONParser();

		try {
			Object object = parser.parse(new FileReader(FILEPATH));
			JSONObject jsonObject = (JSONObject) object;
			JSONArray personArray = (JSONArray) jsonObject.get("personList");
			for (int i = 0; i < personArray.size(); i++) {
				JSONObject details = (JSONObject) personArray.get(i);
				System.out.println("index : " + i + " " + details);
			}

		} catch (ParseException | IOException e) {
			e.printStackTrace();
		}
	}

	public void createNew() {

	}

	public void openPrevious() {
		// TODO Auto-generated method stub

	}

	public static void exit() {
		System.err.println("Do You Really Want To Exit From Book");
		System.out.println("yes[0]/no[1]");
		int input = Utility.reInteger();
		if (input == 0) {
			System.err.println("Thanks! Visit Again...");
			System.exit(0);
		} else {
			try {
				manager.showOptions();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
