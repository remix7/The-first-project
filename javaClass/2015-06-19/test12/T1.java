package test12;

import java.util.ArrayList;

public class T1 {
	public static void main(String[] args) {
		//集合
		
		ArrayList alist = new ArrayList();
		
		alist.add(-1);
		alist.add(12);
		alist.add(13);
		alist.add("hello");
		
//		alist.add(-1);
		for (int i = 0; i < alist.size(); i++) {
			System.out.print(alist.get(i) + "  ");
		}
		System.out.println();
//		alist.remove(12);   // 报错，下标越界
//		alist.remove(new Integer(12));
		
		//集合元素遍历打印出来
		for (int i = 0; i < alist.size(); i++) {
			System.out.print(alist.get(i) + "  ");
		}
//		System.out.println(alist.size());
		 
		 
		
	}
}
