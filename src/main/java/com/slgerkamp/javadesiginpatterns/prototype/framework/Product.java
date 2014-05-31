package com.slgerkamp.javadesiginpatterns.prototype.framework;

/**
 * Prototypeパターン
 * プロダクト（製品）
 * 
 * クライアントが利用するインタフェースを提供する
 */
public abstract class Product implements Cloneable{

	/**
	 * 利用
	 * 実装クラスが設定
	 */
	public abstract void use(String string);
	
	/**
	 * インスタンスを複製する
	 * 複製方法は実装クラスが設定
	 * @return
	 */
	public Product craeteClone() {
		Product product = null;
		
		try {
			product = (Product) clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
		return product;
	}
	
}
