package com.slgerkamp.javadesiginpatterns.singleton;

import org.junit.Test;
import static org.junit.Assert.*;


public class SingletonTest {

	@Test
	public void インスタンスがひとつ(){
		
		Singleton singleton1 = Singleton.getInstance();
		Singleton singleton2 = Singleton.getInstance();
		
		assertEquals(singleton1, singleton2);
		assertEquals(singleton1.hashCode(), singleton2.hashCode());
		assertEquals(singleton1.toString(), singleton2.toString());
	}
}
