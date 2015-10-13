package test12;

import java.util.HashSet;

public class T3 {
	public static void main(String[] args) {
		
		//¼¯ºÏ 
		HashSet hashSet = new HashSet();
		
		hashSet.add(12);
	 
		hashSet.add(42);
		hashSet.add("hello");
		
//		hashSet.add(12);
//		hashSet.add("hello");
		
		//±éÀú
		 for (Object ob : hashSet) {
			System.out.println(ob);
		}
		
//		System.out.println(hashSet.size());
	}
}
