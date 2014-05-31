package com.slgerkamp.javadesiginpatterns.singleton.practice;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

public class TripleTest {

	@Test
	public void Tripleクラスが３つのインスタンスを持っている(){
		
		Triple instace01 = Triple.getInstace(0);
		Triple instace02 = Triple.getInstace(0);

		Triple instace11 = Triple.getInstace(1);
		Triple instace12 = Triple.getInstace(1);

		Triple instace21 = Triple.getInstace(2);
		Triple instace22 = Triple.getInstace(2);

		// instace01, instace02が同じインスタンスであること
		assertThat(instace01, is(sameInstance(instace02)));
		// instace01とinstace11, instace21が異なるインスタンスであること
		assertThat(instace01, is(not(sameInstance(instace11))));
		assertThat(instace01, is(not(sameInstance(instace21))));

		// instace11, instace12が同じインスタンスであること
		assertThat(instace11, is(sameInstance(instace12)));
		// instace11とinstace21が異なるインスタンスであること
		assertThat(instace11, is(not(sameInstance(instace21))));

		// instace21, instace22が同じインスタンスであること
		assertThat(instace21, is(sameInstance(instace22)));
		
		assertThat(instace01.getId(), is(0));
		assertThat(instace02.getId(), is(0));
		
		assertThat(instace11.getId(), is(1));
		assertThat(instace12.getId(), is(1));
		
		assertThat(instace21.getId(), is(2));
		assertThat(instace22.getId(), is(2));

	}
}
