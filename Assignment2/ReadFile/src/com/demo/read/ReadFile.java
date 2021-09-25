package com.demo.read;

import java.io.*;

public class ReadFile {

	public static void main(String[] args) throws IOException {

		File f = new File("D:\\file1.txt");
		BufferedReader r = new BufferedReader(new FileReader(f));
		
		String s = r.readLine();
		while(s != null) {
			System.out.println(s);
			s = r.readLine();
		}
	}

}
