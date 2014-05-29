package com.slgerkamp.javadesiginpatterns.factoryMethod.framework;

/**
 * ファクトリメソッドパターン
 * インスタンスの作成をサブクラスにまかせる
 * 
 * 抽象的な骨組み（フレームワーク）
 * Product（製品）
 * 生成されるインスタンスのインタフェースを定義
 * 
 */
public abstract class Product {
	public abstract void user();
}
