package com.demo.deldir;
import java.io.File;

public class Deldir {

	public static void delDir(File dir) {

		String dlist[] = dir.list();

		for (String x : dlist) {
			File subdir = new File(dir, x);

			if (subdir.isDirectory()) {
				delDir(subdir);
			}

			subdir.delete();

		}
	}

	public static void main(String[] args) {

		String d = "D:\\Destination";

		File dir = new File(d);

		delDir(dir);
		
		dir.delete();
	}

}
