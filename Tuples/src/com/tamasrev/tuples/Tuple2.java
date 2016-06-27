package com.tamasrev.tuples;

public class Tuple2<T1, T2> {

	private Object[] values;
	
	public Tuple2() {
		values = new Object[2];
	}
	
	public Tuple2(T1 v1, T2 v2) {
		this();
		values[0] = v1;
		values[1] = v2;
	}
	
	public void set1(T1 v) {
		values[0] = v;
	}
	
	public T1 get1() {
		return (T1) values[0];
	}
	
	public void set2(T2 v) {
		values[1] = v;
	}
	
	public T2 get2() {
		return (T2) values[1];
	}
}
