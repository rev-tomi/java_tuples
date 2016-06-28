package com.tamasrev.tuples;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public abstract class AbstractMutableTupleTest {

	@Test
	public void testTupleAccessors() {
		// GIVEN
		Tuple2<String, Integer> tup2 = createTuple2();
		
		// WHEN
		tup2.set1("asdf");
		tup2.set2(12);
		
		// THEN
		assertEquals("asdf", tup2.get1());
		assertEquals(new Integer(12), tup2.get2());
	}

	@Test
	public void testTupleAccessorsChangedOrder() {
		// GIVEN
		Tuple2<String, Integer> tup2 = createTuple2();
		
		// WHEN
		tup2.set2(12);
		tup2.set1("asdf");
		
		// THEN
		assertEquals("asdf", tup2.get1());
		assertEquals(new Integer(12), tup2.get2());
	}
	
	@Test
	public void testTuplePrepopulated() {
		// GIVEN
		Tuple2<String, Integer> tup = createTuple2("asdf", 12);
		
		// THEN
		assertEquals("asdf", tup.get1());
		assertEquals(new Integer(12), tup.get2());
	}
	
	protected abstract <T1, T2> Tuple2<T1, T2> createTuple2();
	protected abstract <T1, T2> Tuple2<T1, T2> createTuple2(T1 v1, T2 v2);

}
