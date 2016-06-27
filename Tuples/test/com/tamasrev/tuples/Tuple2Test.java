package com.tamasrev.tuples;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

import java.lang.reflect.Proxy;

public class Tuple2Test {

	@Test
	public void testTupleAccessors() {
		// GIVEN
		Tuple2<String, Integer> tup2 = new Tuple2Impl<>();
		
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
		Tuple2<String, Integer> tup2 = new Tuple2Impl<>();
		
		// WHEN
		tup2.set2(12);
		tup2.set1("asdf");
		
		// THEN
		assertEquals("asdf", tup2.get1());
		assertEquals(new Integer(12), tup2.get2());
	}

	@Test
	public void testTupleConstructor() {
		// GIVEN
		Tuple2<String, Integer> tup2 = new Tuple2Impl<>("asdf", 12);
		
		// THEN
		assertEquals("asdf", tup2.get1());
		assertEquals(new Integer(12), tup2.get2());
	}

	@Test
	public void testTupleProxy() {
		// GIVEN
		TupleInvocationHandler tih = new TupleInvocationHandler();
		Tuple2<String, Integer> tup2 = (Tuple2<String, Integer>) Proxy.newProxyInstance(getClass().getClassLoader(), new Class[] { Tuple2.class}, tih);
		
		// WHEN
		tup2.set1("asdf");
		tup2.set2(12);
		
		// THEN
		assertEquals("asdf", tup2.get1());
		assertEquals(new Integer(12), tup2.get2());
	}

	@Test
	public void testTupleProxyChangedOrder() {
		// GIVEN
		TupleInvocationHandler tih = new TupleInvocationHandler();
		Tuple2<String, Integer> tup2 = (Tuple2<String, Integer>) Proxy.newProxyInstance(getClass().getClassLoader(), new Class[] { Tuple2.class}, tih);
		
		// WHEN
		tup2.set2(12);
		tup2.set1("asdf");
		
		// THEN
		assertEquals("asdf", tup2.get1());
		assertEquals(new Integer(12), tup2.get2());
	}
}
