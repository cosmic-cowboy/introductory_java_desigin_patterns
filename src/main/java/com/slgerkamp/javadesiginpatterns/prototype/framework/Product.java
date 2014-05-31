package com.slgerkamp.javadesiginpatterns.prototype.framework;

/**
 * Prototypeパターン
 * プロダクト（製品）
 * 
 * クライアントが利用するインタフェースを提供する
 */
public interface Product extends Cloneable{

	/**
	 * 利用
	 * 実装クラスが設定
	 */
	public void use(String string);
	
	/**
	 * インスタンスを複製する
	 * 複製方法は実装クラスが設定
	 * @return
	 */
	public Product craeteClone();
	
}
