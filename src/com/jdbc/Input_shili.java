package com.jdbc;

import java.io.File;

public class Input_shili {

	public static void main(String[] args) throws Exception {
		File file=new File("d:\\tice");
		File[] wenjian_jihe=file.listFiles();
		System.out.println(wenjian_jihe.length);
		for (File file2 : wenjian_jihe) {
			System.out.println(file2);
		}

	}

}
