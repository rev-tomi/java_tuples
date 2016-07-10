package com.tamasrev.tuples;

class Tuple2Impl<T1, T2> implements Tuple2<T1, T2> {

	private Object[] values;
	
	public Tuple2Impl() {
		values = new Object[2];
	}
	
	public Tuple2Impl(T1 v1, T2 v2) {
		this();
		values[0] = v1;
		values[1] = v2;
	}
	
	@Override
	public void set1(T1 v) {
		values[0] = v;
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public T1 get1() {
		return (T1) values[0];
	}
	
	@Override
	public void set2(T2 v) {
		values[1] = v;
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public T2 get2() {
		return (T2) values[1];
	}
}
