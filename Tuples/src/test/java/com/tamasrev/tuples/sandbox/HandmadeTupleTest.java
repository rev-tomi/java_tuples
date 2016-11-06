package com.tamasrev.tuples.sandbox;

import com.tamasrev.tuples.AbstractTupleTest;
import com.tamasrev.tuples.Tuple2;
import com.tamasrev.tuples.sandbox.Tuple2Impl;

public class HandmadeTupleTest extends AbstractTupleTest {

	@Override
	protected <T1, T2> Tuple2<T1, T2> createTuple2() {
		return new Tuple2Impl<>();
	}

	@Override
	protected <T1, T2> Tuple2<T1, T2> createTuple2(T1 v1, T2 v2) {
		return new Tuple2Impl<>(v1, v2);
	}

}
