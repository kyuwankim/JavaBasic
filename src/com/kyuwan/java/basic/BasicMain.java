package com.kyuwan.java.basic;

import java.util.Scanner;

import com.kyuwan.java.basic.bbs.Bbs;

public class BasicMain {

	public static void main(String[] args) {
		Bbs bbs = new Bbs();
		Scanner sc = new Scanner(System.in);

		String words = sc.nextLine();
		System.out.println(words);

		System.out.println("������ �Է� �ϼ��� : ");
		bbs.title = sc.nextLine();

		System.out.println("�ۼ��ڸ� �Է� �ϼ��� : ");
		bbs.author = sc.nextLine();

		System.out.println("������ �Է� �ϼ��� : ");
		bbs.content = sc.nextLine();

		System.out.println("----------------------");
		System.out.println("���� : "+bbs.title);
		System.out.println("�ۼ��� : "+bbs.author);
		System.out.println("���� : "+bbs.content);
	

		// Bbs bbs = new Bbs();
		// bbs.title = "�ȳ��ϼ���";
		// bbs.author = "ȫ�浿";
		// bbs.date = System.currentTimeMillis();
		// bbs.content = "content";
	}

}
