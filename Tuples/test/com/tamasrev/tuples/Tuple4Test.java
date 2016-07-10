package com.tamasrev.tuples;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class Tuple4Test {

	@Test
	public void testTupleWithAccessors() {
		// GIVEN
		Tuple4<Integer, String, Long, char[]> tup4 = Tup.tup4();
		
		// WHEN
		tup4.set1(42);
		tup4.set2("salala");
		tup4.set3(12147483647L);
		tup4.set4(new char[] {'a', 's', 'd', 'f'});
		
		// THEN
		assertEquals(new Integer(42), tup4.get1());
		assertEquals("salala", tup4.get2());
		assertEquals(new Long(12147483647L), tup4.get3());
		assertArrayEquals(new char[] {'a', 's', 'd', 'f'}, tup4.get4());
	}
	
	
	@Test
	public void testPrepopulatedTuple() {
		// GIVEN
		Tuple4<Integer, String, Long, char[]> tup4 = Tup.tup4(42, "salala", 12147483647L, new char[] {'a', 's', 'd', 'f'});
		
		// THEN
		assertEquals(new Integer(42), tup4.get1());
		assertEquals("salala", tup4.get2());
		assertEquals(new Long(12147483647L), tup4.get3());
		assertArrayEquals(new char[] {'a', 's', 'd', 'f'}, tup4.get4());
	}


}
