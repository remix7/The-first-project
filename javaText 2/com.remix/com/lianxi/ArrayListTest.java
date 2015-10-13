package com.lianxi;

import java.util.*;
public class ArrayListTest {
	//打印封装函数
	public static void sop(Object obj){
		System.out.println(obj);
	}
	//主函数
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add("java01");
		al.add("java02");
		al.add("java01");
		al.add("java03");
		al.add("java02");
		Iterator it = al.iterator();
		while(it.hasNext()){
			sop(it.next());
		}
		sop(al);
		al = SingalElment(al);
		sop(al);
		
		
	}
	public static ArrayList SingalElment(ArrayList al){
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
