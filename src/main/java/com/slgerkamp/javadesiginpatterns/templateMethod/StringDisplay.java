package com.slgerkamp.javadesiginpatterns.templateMethod;

/**
 * Template Method
 * 具体的な処理をサブクラスにまかせる
 * 
 * サブクラス（具象クラス）
 *
 */
public class StringDisplay extends AbstractDisplay {

	private final String string;
	private final int width;
	
	public StringDisplay(String string) {
		this.string = string;
		this.width  = string.getBytes().length;
	}

	// 抽象メソッドの実装
	@Override
	public void open() {
		printLine();
	}

	// 抽象メソッドの実装
	@Override
	public void print() {
		System.out.println("|" + string + "|");
	}

	// 抽象メソッドの実装
	@Override
	public void close() {
		printLine();
	}

	private void printLine() {
		System.out.print("+");
		for(int i = 0; i < width; i++){
			System.out.print("-");
		}
		System.out.println("+");
	}

}
