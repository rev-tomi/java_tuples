package com.tamasrev.tuples;

public interface Tuple3<T1, T2, T3> extends Tuple2<T1, T2> {

	public void set3(T3 v3);
	
	public T3 get3();
}
