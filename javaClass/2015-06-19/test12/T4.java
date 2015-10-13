package test12;

import java.util.HashSet;

public class T4 {
	public static void main(String[] args) {
		HashSet hashSet = new HashSet();
		Student s1 = new Student("s001", "zhangsan", 18);
		Student s2 = new Student("s002", "lisi", 20);
		Student s3 = new Student("s003", "wangwu", 22);
		Student s4 = new Student("s001", "zhangsan", 18);
		
		hashSet.add(s1);
		hashSet.add(s2);
		hashSet.add(s3);
		
		hashSet.add(s4);
		
		System.out.println(hashSet.size());   // 3  ≤ª‘ –Ì÷ÿ∏¥
		
		
		
	}
}
