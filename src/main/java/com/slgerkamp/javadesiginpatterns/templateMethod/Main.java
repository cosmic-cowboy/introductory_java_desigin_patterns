package com.slgerkamp.javadesiginpatterns.templateMethod;

/**
 * Template Method
 * 具体的な処理をサブクラスにまかせる
 *
 */
public class Main {

	public static void main(String[] args) {

		AbstractDisplay d1 = new CharDisplay('H');
		d1.display();
		
		AbstractDisplay d2 = new StringDisplay("Hello, world.");
		d2.display();
		
		AbstractDisplay d3 = new StringDisplay("こんにちは");
		d3.display();
		
	}
}
