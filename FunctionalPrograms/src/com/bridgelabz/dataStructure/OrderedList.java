package com.bridgelabz.dataStructure;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

import com.bridgelabz.utility.Utility;

public class OrderedList<T extends Comparable<T>> {
	public static void main(String[] args) throws IOException {
		String path = "/home/adminsitrator/Documents/JavaProgramming/FunctionalPrograms/src/com/bridgelabz/dataStructure/OrderedList";
		File file = new File(path);
		writeFile(file);
		String[] array = readFile(file);
		// converting string to int[]
		Integer[] array1 = new Integer[array.length];
		for (int i = 0; i < array.length; i++) {
			array1[i] = Integer.parseInt(array[i]);
		}
		// sort array
		Utility.bubbleSort(array1);
		for (int i = 0; i < array1.length; i++) {
			MyLinkedList.addElement(array1[i]);
		}
		SearchAndRemove(array1);
		MyLinkedList.display();
	}

	private static void SearchAndRemove(Integer[] array1) {
		System.out.println("Enter the number which you to search in the  list: ");
		Integer searchNumber = Utility.reInteger();
		boolean value = MyLinkedList.searchElement(searchNumber);
		if (value == true) {
			System.out.println("The word found in the List");
			MyLinkedList.removeElement(searchNumber);
			System.out.println("search word removed from the list");
		} else if (value == false) {
			System.out.println("Don't worry.We will add it into List");
			sortedStore(searchNumber);
			System.out.println("Your number added into the list");
		}
	}

	public static void sortedStore(Integer searchNumber) {
		int count = 0;
		for (int i = 0; i < MyLinkedList.size(); i++) {
			if (searchNumber.compareTo(MyLinkedList.getElement(i)) > 0) {
				count++;
			}
			MyLinkedList.addElementOnIndex(count, searchNumber);
			break;
		}
	}

	public static String[] readFile(File file) throws IOException {
		FileReader fReader = new FileReader(file);
		BufferedReader bReader = new BufferedReader(fReader);
		String string = bReader.readLine();
		String[] array = string.split(" ");
		return array;
	}

	public static void writeFile(File file) throws IOException {
		FileWriter fWriter = new FileWriter(file);
		BufferedWriter bWriter = new BufferedWriter(fWriter);
		System.out.println("Enter the nuumbers with space separated: ");
		String input = Utility.retNextLine();
		bWriter.write(input);
		bWriter.flush();
	}

}
