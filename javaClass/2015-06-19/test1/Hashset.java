package test1;

import java.util.HashSet;

public class Hashset {
	public static void main(String[] args) {
		HashSet hs = new HashSet();
		hs.add("123");
		hs.add("abc");
		hs.add("hello");
//		hs.add("123");
		for (Object ob : hs) {
			System.out.println(ob+"\t");
		}
		
	}
}
