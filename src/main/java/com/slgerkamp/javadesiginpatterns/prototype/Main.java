package com.slgerkamp.javadesiginpatterns.prototype;

import com.slgerkamp.javadesiginpatterns.prototype.framework.Manager;
import com.slgerkamp.javadesiginpatterns.prototype.framework.Product;
import com.slgerkamp.javadesiginpatterns.prototype.framework.PrototypeName;

public class Main {
	public static void main(String[] args) {

		// プロトタイプ管理マネージャー生成
		Manager manager = new Manager();
		// プロトタイプ生成
		UnderlinePen pen = new UnderlinePen('~');
		MessageBox abox = new MessageBox('*');
		MessageBox sbox = new MessageBox('/');
		
		// マネージャーに登録
		manager.register(PrototypeName.STRONG_MESSAGE, pen);
		manager.register(PrototypeName.WARNING_BOX, abox);
		manager.register(PrototypeName.SLASH_BOX, sbox);
		
		// 生成
		Product pro01 = manager.create(PrototypeName.STRONG_MESSAGE);
		pro01.use("Hello World");
		Product pro02 = manager.create(PrototypeName.WARNING_BOX);
		pro02.use("Hello World");
		Product pro03 = manager.create(PrototypeName.SLASH_BOX);
		pro03.use("Hello World");
		
	}
}
