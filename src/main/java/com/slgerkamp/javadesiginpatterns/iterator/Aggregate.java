package com.slgerkamp.javadesiginpatterns.iterator;

/**
 * 集合体（インタフェース）
 * 何かしらの集まり
 *
 */
public interface Aggregate {

	/**
	 * 集合体に対する処理を司る
	 * @return
	 */
	public abstract Iterator iterator();
}
