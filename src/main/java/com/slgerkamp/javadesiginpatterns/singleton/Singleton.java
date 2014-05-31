package com.slgerkamp.javadesiginpatterns.singleton;

/**
 * Singletonパターン
 * インスタンスが１つしか存在しないことを保証する
 * 
 *
 */
public class Singleton {

	// 唯一のインスタンス
	// クラス変数として定義する
	private static final Singleton singleton = new Singleton();
	
	// コンストラクタ
	// クラス生成はクラス内でしか行えないようにする
	private Singleton(){
		System.out.println("クラス生成");
	};
	
	/**
	 * インスタンスの呼び出しメソッド
	 * 必ず同じインスタンスが返却されることを保証する
	 * クラスメソッドとして定義する
	 * 
	 * @return
	 */
	public static Singleton getInstance(){
		return singleton;
	}
	
	
}
