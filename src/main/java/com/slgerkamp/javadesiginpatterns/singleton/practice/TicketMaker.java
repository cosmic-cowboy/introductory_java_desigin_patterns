package com.slgerkamp.javadesiginpatterns.singleton.practice;

public class TicketMaker {

	private static final TicketMaker instace = new TicketMaker();
	
	private TicketMaker(){};
	
	private int ticket = 1000;
	
	public static TicketMaker getInstance(){
		return instace;
	}
	
	public synchronized int getNextTicketNumber() {
		return ticket++;
	}
}
