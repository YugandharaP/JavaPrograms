package com.bridgelabz.objectorientedprograms;

import java.io.FileReader;
import java.io.IOException;

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
public class AddressBookManager {

	public static void main(String[] args) throws JsonGenerationException, JsonMappingException, IOException {
		AddressBook book = new AddressBook();
		System.out.println("Initially you have to add atleast one user details");
		book.addPerson();
		
	}

	public static void showOptions() throws JsonGenerationException, JsonMappingException, IOException {
		System.out.println("Which oeration you want to perform,Choose following options");
		System.out.println("1. Add person\t\t\t 2. Edit Person");
		System.out.println("3. Delete Person details\t 4. Sort_By_Name");
		System.out.println("5. Sort_By_Zip\t\t\t 6. Show AdreessBook ");
		System.out.println("7. Create new AddressBook \t 8. Exit");
		
		int option = Utility.reInteger();
		performOperations(option);
	}

	private static void performOperations(int option)
			throws JsonGenerationException, JsonMappingException, IOException {
		AddressBook book = new AddressBook();
		switch (option) {
		case 1:
			book.addPerson();
			break;
		case 2:
			book.showBook();
			System.out.println("Which person details you want to change ?");
			System.out.println("Enter index");
			int index=Utility.reInteger();
			book.editPerson(index);
			break;
		case 3:
			book.showBook();
			System.out.println("Which person details you want to delete ?");
			System.out.println("Enter index");
			int index1=Utility.reInteger();
			book.deletePerson(index1);
			break;
		case 4:
			book.sortByName();
			break;
		case 5:
			book.sortByZip();
			break;
		case 6:
			book.showBook();
			showOptions();
			break;
		case 7:
			book.createNew();
			break;
		
		case 8:
			book.exit();
			break;
		default:
			System.err.println("No such Option");
		}

	}

}
