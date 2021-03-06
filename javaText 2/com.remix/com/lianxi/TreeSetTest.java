package com.lianxi;
import java.util.*;

public class TreeSetTest {
	public static void sop(Object obj){
		System.out.println(obj);
	}
	public static void main(String[] args) {
		TreeSet<student> ts = new TreeSet<student>();
		ts.add(new student("zhangsan001",20));
		ts.add(new student("zhangsan002",25));
		ts.add(new student("zhangsan003",10));
		ts.add(new student("zhangsan004",6));
		ts.add(new student("zhangsan055",6));

//		ts.add(14500);
//		ts.add(458);
		Iterator<student> it = ts.iterator();
		while(it.hasNext()){
			student sdu = it.next();
			sop(sdu.getName()+"--------"+sdu.getAge());
		}
	}
}
class student implements Comparable<Object>{
	private String name;
	private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public student(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public int compareTo(Object obj) {
		if(!(obj instanceof student))
			throw new RuntimeException("这不是Student类型的参数");
		student s = (student)obj;
		System.out.println(this.name +"---compareTo---"+s.name);
		
		if(this.age > s.age)
			return 1;
		if(this.age==s.age){
			return this.name.compareTo(s.name);
		}
		return -1;
	}
	
}