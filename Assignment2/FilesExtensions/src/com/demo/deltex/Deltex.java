package com.demo.deltex;

import java.io.File;
import java.io.FilenameFilter;

public class Deltex {
	
	public static void main(String[] args) {
		
		File dir = new File("D:\\NewFolder");
		
		FilenameFilter ext = new Filterfiles("tex");
		
		String flist[] = dir.list(ext);
		
		for(String x:flist) {
			File f = new File(dir, x);
			f.delete();
		}
	}
}
