package com.remix;

public class jiecheng {
	public static void main(String[] args) {
		System.out.println(jiec(5));
	}
	
	public static long jiec(int x){
		
		if (x == 1) 
			return 1;
		return jiec(x-1)*x;
		
	}
}
