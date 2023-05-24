package com.rahul.designpattern.singleton;

import java.io.IOException;

class Singletonn implements Cloneable {

	private static final Singletonn INSTANCE = new Singletonn();

	private Singletonn() {

	}

	public static Singletonn getInstance() {
		return INSTANCE;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
}

public class SingletonUsingCloneable {
	public static void main(String[] args) throws IOException, CloneNotSupportedException {
		Singletonn singletonUsingSerialization = Singletonn.getInstance();
		Singletonn singletonUsingSerialization2 = (Singletonn)singletonUsingSerialization.clone();

		System.out.println(singletonUsingSerialization.hashCode());
		System.out.println(singletonUsingSerialization2.hashCode());
	}
}
