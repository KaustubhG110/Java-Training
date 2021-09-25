package com.demo.deltex;

import java.io.File;
import java.io.FilenameFilter;

public class Filterfiles implements FilenameFilter {
	String ext;

	public Filterfiles(String extension) {
		this.ext = "." + extension;
	}

	@Override
	public boolean accept(File dir, String name) {
		return name.endsWith(ext);
	}

}
