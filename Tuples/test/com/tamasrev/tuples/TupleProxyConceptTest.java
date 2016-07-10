package com.tamasrev.tuples;

import java.lang.reflect.Proxy;

public class TupleProxyConceptTest extends AbstractMutableTupleTest {

	@Override
	protected <T1, T2> Tuple2<T1, T2> createTuple2() {
		TupleInvocationHandler tih = new TupleInvocationHandler(2);
		return createProxyTuple(tih);
	}

	@SuppressWarnings("unchecked")
	private <T1, T2> Tuple2<T1, T2> createProxyTuple(TupleInvocationHandler tih) {
		return (Tuple2<T1, T2>) Proxy.newProxyInstance(getClass().getClassLoader(), new Class[] { Tuple2.class}, tih);
	}

	@Override
	protected <T1, T2> Tuple2<T1, T2> createTuple2(T1 v1, T2 v2) {
		TupleInvocationHandler tih = new TupleInvocationHandler(v1, v2);
		return createProxyTuple(tih);
	}

}
