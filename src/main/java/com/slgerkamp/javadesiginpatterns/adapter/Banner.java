package com.slgerkamp.javadesiginpatterns.adapter;

/**
 * Adapterパターン（Wrapperパターン）
 * 
 * 「すでに提供されているもの」
 *  Adaptee（適合される側）
 */
public class Banner {

	private String string;

	public Banner(String string) {

		this.string = string;
	}

	public void showWithParen(){
		System.out.println("(" + string + ")");
	}

	public void showWithAster(){
		System.out.println("*" + string + "*");
	}
}
