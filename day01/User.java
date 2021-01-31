package com.ydj1999.javase;

public class User {
	private int age;
	
	public void setAge(int a) {
		//编写业务逻辑代码进行安全控制
		if(a<0||a>150) {
			System.out.println("对不起，您提供的年龄不合法");
			return;
		}
		age=a;
		
	}
	public int getAge() {
		return age;
	}
	
}
