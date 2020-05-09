package com.hello.data;

import java.io.*;

public class SerialAndDeSerialization {
	public static void main(String[] args) {

		System.out.println("***************** Serialization ********************");

		try {
			FileOutputStream fout = new FileOutputStream(new File("C:\\Users\\shubhamrmrs\\Desktop\\IO\\student.txt"));
			ObjectOutputStream objOut = new ObjectOutputStream(fout);
			Student std = new Student(101, "Amit", "Bangalore");
			objOut.writeObject(std);
			objOut.flush();
			objOut.close();
			System.out.println("write success");

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("**************** De Serialization ******************");
		try {
			FileInputStream fin = new FileInputStream(new File("C:\\Users\\shubhamrmrs\\Desktop\\IO\\student.txt"));
			ObjectInputStream objIn = new ObjectInputStream(fin);
			Student std1 = (Student) objIn.readObject();
			objIn.close();
			System.out.println("read success");
			System.out.println("std "+std1);

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
