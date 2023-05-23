package com.rahul.designpattern.singleton;

public class SingletonThreadSafeWithDoubleCheck {
	private static SingletonThreadSafeWithDoubleCheck INSTANCE = null;

	private SingletonThreadSafeWithDoubleCheck() {

	}

	public static SingletonThreadSafeWithDoubleCheck getInstance() {
		if (INSTANCE == null) {
			synchronized (SingletonThreadSafeWithDoubleCheck.class) {
				if (INSTANCE == null) {
					INSTANCE = new SingletonThreadSafeWithDoubleCheck();
				}	
			}
		}
		return INSTANCE;
	}
}
