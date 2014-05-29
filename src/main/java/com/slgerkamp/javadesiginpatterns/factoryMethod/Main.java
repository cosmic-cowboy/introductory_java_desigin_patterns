package com.slgerkamp.javadesiginpatterns.factoryMethod;

import com.slgerkamp.javadesiginpatterns.factoryMethod.framework.Factory;
import com.slgerkamp.javadesiginpatterns.factoryMethod.framework.Product;
import com.slgerkamp.javadesiginpatterns.factoryMethod.idcard.IDCardFactory;

/**
 * ファクトリメソッドパターン
 * インスタンスの作成をサブクラスにまかせる
 * 
 *
 */
public class Main {

	public static void main(String[] args) {
		Factory factory = new IDCardFactory();
		
		Product orico_card = factory.create("オリコ");
		Product alico_card = factory.create("アリコ");
		Product nanako_card = factory.create("ナナコ");
		
		orico_card.user();
		alico_card.user();
		nanako_card.user();
		
	}
}
