package com.slgerkamp.javadesiginpatterns.iterator;

/**
 * 本棚クラス
 * 本を格納する集合体でAggregateクラスを実装
 * iteratorメソッドを実装
 * iteratorメソッドを実装し、数え上げの機能を委譲することで、
 * booksが配列だろうと、ArrayListだろうと、
 * whileで使われている、hasNextやnextメソッドを変更する必要がなくなる
 */
public class BookShelf implements Aggregate{

	// 本の配列
	private Book[] books;
	
	//　本棚に格納されている本の数
	private int last = 0;
	
	/**
	 * 本棚を作成
	 * 格納できる最大値も一緒に指定
	 * @param maxsize 最大格納数
	 */
	public BookShelf(int maxsize){
		this.books = new Book[maxsize];
	}
	
	//　本棚から指定の場所にある本を取得
	public Book getBookAt(int index){
		return books[index];
	}
	
	//　本棚に本を格納
	public void appendBook(Book book){
		this.books[last] = book;
		last++;
	}
	
	//　本棚に格納されている書籍数
	public int getLength(){
		return last;
	}
	
	/* (非 Javadoc)
	 * @see com.slgerkamp.javadesiginpatterns.iterator.Aggregate#iterator()
	 * 本棚の本を数え上げるためのクラスを返却する
	 */
	public Iterator iterator() {
		return new BookShelfIterator(this);
	}

}
