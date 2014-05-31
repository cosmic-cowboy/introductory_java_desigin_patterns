package com.slgerkamp.javadesiginpatterns.prototype;

import com.slgerkamp.javadesiginpatterns.prototype.framework.Product;

/**
 * Prototypeパターン
 * 
 * 具体的な原型
 *
 */
public class MessageBox implements Product{

	private final char decochar;
	
	public MessageBox(char decochar) {
		this.decochar = decochar;
	}

	/* (非 Javadoc)
	 * @see com.slgerkamp.javadesiginpatterns.prototype.framework.Product#use(java.lang.String)
	 */
	public void use(String string) {
		int length = string.getBytes().length;
		// 前飾り
		for(int i = 0; i < length + 4; i++){
			System.out.print(decochar);
		}
		System.out.println();
		
		System.out.println(decochar + string + decochar);		
		
		// 後飾り
		for(int i = 0; i < length + 4; i++){
			System.out.print(decochar);
		}
		System.out.println();		
	}

	/* (非 Javadoc)
	 * @see com.slgerkamp.javadesiginpatterns.prototype.framework.Product#craeteClone()
	 */
	public Product craeteClone() {
		Product product = null;
		
		try {
			product = (Product) clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
		return product;
	}

}
