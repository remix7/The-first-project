package test1;

import java.util.ArrayList;

public class Collection {
	public static void main(String[] args) {	
		ArrayList<student> al = new ArrayList<student>();
		student s1 = new student(1,"ZhangSan",18);
		student s2 = new student(2,"LiSi",19);
		student s3 = new student(2,"WangWu",20);

		al.add(s1);
		al.add(s2);
		al.add(s3);
		System.out.println(al.get(0));
		System.out.println(s2.equals(s3));
		for (int i = 0; i <al.size(); i++) {
			System.out.println(al.get(i));
		}
	}
}
class student extends Object{
	public int id;
	public String name;
	public int age;
	public student(int id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}
	public student() {}
	public int hashCode() {
		final int PRIME = 31;
		int result = 1;
		result = PRIME * result + id;
		return result;
	}
	
	
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		final student other = (student) obj;
		if (id != other.id)
			return false;
		return true;
	}
	public String toString() {
		return "Ñ§ºÅ£º"+this.id+" ÐÕÃû£º"+this.name+" ÄêÁä£º"+this.age;
	}
	
	
}