package com.tamasrev.tuples;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Tuple2Test {

	@Test
	public void testTupleConstructor() {
		// GIVEN
		Tuple2<String, Integer> tup2 = new Tuple2Impl<>("asdf", 12);
		
		// THEN
		assertEquals("asdf", tup2.get1());
		assertEquals(new Integer(12), tup2.get2());
	}
}
