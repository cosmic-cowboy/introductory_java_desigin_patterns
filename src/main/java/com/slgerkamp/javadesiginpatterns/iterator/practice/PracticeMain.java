package com.slgerkamp.javadesiginpatterns.iterator.practice;

import com.slgerkamp.javadesiginpatterns.iterator.*;

public class PracticeMain {
	public static void main(String[] args) {
		BookShelfArrayList bookShelf = new BookShelfArrayList();
		bookShelf.appendBook(new Book("Around the World in 80 Days"));
		bookShelf.appendBook(new Book("Bible"));
		bookShelf.appendBook(new Book("Cinderella"));
		bookShelf.appendBook(new Book("Daddy-Long-Legs"));

		// シンデレラが見つかるまで
		Iterator it = bookShelf.iterator();
		System.out.println("最初のイテレータ");
		while (it.hasNext()) {
			Book book = (Book) it.next();
			System.out.println(book.getName());
			if(book.getName().equals("Cinderella")){
				break;
			}
		}

		// 最後まで
		Iterator it2 = bookShelf.iterator();
		System.out.println("２番目のイテレータ");
		while (it2.hasNext()) {
			Book book = (Book) it2.next();
			System.out.println(book.getName());
		}

		System.out.println("ふたたび最初のイテレータ");
		while (it.hasNext()) {
			Book book = (Book) it.next();
			System.out.println(book.getName());
		}
	}
}
