package com.slgerkamp.javadesiginpatterns.singleton.practice;

public class SingletonThreadSafe {

	private static SingletonThreadSafe singleton = null;
	
	private SingletonThreadSafe(){
		System.out.println("インスタンスを生成しました");
	}
	
	public synchronized static SingletonThreadSafe getInstance(){
		if(singleton == null){
			singleton = new SingletonThreadSafe();
		}
		return singleton;
	}
}
