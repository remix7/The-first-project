package com.lianxi;
import java.util.*;

public class HashSetDemo {
	public static void sop(Object obj){
		System.out.println(obj);
	}
	public static void main(String[] args) {
		HashSet hs = new HashSet();
		hs.add(new person("lisi01",18));
		hs.add(new person("lisi02",18));
		
		
		
		hs.remove(new person("lisi01",18));
		Iterator it = hs.iterator();
		while(it.hasNext()){
			 person p = (person)it.next();
			sop(p.getName()+"+++"+p.getAge());
		}
	}
}
class person{
	private String name;
	private int age;
	public person(String name,int age){
		this.name = name;
		this.age = age;
	}
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
	//重写Object中equals方法
//	public boolean equals(Object obj){
//		if(!(obj instanceof person))
//			return false;
//		person p = (person)obj;
//		//System.out.println(this.name+"--equals--"+p.name);
//		return this.name.equals(p.name)&& this.age == p.age;
//	}
	public int hashCode(){
		return 60;
	}
	
}