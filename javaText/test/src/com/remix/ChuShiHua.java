package com.remix;
/*
 * ִ��˳��
 * A-��̬�����ʼ����----
 * b-��̬�����ʼ����----
 * A-�����ʼ����----
 * A-���캯��----
 * b-�����ʼ����----
 * b-���캯��----
 * */

public class ChuShiHua {
	public static void main(String[] args) {
		 B b = new B();
	}
}
class A{
	static{
		System.out.println("A-��̬�����ʼ����----");
	}
	{
		System.out.println("A-�����ʼ����----");
	}
	public A(){
		System.out.println("A-���캯��----");
	}
}
class B extends A{
	static{
		System.out.println("b-��̬�����ʼ����----");
	}
	{
		System.out.println("b-�����ʼ����----");
	}
	public B(){
		System.out.println("b-���캯��----");
	}
}