# Tuples

This project demonstrates that the ultimate Java tuple is the Object array, i.e. `Object[]`.

The project provides interfaces called `TupleN`, like `Tuple2`, `Tuple3` and so on. You can obtain interfaces through static factory methods (a.k.a. Singleton Pattern) from `Tuple`.

## How to use

You can create an empty double tuple like this:

    Tuple2<Integer, String> emptyPair = Tup.<Integer, String>tup2();

You can create an initialized empty double tuple like this:

    Tuple2<Integer, String> pair = Tup.tup(42, "Life, Universe and Everything");

The accessors go like this:

    Tuple2<Integer, String> pair = Tup.tup(42, "Life, Universe and Everything");
    pair.set1(43); // the Tuple indexes start at 1
    pair.set2("So long and thanks for all the fish.");
    String msg = pair.get2();

## Under the hood
    
The funny part is that if you look under the hood, you'll see an `InvocationHandler` that contains an Object array and an `invoke` method retrieves numbers from the `setN` and `getN` method names.


## How to improve

You can contribute in many ways:

### 1. Make `N` bigger

At the time of writing, tuples are supported up to 4. It's relatively easy to support tuples of 5, 6, and so on.

### 2. Make it faster

These tuples use reflection which is slow. You can replace some of the `InvocationHandler` implementations with POJO-s. The `TupleInvocationHandler` can remain a reference-implementation then.

### 3. Add immutable Tuples

The current tuple interfaces are all mutable. You can add immutable interfaces too: the ones that have getters only. You'll need new creator methods too.

## References

The idea came from [this SO question](http://stackoverflow.com/questions/38047298/hashmapinteger-string-how-is-it-taking-values-string-integer). The question demonstrates how you can bypass the Java Generics and store _anything_ in a typed collection.

Then, you know, why not do the same with the simplest thing possible? This _simplest thing possible_ turned out to be an Object array.

You can read more on Arrays and types at c2-s [wiki page](http://wiki.c2.com/?JavaArraysBreakTypeSafety). 

