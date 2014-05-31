package com.slgerkamp.javadesiginpatterns.prototype;

import com.slgerkamp.javadesiginpatterns.prototype.framework.Product;

/**
 * Prototypeパターン
 * 
 * 具体的な原型
 *
 */
public class UnderlinePen extends Product{

	private final char ulchar;
	
	public UnderlinePen(char ulchar) {
		this.ulchar = ulchar;
	}
	
	/* (非 Javadoc)
	 * @see com.slgerkamp.javadesiginpatterns.prototype.framework.Product#use(java.lang.String)
	 */
	public void use(String string) {
		int length = string.getBytes().length;
		// 
		System.out.println("\"" + string + "\"" );
		
		// アンダーライン
		System.out.print(" ");
		for(int i = 0; i < length; i++){
			System.out.print(ulchar);
		}
		System.out.println();		
	}

}
