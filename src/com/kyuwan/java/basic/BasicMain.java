package com.kyuwan.java.basic;

import com.kyuwan.java.basic.bbs.Bbs;

public class BasicMain {

	public static void main(String[] args) {

		Bbs bbs = new Bbs();
		bbs.title = "�ȳ��ϼ���";
		bbs.author = "ȫ�浿";
		bbs.date = System.currentTimeMillis();
		bbs.content = "content";
	}

}

