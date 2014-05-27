package com.slgerkamp.javadesiginpatterns.iterator.practice;

import java.util.ArrayList;
import java.util.List;

import com.slgerkamp.javadesiginpatterns.iterator.*;

public class BookShelfArrayList implements Aggregate{

	private final List<Book> bookShelf;
	
	public BookShelfArrayList(){
		bookShelf = new ArrayList<Book>();
	}
	
	public void appendBook(Book book){
		bookShelf.add(book);
	}
	
	public Book getBookAt(int index){
		return bookShelf.get(index);
	}
	
	public int getLength(){
		return bookShelf.size();
	}
	
	public Iterator iterator() {
		return new BookShelfIteratorArrayList(this);
	}

}
