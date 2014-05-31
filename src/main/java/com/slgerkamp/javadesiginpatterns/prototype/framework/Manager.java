package com.slgerkamp.javadesiginpatterns.prototype.framework;

import java.util.HashMap;

/**
 * Prototypeパターン
 * クライアント（利用者）
 * 
 * Productインタフェースを利用して
 * インスタンスを複製するクラス
 *
 */
public class Manager {

	private HashMap<String, Product> showcase = new HashMap<String, Product>();
	
	/**
	 * Productのプロトタイプを登録する
	 * 
	 * @param name:Productの名前
	 * @param proto:Productの種類
	 */
	public void register(String name, Product proto){
		showcase.put(name, proto);
	}
	
	/**
	 * 登録されたプロトタイプを複製する
	 * 
	 * @param protoname:Productの名前
	 * @return
	 */
	public Product create(String protoname){
		Product p = showcase.get(protoname);
		return p.craeteClone();
	}
}
