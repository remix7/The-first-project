
//  �ж�Ԫ���Ƿ���ͬ���������ͣ�
// * list�����ж�Ԫ���Ƿ���ͬ��������Ԫ�ص�equals����
// * 
package com.lianxi;

import java.util.*;

public class ArrayListTest2 {
	//��Ӧ������װ
	public static void sop(Object obj){
		System.out.println(obj);
	}
	public static void main(String[] args) {
		//ArrayList��������
		ArrayList al = new ArrayList();
		al.add(new Person("zhangshan01",18));
		al.add(new Person("zhangshan02",19));
		al.add(new Person("zhangshan03",18));
		al.add(new Person("zhangshan02",19));
		al.add(new Person("zhangshan03",18));
		al.add(new Person("zhangshan04",18));
		al.add(new Person("zhangshan05",19));
		al.add(new Person("zhangshan06",18));
		al.add(new Person("zhangshan02",19));
		al.add(new Person("zhangshan07",18));
		al = singalElment(al);//�ж��Ƿ���ͬ
		Iterator it = al.iterator();
		
		while(it.hasNext()){
			Person p = (Person)it.next();
			sop(p.getName()+"+++"+p.getAge());
		}
		
		
	}
	//�ж��Ƿ���ͬ�ĺ���
	public static ArrayList singalElment(ArrayList al){
		ArrayList newAL =  new ArrayList();
		Iterator it =  al.iterator();
		
		while(it.hasNext()){
			Object obj = it.next();
			
			if(!newAL.contains(obj))
				newAL.add(obj);
		}
		return newAL;
		
	}
}
//��������
class Person{
	private String name;
	private int age;
	public Person(String name,int age){
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
	//��дObject��equals����
	public boolean equals(Object obj){
		if(!(obj instanceof Person))
			return false;
		Person p = (Person)obj;
		System.out.println(this.name+"  "+p.name);
		return this.name.equals(p.name)&& this.age == p.age;
	}
	
}