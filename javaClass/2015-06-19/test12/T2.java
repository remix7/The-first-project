package test12;

import java.util.ArrayList;

public class T2 {
	public static void main(String[] args) {
		
		/**
		 * 泛型，语法层面，限制容器中的元素的数据类型
		 */
		ArrayList<Student> arrayList = new ArrayList<Student>();
		Student s1 = new Student("s001", "zhangsan", 18);
		Student s2 = new Student("s002", "lisi", 20);
		Student s3 = new Student("s003", "wangwu", 22);
		Student s4 = new Student("s001", "zhangsan", 18);
		
		// java 比较2个对象是否相等
		
//		s1 = s4;
		//Studnet的对象 判断相等的逻辑自己定义
//		System.out.println( s1 == s4 );    //false  比地址
//		System.out.println(  s1.equals(s4)); //false  继承而来，比地址
		
//		System.out.println(s1.equals(s4));
		
//		System.out.println(s1);
		
		arrayList.add(s1);
		arrayList.add(s2);
		arrayList.add(s3);
		
//		arrayList.add(s4);
		
		//判断集合中是否有这个元素
		System.out.println(arrayList.contains(s4));
//		
//		System.out.println(arrayList.size());
 		
		
		
	}
}

class Student extends Object{
	public String id;
	public String name;
	public int age;
	public Student(String id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}
	public Student() {
	}
	
	//重写 hashCode  equals   目的是根据字段值来比较对象是否相等
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	
	//重写Object类的toString()
	 
	@Override
	public String toString() {
		 return "学号" +this.id + 
				 "姓名" + this.name + "年龄" + this.age;
	}
	 
	
	
}
