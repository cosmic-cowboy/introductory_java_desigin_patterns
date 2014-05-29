package com.slgerkamp.javadesiginpatterns.factoryMethod.idcard;

import java.util.ArrayList;
import java.util.List;

import com.slgerkamp.javadesiginpatterns.factoryMethod.framework.Factory;
import com.slgerkamp.javadesiginpatterns.factoryMethod.framework.Product;

/**
 * ファクトリメソッドパターン
 * インスタンスの作成をサブクラスにまかせる
 * 
 * Creator（作成者）
 * 生成する具象クラス
 * フレームワークから許された範囲内での実装を行う
 *
 */
public class IDCardFactory extends Factory{

	private final List<String> IDcardList = new ArrayList<String>();
	@Override
	protected void registerProduct(Product p) {
		IDcardList.add(((IDCard)p).getOwner());
	}

	@Override
	protected Product createProduct(String owner) {
		return new IDCard(owner);
	}

	public List<String> getIDcardList() {
		return IDcardList;
	}

}
