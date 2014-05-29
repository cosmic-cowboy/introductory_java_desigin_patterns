package com.slgerkamp.javadesiginpatterns.factoryMethod.framework;

/**
 * ファクトリメソッドパターン
 * インスタンスの作成をサブクラスにまかせる
 * 
 * 抽象的な骨組み（フレームワーク）
 * Creator（作成者）
 * 生成する抽象クラス
 * 生成に関するおおまかな流れは司る
 *
 */
public abstract class Factory {

	/**
	 * 
	 * ファクトリメソッドパターンの肝
	 * 
	 * 生成に関数おおまかな流れを司る
	 * @param owner
	 * @return
	 */
	public final Product create(String owner){
		Product p = createProduct(owner);
		registerProduct(p);
		return p;
	}

	/**
	 * 抽象メソッドにして実装を継承クラスにまかせる
	 * このメソッドに実装をして、必要な場合だけ実装するというやり方も可能
	 * @param p
	 */
	protected abstract void registerProduct(Product p);

	/**
	 * 抽象メソッドにして実装を継承クラスにまかせる
	 * 実装しないとコンパイルエラーになる
	 * 
	 * このメソッドに実装をして、必要な場合だけ実装するというやり方も可能
	 * このメソッドにエラー発生するように実装することもできる。
	 * その場合、サブクラスに実装がないと実行時エラが発生する
	 * @param owner
	 * @return
	 */
	protected abstract Product createProduct(String owner);
}
