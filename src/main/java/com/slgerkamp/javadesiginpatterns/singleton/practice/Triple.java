package com.slgerkamp.javadesiginpatterns.singleton.practice;

public class Triple {

	private static final Triple[] triples = 
		new Triple[]{
			new Triple(0),
			new Triple(1),
			new Triple(2)
		};

	private final int id;
	
	private Triple(int id){
		this.id = id;
	};
	
	public static Triple getInstace(int id){
		return triples[id];
	}

	public int getId() {
		return id;
	}
}
