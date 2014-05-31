package com.slgerkamp.javadesiginpatterns.singleton.practice;

public class SingletonMain extends Thread{

	public static void main(String[] args) {

		new SingletonMain().start();
		new SingletonMain().start();
		new SingletonMain().start();
		
		
	}
	

	@Override
    public void run(){
        Singleton anonymous = Singleton.getInstance();
        System.out.println(anonymous.hashCode());
    }

}
