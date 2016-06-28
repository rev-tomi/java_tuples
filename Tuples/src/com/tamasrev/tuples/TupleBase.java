package com.tamasrev.tuples;

public abstract class TupleBase<T1, T2> implements Tuple2<T1, T2> {

	private final Object[] values = new Object[2];
	
	protected void set(Object val, int index) {
		values[index] = val;
	}
	
	@SuppressWarnings("unchecked")
	protected <T> T get(int index) {
		return (T) values[index];
	}
	
}
