package com.hello.data;
import java.io.File;
import java.io.IOException;

public class FileTest {
	public static void main(String[] args) {
		File file = new File("hello.txt");
		try {
			if (file.createNewFile()) {
				System.out.println("File created successfully.");
			} else {
				System.out.println("File not created successfully or exsiting file.");
			}
			System.out.println("absolute path : " + file.getAbsolutePath());
			System.out.println("file : " + file);

			System.out.println("**************************  copying 1 to another file ************************");
			// Copying the file 1 into file 2
			File file2 = file.getCanonicalFile();
			// returns true if the file exists
			System.out.println(file2);
			System.out.println("File2 exists or not : " + file2.exists());
			// returns absolute pathname
			System.out.println("file2 abs path : " + file2.getAbsolutePath());

			
			System.out.println("************************** Reading directory ************************");
			// Reading directory
			File f = new File("C:/Users/shubhamrmrs/Desktop/Jyosu/formal dress");
			String filenames[] = f.list();
			for (String filename : filenames) {
				System.out.println(filename);
			}
			System.out.println("************************** Reading directory all file properties ************************");
			File files[] = f.listFiles();
			for (File file1 : files) {
				System.out.println(file1.getName() + " Can Write: " + file1.canWrite() + " Is Hidden: "
						+ file1.isHidden() + " Length: " + file1.length() + " bytes");
			}

		} catch (IOException e) {
			System.out.println("error : " + e.getLocalizedMessage());
			e.printStackTrace();
		}
	}
}
