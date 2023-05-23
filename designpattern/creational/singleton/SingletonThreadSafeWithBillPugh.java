package com.rahul.designpattern.singleton;

public class SingletonThreadSafeWithBillPugh {

	private SingletonThreadSafeWithBillPugh() {

	}

	private static class SingletonHolder {
		private static SingletonThreadSafeWithBillPugh INSTANCE = new SingletonThreadSafeWithBillPugh();
	}

	public static SingletonThreadSafeWithBillPugh getInstance() {

		return SingletonHolder.INSTANCE;
	}
}
