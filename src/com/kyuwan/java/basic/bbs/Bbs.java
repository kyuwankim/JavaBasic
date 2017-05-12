package com.kyuwan.java.basic.bbs;

import java.text.SimpleDateFormat;

public class Bbs {
	public String title;
	public String author;
	public String date;
	public String content;
	
	public void initDate(){
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd");
		date = sdf.format(System.currentTimeMillis());
	}
}
