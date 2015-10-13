package text;

import java.util.HashSet;

public class T2 {
	public static void main(String[] args) {
		student s1 = new student(1,"xiaoqiang","man");
		student s2 = new student(1,"xiaoming","wman");
		student s3 = new student(3,"miaomiao","wman");
		
		HashSet<student> hs = new HashSet<student>();
		hs.add(s3);
		hs.add(s2);
		hs.add(s1);
		System.out.println(hs.size());
		for (student student : hs) {
			System.out.println(student);
		}
	}
}
