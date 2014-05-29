package com.slgerkamp.javadesiginpatterns.factoryMethod.idcard;

import com.slgerkamp.javadesiginpatterns.factoryMethod.framework.Product;

/**
 * ファクトリメソッドパターン
 * インスタンスの作成をサブクラスにまかせる
 * 
 * Product（製品）
 * 生成される具象クラス
 * フレームワークから許された範囲内での実装を行う
 *
 */
public class IDCard extends Product{

	private final String owner;

	IDCard(String owner) {
		System.out.println(owner + "のカードを作ります");
		this.owner = owner;
	}
	
	@Override
	public void user() {
		System.out.println(getOwner() + "のカードを使います");
	}

	public String getOwner() {
		return owner;
	}


}
