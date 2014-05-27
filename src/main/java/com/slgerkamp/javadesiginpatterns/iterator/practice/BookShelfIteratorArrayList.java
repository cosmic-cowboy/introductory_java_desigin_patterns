package com.slgerkamp.javadesiginpatterns.iterator.practice;

import com.slgerkamp.javadesiginpatterns.iterator.Book;
import com.slgerkamp.javadesiginpatterns.iterator.Iterator;

public class BookShelfIteratorArrayList implements Iterator {

	private final BookShelfArrayList bookShelfArrayList;
	
	private int index;
	
	public BookShelfIteratorArrayList(BookShelfArrayList bookShelfArrayList) {
		this.bookShelfArrayList = bookShelfArrayList;
		index = 0;
	}

	public boolean hasNext() {
		return bookShelfArrayList.getLength() > index;
	}

	public Object next() {
		Book book = bookShelfArrayList.getBookAt(index);
		index++;
		return book;
	}

}
