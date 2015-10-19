package com.remix;
/*
 * 子类的对象的构造函数   默认会调用父类无参的构造函数
 * this 一个非静态的成员函数访问非静态的成员前面省略this
 *  this又是当前对象（v的实实例的引用） 调用这个函数的那个对象是 m1 
 *  构成了分类的引用引用了子类的实例
 *  调用test函数，test函数又构成了重写  所以调用了自类的函数
 * 
 * */
public class ChongZaiTest {
	public static void main(String[] args) {
		m m1= new m();
	}
}
class v{
	public v(){test();}
	public void test(){
		System.out.println("this is A test");
	}
}
class m extends v{
	public m(){}
	public void test(){
		System.out.println("this is B test");
	}
}
