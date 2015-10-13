package com.remix;

/*
 * 现有两个数组：{ 1, 2, 3, 4, 5, 6, 7, 8, 9,15 };{ 2, 1, 4, 6, 10, 12, 15, 17,9 };
 * 请找出两个数组中相同的最大的一个值，并打印出来。
 * 
 * 
 * */
public class lianxi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] x = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 15 };
		int[] y = { 2, 1, 3, 45, 45, 15, 9, 2, 1, };
		int z = getMax(x, y);
		System.out.println(z);

	}

	public static int getMax(int[] a, int[] b) {
		int max = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b.length; j++) {
				if (a[i] == b[j]) {
					if (max < a[i]) {
						max = a[i];
					}
				}
			}
		}
		return max;
	}

}
