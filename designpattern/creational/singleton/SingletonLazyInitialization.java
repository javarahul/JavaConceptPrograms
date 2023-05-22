package com.rahul.designpattern.singleton;

public class SingletonLazyInitialization {
	private static SingletonLazyInitialization INSTANCE = null;

	private SingletonLazyInitialization() {

	}

	public static SingletonLazyInitialization getInstance() {
		if (INSTANCE == null) {
			INSTANCE = new SingletonLazyInitialization();
		}
		return INSTANCE;
	}
}
