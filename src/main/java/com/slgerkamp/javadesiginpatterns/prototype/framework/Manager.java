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

	private HashMap<PrototypeName, Product> showcase = new HashMap<PrototypeName, Product>();
	
	/**
	 * Productのプロトタイプを登録する
	 * 
	 * @param name:Productの名前
	 * @param proto:Productの種類
	 */
	public void register(PrototypeName protoname, Product proto){
		showcase.put(protoname, proto);
	}
	
	/**
	 * 登録されたプロトタイプを複製する
	 * 
	 * @param protoname:Productの名前
	 * @return
	 */
	public Product create(PrototypeName protoname){
		Product p = showcase.get(protoname);
		return p.craeteClone();
	}
}
