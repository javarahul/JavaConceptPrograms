package com.rahul.designpattern.singleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class SingletonUsingSerializationReadResolve implements Serializable {
	public static final long serialVersionUID = 183457349;

	private static final SingletonUsingSerializationReadResolve INSTANCE = new SingletonUsingSerializationReadResolve();

	private SingletonUsingSerializationReadResolve() {

	}

	public static SingletonUsingSerializationReadResolve getInstance() {
		return INSTANCE;
	}

	public Object readResolve() {
		return getInstance();
	}
}

public class SingletonUsingSerializationTest {
	public static void main(String[] args) throws IOException {
		SingletonUsingSerializationReadResolve singletonUsingSerialization = SingletonUsingSerializationReadResolve.getInstance();
		SingletonUsingSerializationReadResolve singletonUsingSerialization2 = null;

		ObjectOutput objectOutput = null;

		try {
			objectOutput = new ObjectOutputStream(new FileOutputStream("singleton.ser"));
			objectOutput.writeObject(singletonUsingSerialization);
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			if (objectOutput != null) {
				objectOutput.close();
			}
		}

		ObjectInput objectInput = null;
		try {
			objectInput = new ObjectInputStream(new FileInputStream("singleton.ser"));
			singletonUsingSerialization2 = (SingletonUsingSerialization) objectInput.readObject();
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			if (objectInput != null) {
				objectInput.close();
			}
		}

		System.out.println(singletonUsingSerialization.hashCode());
		System.out.println(singletonUsingSerialization2.hashCode());
	}
}
