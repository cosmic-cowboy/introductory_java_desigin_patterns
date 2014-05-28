package com.slgerkamp.javadesiginpatterns.adapter;


/**
 * Adapterパターン（Wrapperパターン）
 * 
 * クライアント（依頼者）
 * Target役のメソッドが必要
 *
 */
public class Main {

	public static void main(String[] args) {
		
		// 継承パターン
		System.out.println("継承パターン");
		
		com.slgerkamp.javadesiginpatterns.adapter.inheritance.Print inheritancePrint = 
				new com.slgerkamp.javadesiginpatterns.adapter.inheritance.PrintBanner("Hello");
		
		inheritancePrint.printWeak();

		inheritancePrint.printStrong();

		// 委譲パターン
		System.out.println("委譲パターン");

		com.slgerkamp.javadesiginpatterns.adapter.delegate.Print delegatePrint = 
				new com.slgerkamp.javadesiginpatterns.adapter.delegate.PrintBanner("Hello");

		delegatePrint.printWeak();

		delegatePrint.printStrong();

	}
}
