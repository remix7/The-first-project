package com.remix;
/*
 * 执行顺序：
 * A-静态定义初始化块----
 * b-静态定义初始化块----
 * A-定义初始话块----
 * A-构造函数----
 * b-定义初始话块----
 * b-构造函数----
 * */

public class ChuShiHua {
	public static void main(String[] args) {
		 B b = new B();
	}
}
class A{
	static{
		System.out.println("A-静态定义初始化块----");
	}
	{
		System.out.println("A-定义初始话块----");
	}
	public A(){
		System.out.println("A-构造函数----");
	}
}
class B extends A{
	static{
		System.out.println("b-静态定义初始化块----");
	}
	{
		System.out.println("b-定义初始话块----");
	}
	public B(){
		System.out.println("b-构造函数----");
	}
}