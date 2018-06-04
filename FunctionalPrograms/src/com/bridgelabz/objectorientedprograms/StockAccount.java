package com.bridgelabz.objectorientedprograms;

import java.io.File;
import java.io.IOException;
import java.util.Random;
import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;

import com.bridgelabz.utility.Utility;

public class StockAccount implements BankDetails {
	static final String FILEPATH = "/home/adminsitrator/Documents/JavaProgramming/FunctionalPrograms/src/com/bridgelabz/objectorientedprograms/userDetails.json";
	Random random = new Random();

	public static void main(String[] args) throws JsonGenerationException, JsonMappingException, IOException {
		String stock_symbol = "";
		int amount = 0;
		StockAccount stock = new StockAccount();
		stock.save(FILEPATH);
		System.out.println("Welcome to stock market: ");
		System.out.println("What do you want to do?");
		System.out.println("1.Buy share\t 2.Sell Share");
		int input = Utility.reInteger();
		switch (input) {
		case 1:
			stock.sell(amount, stock_symbol);
			break;
		case 2 :stock.buy(amount, stock_symbol);
		}
	}

	@Override
	public CustomerInfo stockAccount(String fileName) {
		CustomerInfo customer = new CustomerInfo();
		return customer = userDetails();

	}

	private CustomerInfo userDetails() {
		CustomerInfo customer = new CustomerInfo();
		System.out.println("Enter Username: ");
		String userName = Utility.retNext();
		customer.setUserName(userName);
		System.out.println("Enter Phone_Number: ");
		long phoneNumber = Utility.readLong();
		customer.setPhoneNumber(phoneNumber);
		System.out.println("Enter your address: ");
		String address = Utility.retNext();
		customer.setAddress(address);
		long accountNumber = random.nextInt(10000);
		customer.setAccountNumber(accountNumber);
		return customer;
	}

	@Override
	public double valueOf() {
		return 0;
	}

	@Override
	public void buy(int amount, String symbol) {

	}

	@Override
	public void sell(int amount, String symbol) {

	}

	@Override
	public void save(String fileName) throws JsonGenerationException, JsonMappingException, IOException {
		CustomerDetails details = new CustomerDetails();

		CustomerInfo customer = new CustomerInfo();
		customer = stockAccount(fileName);

		details.getCustomerArray().add(customer);
		JsonUtil.convertJavaToJson(new File(FILEPATH), details);
		System.out.println("file write successfully");
	}

	@Override
	public void printReport() {

	}

}
