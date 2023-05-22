package com.rahul.designpattern.singleton;

public class SingletonStaticBlock {
	private static SingletonStaticBlock INSTANCE = null;

	private SingletonStaticBlock() {

	}

	static {
		try {
			if (INSTANCE == null) {
				INSTANCE = new SingletonStaticBlock();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static SingletonStaticBlock getInstance() {
		return INSTANCE;
	}
}
