package com.kyuwan.java.basic;

import com.kyuwan.java.basic.bbs.Bbs;

public class BasicMain {

	public static void main(String[] args) {

		Bbs bbs = new Bbs();
		bbs.title = "¾È³çÇÏ¼¼¿ä";
		bbs.author = "È«±æµ¿";
		bbs.date = System.currentTimeMillis();
		bbs.content = "content";
	}

}

