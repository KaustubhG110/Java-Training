package com.demo.write;

import java.io.*;

public class Write {

	public static void main(String[] args) throws IOException {
		
		String x = "aaa\nbbb\nccc\nddd";
		FileWriter f = new FileWriter("D:\\file2.txt");
		f.write(x);
		f.close();
	}

}
