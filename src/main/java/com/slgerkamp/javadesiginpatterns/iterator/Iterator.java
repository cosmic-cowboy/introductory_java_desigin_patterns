package com.slgerkamp.javadesiginpatterns.iterator;

/**
 * イテレータ（反復子）
 * 要素の数え上げをおこなう（インタフェース）
 * 要素を順番にスキャンしていく
 * ループ変数のような役割を果たす
 * （注）集合体は持たない
 * 
 * イテレータを使うことで、
 * 集合体を数え上げる際、
 * 実装に依存せずに処理を行うことができる。
 * 値を取得することができる。
 * 
 * 様々な種類のイテレータを作成することが可能に
 * 降順・昇順などなど
 */
public interface Iterator {
	
	/**
	 * 集合体に次の要素が存在するか
	 * @return
	 */
	public abstract boolean hasNext();
	
	/**
	 * 集合体の次の要素を返却する
	 * @return
	 */
	public abstract Object next();
}
