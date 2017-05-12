package com.kyuwan.java.basic;

import java.util.ArrayList;
import java.util.Scanner;

import com.kyuwan.java.basic.bbs.Bbs;

public class BasicMain {

	public static void main(String[] args) {
		Bbs bbs = new Bbs();
		ArrayList<Bbs> datas = new ArrayList<>();

		Scanner sc = new Scanner(System.in);

		String words = sc.nextLine();
		System.out.println(words);

		for (int i = 0; i < 3; i++) {
			System.out.println("������ �Է� �ϼ��� : ");
			bbs.title = sc.nextLine();

			System.out.println("�ۼ��ڸ� �Է� �ϼ��� : ");
			bbs.author = sc.nextLine();

			System.out.println("������ �Է� �ϼ��� : ");
			bbs.content = sc.nextLine();

			System.out.println("----------------------");
			System.out.println("���� : " + bbs.title);
			System.out.println("�ۼ��� : " + bbs.author);
			System.out.println("���� : " + bbs.content);

		    bbs.initDate();
			datas.add(bbs);
		}

		for (Bbs item : datas) {
			System.out.print(item.title);
			System.out.print(" ");
			System.out.println(item.date);
		}

		// Bbs bbs = new Bbs();
		// bbs.title = "�ȳ��ϼ���";
		// bbs.author = "ȫ�浿";
		// bbs.date = System.currentTimeMillis();
		// bbs.content = "content";
	}

}
