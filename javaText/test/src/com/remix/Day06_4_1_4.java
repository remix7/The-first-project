package com.remix;

//找出数组中相同且最大的元素
public class Day06_4_1_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// int[] a = { 1, 2, 3, 8, 6, 8, 54, 52 };
		// int[] b = { 5, 2, 58, 44, 4, 54, 58, 6 };
		// jh(a, b);
	}

	public static void jh(int[] a, int[] b) {
		int max = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b.length; j++) {
				if (a[i] == a[j]) {
					if (max < a[i]) {
						max = a[i];
						break;
					}
				}
			}
		}
		System.out.println(max);
	}

}
