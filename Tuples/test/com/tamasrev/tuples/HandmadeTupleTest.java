package com.tamasrev.tuples;

public class HandmadeTupleTest extends AbstractMutableTupleTest {

	@Override
	protected <T1, T2> Tuple2<T1, T2> createTuple2() {
		return new Tuple2Impl<>();
	}

}
