package com.rahul.designpattern.singleton;

import java.io.IOException;

class SingletonClone implements Cloneable {

	private static final SingletonClone INSTANCE = new SingletonClone();

	private SingletonClone() {

	}

	public static SingletonClone getInstance() {
		return INSTANCE;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException("You can create clone of Singleton");
		//		return super.clone();
	}
}

public class SingletonUsingCloneableHandling {
	public static void main(String[] args) throws IOException, CloneNotSupportedException {
		SingletonClone singletonUsingSerialization = SingletonClone.getInstance();
		SingletonClone singletonUsingSerialization2 = (SingletonClone)singletonUsingSerialization.clone();

		System.out.println(singletonUsingSerialization.hashCode());
		System.out.println(singletonUsingSerialization2.hashCode());
	}
}
