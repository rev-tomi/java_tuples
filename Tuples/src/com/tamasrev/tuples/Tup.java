package com.tamasrev.tuples;

import java.lang.reflect.Proxy;

public class Tup {

	public static <T1, T2> Tuple2<T1, T2> tup2() {
		TupleInvocationHandler tih = new TupleInvocationHandler();
		return createProxy(tih);
	}

	public static <T1, T2> Tuple2<T1, T2> tup(T1 v1, T2 v2) {
		TupleInvocationHandler tih = new TupleInvocationHandler(v1, v2);
		return createProxy(tih);
	}
	
	@SuppressWarnings("unchecked")
	private static <T1, T2> Tuple2<T1, T2> createProxy(TupleInvocationHandler tih) {
		return (Tuple2<T1, T2>) Proxy.newProxyInstance(Tup.class.getClassLoader(), new Class[] { Tuple2.class}, tih);
	}
}
