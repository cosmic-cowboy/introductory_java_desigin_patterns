package com.slgerkamp.javadesiginpatterns.templateMethod;

/**
 * Template Method
 * 具体的な処理をサブクラスにまかせる
 * 
 * 
 *
 */
public abstract class AbstractDisplay {
	
	/**
	 * サブクラスに実装をまかせる
	 * 抽象メソッド
	 * 
	 * displayメソッドの最初に実行される
	 */
	public abstract void open();

	/**
	 * サブクラスに実装をまかせる
	 * 抽象メソッド
	 * 
	 * displayメソッドの中で表示のメインの処理を行う
	 */
	public abstract void print();

	/**
	 * サブクラスに実装をまかせる
	 * 抽象メソッド
	 * 
	 * displayメソッドの最後に実行される
	 */
	public abstract void close();

	/**
	 * テンプレートメソッド
	 * このデザインパターンの肝
	 * 
	 * 実体がない抽象メソッドを使用。
	 * 処理の詳細はサブクラスにまかせるが、
	 * おおまかな動きはこのクラスで制御する
	 * 
	 */
	public final void display(){
		open();
		for(int i = 0; i < 5; i++){
			print();
		}
		close();
	};
}
