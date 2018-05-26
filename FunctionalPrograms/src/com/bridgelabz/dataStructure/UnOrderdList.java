package com.bridgelabz.dataStructure;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import com.bridgelabz.utility.Utility;

public class UnOrderdList {
	private static String[] readFile(String path) throws IOException {
		FileReader fRead = new FileReader(path);
		BufferedReader bReader = new BufferedReader(fRead);
		String string = bReader.readLine();
		String[] array = string.split(",");
		return array;
	}

	public static void writeFile(File file) throws IOException {
		FileWriter fWriter = new FileWriter(file);
		System.out.println("Enter the words whith comma separated: ");
		String input = Utility.retNextLine();
		BufferedWriter bWriter = new BufferedWriter(fWriter);
		bWriter.write(input);
		bWriter.flush();
	}
	private static void SearchAndRemove(String[] array) {
		for (int i = 0; i < array.length; i++) {
			MyLinkedList.addElement(array[i]);
		}
		System.out.println("Enter the word which you to search in the  list: ");
		String searchWord = Utility.retNext();
		boolean value = MyLinkedList.searchElement(searchWord);
		if (value == true) {
			System.out.println("The word found in the List");
			MyLinkedList.removeElement(searchWord);
			System.out.println("search word removed from the list");
		} else if (value == false) {
			System.out.println("Don't worry.We will add it into List");
			MyLinkedList.addElement(searchWord);
		}
		MyLinkedList.display();
	}

	public static void main(String[] args) throws IOException {
		String path = "/home/adminsitrator/Documents/JavaProgramming/FunctionalPrograms/src/com/bridgelabz/dataStructure/UnOrderdList";
		File file = new File(path);
		writeFile(file);
		String[] array = readFile(path);
		SearchAndRemove(array);
	}
}
