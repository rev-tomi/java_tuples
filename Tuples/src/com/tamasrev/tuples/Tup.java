package com.tamasrev.tuples;

import java.lang.reflect.Proxy;

public class Tup {

	public static <T1, T2> Tuple2<T1, T2> tup2() {
		TupleInvocationHandler tih = new TupleInvocationHandler(2);
		return createProxy2(tih);
	}

	public static <T1, T2> Tuple2<T1, T2> tup(T1 v1, T2 v2) {
		TupleInvocationHandler tih = new TupleInvocationHandler(v1, v2);
		return createProxy2(tih);
	}

	public static <T1, T2, T3> Tuple3<T1, T2, T3> tup3() {
		TupleInvocationHandler tih = new TupleInvocationHandler(3);
		return createProxy3(tih);
	}
	
	@SuppressWarnings("unchecked")
	private static <T1, T2> Tuple2<T1, T2> createProxy2(TupleInvocationHandler tih) {
		return (Tuple2<T1, T2>) Proxy.newProxyInstance(Tup.class.getClassLoader(), new Class[] { Tuple2.class}, tih);
	}
	
	@SuppressWarnings("unchecked")
	private static <T1, T2, T3> Tuple3<T1, T2, T3> createProxy3(TupleInvocationHandler tih) {
		return (Tuple3<T1, T2, T3>) Proxy.newProxyInstance(Tup.class.getClassLoader(), new Class[] { Tuple3.class}, tih);
	}
}
