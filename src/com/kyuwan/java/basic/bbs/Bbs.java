package com.kyuwan.java.basic.bbs;

public class Bbs {
	public String title;
	public String author;
	public long date;
	public String content;
	
	public void initDate(){
		date = System.currentTimeMillis();
	}
}
