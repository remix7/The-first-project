package javaTest;

public class T2 {
	public static void main(String[] args) {
		student s1 = new student(1,"zhangsan","man");
		System.out.println(s1.SayHi());
		student s2 = new student();
		s2.id = 2;
		s2.name = "lisi";
		s2.sex = "man";
		System.out.println(s2.SayHi());
	}
}
 class student{
	int id;
	String name;
	String sex;
	public student(int id, String name, String sex) {
		this.id = id;
		this.name = name;
		this.sex = sex;
	}
	public student() {}
	public String SayHi(){
		return "学号："+id+" 姓名："+name+" 性别："+sex;
		
	}
	
}



	