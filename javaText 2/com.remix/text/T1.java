package text;

import java.util.ArrayList;

public class T1 {
	public static void main(String[] args) {
		student s1 = new student(1,"xiaoqiang","man");
		student s2 = new student(1,"xiaoming","wman");
		student s3 = new student(3,"miaomiao","wman");

		ArrayList<student> ay =  new ArrayList<student>();
		ay.add(s1);
		ay.add(s2);
		ay.add(s3);
		
	
		System.out.println(ay.size());
		System.out.println(ay.get(0));
		for (Object object : ay) {
			System.out.println(object);
		}
	}
}
class student{
	int id;
	String name;
	String sex;
	
	public student(int id, String name, String sex) {
		super();
		this.id = id;
		this.name = name;
		this.sex = sex;
	}
	
	public student() {
		super();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
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
		student other = (student) obj;
		if (id != other.id)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "student [id=" + id + ", name=" + name + ", sex=" + sex + "]";
	}
	
}
