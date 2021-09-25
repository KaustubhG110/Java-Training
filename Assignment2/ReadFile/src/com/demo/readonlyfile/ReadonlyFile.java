package com.demo.readonlyfile;

import java.io.File;
import java.io.IOException;

public class ReadonlyFile {

	public static void main(String[] args) throws IOException {

		File f = new File("D:\\file.txt");
		f.createNewFile();
		f.setReadOnly();
		System.out.println("File read-only: " + f.canRead());
		System.out.println("File writable: " + f.canWrite());
	}

}
