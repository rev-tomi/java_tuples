package com.tamasrev.tuples;

import org.junit.Test;

public class FactoryTripleTupleTest {

	@Test
	public void testCreateTuple() {
		// GIVEN
		Tuple3<Integer, String, Long> tup3 = Tup.tup3();
		
		// WHEN
		tup3.set1(42);
		tup3.set2("salala");
		tup3.set3(12147483647L);
	}
}
