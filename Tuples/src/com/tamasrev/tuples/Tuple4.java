package com.tamasrev.tuples;

public interface Tuple4<T1, T2, T3, T4> extends Tuple3<T1, T2, T3> {

	public void set4(T4 v4);
	
	public T4 get4();
}
