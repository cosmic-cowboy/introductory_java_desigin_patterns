package com.slgerkamp.javadesiginpatterns.adapter.practice;

import java.io.IOException;


/**
 * Adapterパターン（Wrapperパターン）
 * 
 * クライアント
 *
 */
public class Main {
	
	public static void main(String[] args) {
		
		FileIO file = new FileProperties();
		
		try {
			file.readFromFile("adapterForPractice/file.txt");
			file.setValue("year", "2004");
			file.setValue("month", "4");
			file.setValue("day", "21");
			file.writeToFile("adapterForPractice/newFile.txt");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
