package com.hello.data;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputInputStreamTest2 {
	public static void main(String[] args) {
		try {
			File file = new File("C:\\Users\\shubhamrmrs\\Desktop\\IO\\test3.txt");
			FileOutputStream out = new FileOutputStream(file);
			String str = "Welcome to the world of Java";
			byte[] array = str.getBytes();
			out.write(array);
			out.flush();
			out.close();
			System.out.println("Data has been written successfully!!!");

			FileInputStream in = new FileInputStream(file);
			int data;
			while ((data = in.read()) != -1) {

				System.out.print((char) data);
			}
			in.close();

		} catch (FileNotFoundException e) {
			System.err.println("Error while creating file FNF");
			e.printStackTrace();
		} catch (IOException e) {
			System.err.println("Error while creating file IO");
			e.printStackTrace();
		}
	}
}
