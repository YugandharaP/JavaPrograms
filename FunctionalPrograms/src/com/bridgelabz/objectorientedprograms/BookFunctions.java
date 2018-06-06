package com.bridgelabz.objectorientedprograms;

import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;

public interface BookFunctions {
	public void addPerson() throws JsonGenerationException, JsonMappingException, IOException;
	void editPerson(int index) throws JsonGenerationException, JsonMappingException, IOException ;
	void deletePerson(int index) throws JsonGenerationException, JsonMappingException, IOException;
	void sortByName();
	void sortByZip() throws JsonGenerationException, JsonMappingException, IOException;
	void showBook() throws JsonGenerationException, JsonMappingException, IOException;
	void createNew();
	void openPrevious();

}
