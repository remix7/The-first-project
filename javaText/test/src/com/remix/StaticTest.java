package com.remix;
//类名.静态方法  时   构造函数没有执行 执行的是静态代码块
//当有对象的时候   对象调用静态函数  静态代码块不执行  而是构造函数被执行
public class StaticTest {
	static int i ;
	static{
		i = 11;
		System.out.println(" 静态代码块执行");
	}
	public StaticTest(){
		System.out.println("构造函数被执行");
	}
	static void f(){
		System.out.println("静态方法被执行"+i);
	}
	public static void main(String[] args) {
		StaticTest.f();
		StaticTest s= new StaticTest();
		s.f();
	}
	
}
