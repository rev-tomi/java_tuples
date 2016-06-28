package com.tamasrev.tuples;

public class HandmadeTupleTest extends AbstractMutableTupleTest {

	@Override
	protected <T1, T2> Tuple2<T1, T2> createTuple2() {
		return new Tuple2Impl<>();
	}

	@Override
	protected <T1, T2> Tuple2<T1, T2> createTuple2(T1 v1, T2 v2) {
		return new Tuple2Impl<>(v1, v2);
	}

}
