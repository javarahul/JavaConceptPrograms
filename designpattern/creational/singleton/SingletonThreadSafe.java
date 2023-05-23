package com.rahul.designpattern.singleton;

public class SingletonThreadSafe {
	private static SingletonThreadSafe INSTANCE = null;

	private SingletonThreadSafe() {

	}

	public static synchronized SingletonThreadSafe getInstance() {
		if (INSTANCE == null) {
			INSTANCE = new SingletonThreadSafe();
		}
		return INSTANCE;
	}
}
