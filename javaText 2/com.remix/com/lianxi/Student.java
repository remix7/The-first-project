package com.lianxi;

abstract public class Student {
	public abstract void study();
	public void sleep(){
		System.out.println("����˯");
	}
	public static void main(String[] args) {
		dostudent ds = new dostudent();
		ds.function(new zhongjiban());
		ds.function(new chongciban());
	}
}
class dostudent{
	public  void function(Student s){
		s.study();
		s.sleep();
	}
}
class chujiban extends Student{
	public void study() {
		System.out.println("������ѧϰ");
	}
}
class zhongjiban extends Student{
	public void study() {
		System.out.println("�м���ѧϰ");
	}
}
class chongciban extends Student{
	public void study() {
		System.out.println("��̰�ѧϰ");
	}
	public void sleep() {
		System.out.println("վ��˯");
	}
 }