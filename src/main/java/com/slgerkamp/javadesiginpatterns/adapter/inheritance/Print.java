package com.slgerkamp.javadesiginpatterns.adapter.inheritance;

/**
 * Adapterパターン（Wrapperパターン）：継承編
 * 
 * 「必要なもの」
 *  Target(対象)
 * 
 */
public interface Print {

	public abstract void printWeak();

	public abstract void printStrong();

}
