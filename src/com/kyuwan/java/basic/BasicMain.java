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
			System.out.println("제목을 입력 하세요 : ");
			bbs.title = sc.nextLine();

			System.out.println("작성자를 입력 하세요 : ");
			bbs.author = sc.nextLine();

			System.out.println("내용을 입력 하세요 : ");
			bbs.content = sc.nextLine();

			System.out.println("----------------------");
			System.out.println("제목 : " + bbs.title);
			System.out.println("작성자 : " + bbs.author);
			System.out.println("내용 : " + bbs.content);

		    bbs.initDate();
			datas.add(bbs);
		}

		for (Bbs item : datas) {
			System.out.print(item.title);
			System.out.print(" ");
			System.out.println(item.date);
		}

		// Bbs bbs = new Bbs();
		// bbs.title = "안녕하세요";
		// bbs.author = "홍길동";
		// bbs.date = System.currentTimeMillis();
		// bbs.content = "content";
	}

}
