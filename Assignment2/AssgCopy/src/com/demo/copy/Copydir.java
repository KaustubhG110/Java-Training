package com.demo.copy;

import java.io.*;

class Copydir {

	public static void copyFile(File sf, File df) throws IOException {
		FileInputStream s = new FileInputStream(sf);
		FileOutputStream d = new FileOutputStream(df);

		byte[] buf = new byte[1024];
		int r;

		while ((r = s.read(buf)) > 0) {
			d.write(buf, 0, r);
		}

		s.close();
		d.close();
	}

	public static void copyDir(File sdir, File ddir) throws IOException {

		if (!ddir.exists()) {
			ddir.mkdir();
		}

		String slist[] = sdir.list();

		for (String x : slist) {
			File s = new File(sdir, x);
			File d = new File(ddir, x);

			if (s.isDirectory()) {
				copyDir(s, d);
			} else {
				copyFile(s, d);
			}

		}
	}

	public static void main(String[] args) throws IOException {

		String source = "D:\\Source";
		String dest = "D:\\Destination";

		File sdir = new File(source);
		File ddir = new File(dest);

		copyDir(sdir, ddir);
	}

}
