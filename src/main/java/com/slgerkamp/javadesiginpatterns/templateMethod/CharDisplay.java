package com.slgerkamp.javadesiginpatterns.templateMethod;

/**
 * Template Method
 * 具体的な処理をサブクラスにまかせる
 * 
 * サブクラス（具象クラス）
 *
 */
public class CharDisplay extends AbstractDisplay {

	private final char ch;

	public CharDisplay(char ch){
		this.ch = ch;
	}
	
	// 抽象メソッドの実装
	@Override
	public void open() {
		System.out.print("<<<");
	}

	// 抽象メソッドの実装
	@Override
	public void print() {
		System.out.print(ch);
	}

	// 抽象メソッドの実装
	@Override
	public void close() {
		System.out.println(">>>");
	}

}
