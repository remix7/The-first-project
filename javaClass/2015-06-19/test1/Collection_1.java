package test1;

import java.util.ArrayList;

public class Collection_1 {
	public static void main(String[] args) {
		ArrayList a = new ArrayList();
		a.add(123);
		a.add("456");
		a.add("79");
		a.add("ZhangSan");
		a.add("123");
		System.out.println(a.equals("123"));
//		
		System.out.println(a.size());
		for (int i = 0; i < a.size(); i++) {
			System.out.println(a.get(i));
		}
	}
	
}
