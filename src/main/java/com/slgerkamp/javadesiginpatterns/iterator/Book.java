package com.slgerkamp.javadesiginpatterns.iterator;

/**
 * 本クラス
 * 集合体に格納される要素
 *
 */
public class Book {
	private String name;

	public Book(String name){
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
}
