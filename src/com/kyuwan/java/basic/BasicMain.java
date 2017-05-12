package com.kyuwan.java.basic;

import java.util.Scanner;

import com.kyuwan.java.basic.bbs.Bbs;

public class BasicMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		while(true){
		String words = sc.nextLine();
		System.out.println(words);
		}
		
		
//		Bbs bbs = new Bbs();
//		bbs.title = "¾È³çÇÏ¼¼¿ä";
//		bbs.author = "È«±æµ¿";
//		bbs.date = System.currentTimeMillis();
//		bbs.content = "content";
	}

}

