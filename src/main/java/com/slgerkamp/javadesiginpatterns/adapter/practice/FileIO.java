package com.slgerkamp.javadesiginpatterns.adapter.practice;

import java.io.IOException;

/**
 * Adapterパターン（Wrapperパターン）
 * 
 * ターゲット
 *
 */
public interface FileIO {
	
	public void readFromFile(String fileName) throws IOException;

	public void writeToFile(String fileName) throws IOException;

	public void setValue(String key, String value);

	public void getValue(String key);
}
