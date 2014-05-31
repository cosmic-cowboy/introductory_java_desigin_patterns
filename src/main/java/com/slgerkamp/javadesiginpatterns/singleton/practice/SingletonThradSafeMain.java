package com.slgerkamp.javadesiginpatterns.singleton.practice;

public class SingletonThradSafeMain extends Thread{

	public static void main(String[] args) {

		new SingletonThradSafeMain().start();
		new SingletonThradSafeMain().start();
		new SingletonThradSafeMain().start();
		
		
	}
	

	@Override
    public void run(){
		SingletonThreadSafe anonymous = SingletonThreadSafe.getInstance();
        System.out.println(anonymous.hashCode());
    }

}
