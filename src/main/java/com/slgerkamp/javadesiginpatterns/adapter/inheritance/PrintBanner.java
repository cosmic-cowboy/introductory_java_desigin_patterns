package com.slgerkamp.javadesiginpatterns.adapter.inheritance;

import com.slgerkamp.javadesiginpatterns.adapter.Banner;

/**
 * Adapterパターン（Wrapperパターン）：継承編
 * 
 * すでに提供されているものがそのまま使えない場合、
 * 必要な形に変換してから利用する
 * 「すでに提供されているもの」「必要なもの」のズレを埋める
 * 
 * Banner：「すでに提供されているもの」
 * Print ：「必要なもの」
 * 
 * Adapter（アダプタ）
 * Adaptee「すでに提供されているもの」を使って、
 * Target「必要なもの」を満たす
 */
public class PrintBanner extends Banner implements Print{

	/**
	 * すでに提供されているもの
	 * @param string
	 */
	public PrintBanner(String string) {
		super(string);
	}

	// 変換処理（アダプターまたはラップ）
	public void printWeak() {
		// すでに提供されているもの
		showWithParen();
	}

	// 変換処理（アダプターまたはラップ）
	public void printStrong() {
		// すでに提供されているもの
		showWithAster();
	}

}
