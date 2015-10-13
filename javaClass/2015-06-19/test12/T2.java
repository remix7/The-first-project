package test12;

import java.util.ArrayList;

public class T2 {
	public static void main(String[] args) {
		
		/**
		 * ���ͣ��﷨���棬���������е�Ԫ�ص���������
		 */
		ArrayList<Student> arrayList = new ArrayList<Student>();
		Student s1 = new Student("s001", "zhangsan", 18);
		Student s2 = new Student("s002", "lisi", 20);
		Student s3 = new Student("s003", "wangwu", 22);
		Student s4 = new Student("s001", "zhangsan", 18);
		
		// java �Ƚ�2�������Ƿ����
		
//		s1 = s4;
		//Studnet�Ķ��� �ж���ȵ��߼��Լ�����
//		System.out.println( s1 == s4 );    //false  �ȵ�ַ
//		System.out.println(  s1.equals(s4)); //false  �̳ж������ȵ�ַ
		
//		System.out.println(s1.equals(s4));
		
//		System.out.println(s1);
		
		arrayList.add(s1);
		arrayList.add(s2);
		arrayList.add(s3);
		
//		arrayList.add(s4);
		
		//�жϼ������Ƿ������Ԫ��
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
	
	//��д hashCode  equals   Ŀ���Ǹ����ֶ�ֵ���Ƚ϶����Ƿ����
	
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
	
	
	//��дObject���toString()
	 
	@Override
	public String toString() {
		 return "ѧ��" +this.id + 
				 "����" + this.name + "����" + this.age;
	}
	 
	
	
}
