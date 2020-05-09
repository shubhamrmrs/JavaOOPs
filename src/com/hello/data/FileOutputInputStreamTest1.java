package com.hello.data;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputInputStreamTest1 {
	public static void main(String[] args) {
		try {
			FileOutputStream out = new FileOutputStream("C:\\Users\\shubhamrmrs\\Desktop\\IO\\test1.txt");
			int[] asciiCode = { 65, 66, 68, 69, 72 };
			int i = 0;
			while (i < asciiCode.length) {
				out.write(asciiCode[i]);
				i++;
			}
			out.flush();
			out.close();
			System.out.println("Data has been written successfully!!!");

			FileInputStream in = new FileInputStream("C:\\Users\\shubhamrmrs\\Desktop\\IO\\test1.txt");
			int data;
			while ((data = in.read()) != -1) {

				System.out.println((char) data);
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
