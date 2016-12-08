package com.tamasrev.tuples;

public class Tuple2Test extends AbstractTupleTest {

	@Override
	protected <T1, T2> Tuple2<T1, T2> createTuple2() {
		return Tup.<T1, T2>tup2();
	}

	@Override
	protected <T1, T2> Tuple2<T1, T2> createTuple2(T1 v1, T2 v2) {
		return Tup.<T1, T2>tup(v1, v2);
	}

}
