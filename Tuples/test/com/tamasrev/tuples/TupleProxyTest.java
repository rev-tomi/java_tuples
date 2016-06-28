package com.tamasrev.tuples;

import java.lang.reflect.Proxy;

public class TupleProxyTest extends AbstractMutableTupleTest {

	@Override
	protected <T1, T2> Tuple2<T1, T2> createTuple2() {
		TupleInvocationHandler tih = new TupleInvocationHandler();
		return createProxyTuple(tih);
	}

	@SuppressWarnings("unchecked")
	private <T1, T2> Tuple2<T1, T2> createProxyTuple(TupleInvocationHandler tih) {
		return (Tuple2<T1, T2>) Proxy.newProxyInstance(getClass().getClassLoader(), new Class[] { Tuple2.class}, tih);
	}

}
