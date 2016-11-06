package com.tamasrev.tuples;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class TupleInvocationHandler implements InvocationHandler {

	private static final String GET = "get";

	private static final Pattern TUPLE_METHOD_PATTERN = Pattern.compile("(get|set)(\\d+)$");

	private final Object[] values;
	
	public TupleInvocationHandler(int size) {
		values = new Object[size];
	}
	
	public TupleInvocationHandler(Object... args) {
		values = new Object[args.length];
		System.arraycopy(args, 0, values, 0, args.length);
	}
	
	protected void set(Object val, int index) {
		values[index] = val;
	}
	
	@SuppressWarnings("unchecked")
	protected <T> T get(int index) {
		return (T) values[index];
	}
	
	@Override
	public Object invoke(Object target, Method method, Object[] args) throws Throwable {
		if (!(target instanceof Tuple2)) {
			return method.invoke(target, args);
		}
		
		String methodName = method.getName();
		Matcher m = TUPLE_METHOD_PATTERN.matcher(methodName);
		if (!m.find()) {
			return method.invoke(target, args);
		}
		
		boolean isGet = GET.equals(m.group(1));
		int index = Integer.parseInt(m.group(2)) - 1;
		
		if (isGet) {
			return get(index);
		}
		set(args[0], index);
		return null; // returning null for void setter
	}

}
