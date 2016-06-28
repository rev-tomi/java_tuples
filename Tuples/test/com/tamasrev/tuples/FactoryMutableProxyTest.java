package com.tamasrev.tuples;

public class FactoryMutableProxyTest extends AbstractMutableTupleTest {

	@Override
	protected <T1, T2> Tuple2<T1, T2> createTuple2() {
		return Tup.tup2();
	}

	@Override
	protected <T1, T2> Tuple2<T1, T2> createTuple2(T1 v1, T2 v2) {
		return Tup.<T1, T2>tup(v1, v2);
	}

}
