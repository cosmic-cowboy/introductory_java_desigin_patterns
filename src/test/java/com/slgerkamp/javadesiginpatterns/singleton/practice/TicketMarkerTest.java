package com.slgerkamp.javadesiginpatterns.singleton.practice;

import org.junit.Test;
import static org.junit.Assert.*;


public class TicketMarkerTest {

	@Test
	public void シングルトンのTicketMaker(){

		TicketMaker maker01 = TicketMaker.getInstance();		
		TicketMaker maker02 = TicketMaker.getInstance();		
		assertEquals(maker01, maker02);
		assertEquals(maker01.hashCode(), maker02.hashCode());
		assertEquals(maker01.toString(), maker02.toString());
		
		assertEquals(maker01.getNextTicketNumber(), 1000);
		assertEquals(maker02.getNextTicketNumber(), 1001);
		assertEquals(maker01.getNextTicketNumber(), 1002);
		assertEquals(maker02.getNextTicketNumber(), 1003);

	}
}
