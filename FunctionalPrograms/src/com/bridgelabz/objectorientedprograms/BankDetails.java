package com.bridgelabz.objectorientedprograms;

import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;

public interface BankDetails {

	public CustomerInfo stockAccount(String fileName) ;

	public double valueOf();

	public void buy(int amount, String symbol);

	public void sell(int amount, String symbol);

	public void save(String fileName) throws JsonGenerationException, JsonMappingException, IOException;

	public void printReport();
}
