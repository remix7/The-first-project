package com.remix;

public class JiaoHuan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		swap(12, 13);
	}
	public static void swap(int a,int b){
		int s = a;
		a = b;
		b = s;
		System.out.println(a+" "+b);
	}
}
