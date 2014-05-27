package com.slgerkamp.javadesiginpatterns.iterator;

/**
 * 本棚の数え上げクラス
 * 本棚の数え上げ（スキャン）を行うため、Iteratorクラスを実装
 * hasNext, nextメソッドを実装
 * 
 * 本棚自体と数え上げを行う機能は分離する
 * 本棚に登録されている書籍は変わらないので。
 *
 */
public class BookShelfIterator implements Iterator {

	// 本棚（集合体）
	private BookShelf bookShelf;
	
	// 数え上げの位置（本の添え字）
	private int index;

	/**
	 * @param bookShelf
	 */
	public BookShelfIterator(BookShelf bookShelf) {
		this.bookShelf = bookShelf;
		this.index = 0;
	}	
	
	/* (非 Javadoc)
	 * @see com.slgerkamp.javadesiginpatterns.iterator.Iterator#hasNext()
	 * 次の本があるか
	 */
	public boolean hasNext() {
		if (index < bookShelf.getLength()){
			return true;
		} else {
			return false;
		}
	}

	/* (非 Javadoc)
	 * @see com.slgerkamp.javadesiginpatterns.iterator.Iterator#next()
	 * 次の本を返却する
	 */
	public Object next() {
		// 本を取り出す
		Book book = bookShelf.getBookAt(index);
		// 次に取り出す本の位置をずらす
		index++;
		return book;

	}


}
