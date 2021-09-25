package com.demo.writeObject;

import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		
		CricketPlayer player = new CricketPlayer("Shreyas Iyer", 516, "Batsman", "India");
		
		FileOutputStream f = new FileOutputStream("D:\\file3.txt");
		ObjectOutputStream obj = new ObjectOutputStream(f);
		
		obj.writeObject(player);
		
		f.close();
		obj.close();
	}

}
