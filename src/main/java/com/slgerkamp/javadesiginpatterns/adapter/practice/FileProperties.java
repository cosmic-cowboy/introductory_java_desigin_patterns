package com.slgerkamp.javadesiginpatterns.adapter.practice;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;


/**
 * Adapterパターン（Wrapperパターン）
 * 
 * 適合される
 *
 */
@SuppressWarnings("serial")
public class FileProperties extends Properties implements FileIO {

	
	public void readFromFile(String fileName) throws IOException {
		load(new FileInputStream(fileName));
		System.out.println(this);
	}

	public void writeToFile(String fileName) throws IOException {
		System.out.println(this);
		store(new FileOutputStream(fileName), "written by FileProperties");
	}

	public void setValue(String key, String value) {
		setProperty(key, value);
	}

	public void getValue(String key) {
		getProperty(key);
	}

}
