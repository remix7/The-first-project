package com.lianxi;

public class Array {
	public static void main(String[] args) {
		trans(0,15,4);
	}
	public static void  trans(int num,int a,int b){
		if (num==0) {
			System.out.println(0);
			return;
		}
		char[] x16= {'0','1','2','3',
				'4','5','6','7',
				'8','9','A','B',
				'C','D','E','F'};
		char[] arr = new char[32];
		int pose = arr.length;
		while (num!=0) {
			arr[--pose]=x16[num&a];
			num = num >>> b;			
		}
		for (int i = pose; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
