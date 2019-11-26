package com.x.vuinner.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializeTest implements Serializable, Cloneable {

	int a, b;
	transient int c;

	/**
	 * 
	 */
	private static final long serialVersionUID = Long.MAX_VALUE;

	SerializeTest(int a, int b) {
		this.a = a;
		this.b = b;
	}

	public static void main(String[] args) throws IOException, CloneNotSupportedException {

		SerializeTest st = new SerializeTest(1, 2);

		FileOutputStream fo = new FileOutputStream("obj.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fo);

		oos.writeObject(st);
		oos.close();
		fo.close();

		FileInputStream fi = new FileInputStream("obj.txt");
		ObjectInputStream ois = new ObjectInputStream(fi);

		try {
			SerializeTest obtained = (SerializeTest) ois.readObject();
			System.out.println("Details after deserialization obtained.serialVersionUID: " + obtained.serialVersionUID);
			System.out.println("Details after deserialization: getName " + obtained.getClass().getName());
			System.out.println("Details after deserialization: a " + obtained.a);
			System.out.println("Details after deserialization: b " + obtained.b);
			System.out.println("Details after deserialization: c " + obtained.c);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Trying to clone the object");
		
		SerializeTest s3 = (SerializeTest) st.clone();
		
		System.out.println("Cloned variable " + s3);
		System.out.println("Cloned variable " + s3.serialVersionUID);
		System.out.println("Cloned variable " + s3.a);
		System.out.println("Cloned variable " + s3.b);
		System.out.println("Cloned variable " + s3.c);

		System.out.println("Serialization and Deserialization completed successfully!");
	}

}
