package com.demo.create;

import java.io.*;

public class CreateFile {

	public static void main(String[] args) throws IOException {
		
		File f1a = new File("D:\\NewFolder\\file4a.txt");
		f1a.createNewFile();
		
		File f1b = new File("D:\\NewFolder\\file4b.txt");
		f1b.createNewFile();
		
		File f1c = new File("D:\\NewFolder\\file4c.txt");
		f1c.createNewFile();
		
		File f5a = new File("D:\\NewFolder\\file5a.tex");
		f5a.createNewFile();
		
		File f5b = new File("D:\\NewFolder\\file5b.tex");
		f5b.createNewFile();
		
		File f5c = new File("D:\\NewFolder\\file5c.tex");
		f5c.createNewFile();
	}

}
