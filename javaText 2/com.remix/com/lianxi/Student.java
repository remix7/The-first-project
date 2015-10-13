package com.lianxi;

abstract public class Student {
	public abstract void study();
	public void sleep(){
		System.out.println("躺着睡");
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
		System.out.println("初级班学习");
	}
}
class zhongjiban extends Student{
	public void study() {
		System.out.println("中级班学习");
	}
}
class chongciban extends Student{
	public void study() {
		System.out.println("冲刺班学习");
	}
	public void sleep() {
		System.out.println("站着睡");
	}
 }