package com.tamasrev.tuples;

import java.lang.reflect.Proxy;

public class Tup {

	public static <T1, T2> Tuple2<T1, T2> tup2() {
		return Tup.<Tuple2<T1, T2>>createProxy(Tuple2.class, 2);
	}

	public static <T1, T2> Tuple2<T1, T2> tup(T1 v1, T2 v2) {
		return createProxy(Tuple2.class, v1, v2);
	}

	public static <T1, T2, T3> Tuple3<T1, T2, T3> tup3() {
		return Tup.<Tuple3<T1, T2, T3>>createProxy(Tuple3.class, 3);
	}
	
	@SuppressWarnings("unchecked")
	private static <T> T createProxy(Class<? super T> tupleClass, Object... tupleArgs) {
		TupleInvocationHandler tih = new TupleInvocationHandler(tupleArgs);
		return (T) Proxy.newProxyInstance(Tup.class.getClassLoader(), new Class[] { tupleClass }, tih);
	}
	
	@SuppressWarnings("unchecked")
	private static <T> T createProxy(Class<? super T> tupleClass, int tupleSize) {
		TupleInvocationHandler tih = new TupleInvocationHandler(tupleSize);
		return (T) Proxy.newProxyInstance(Tup.class.getClassLoader(), new Class[] { tupleClass }, tih);
	}
}
