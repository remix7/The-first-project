package com.remix;

/*
 * 求两个数的最小公约数和最大公倍数；
 * 要注意
 * int[] s = new int[getArrayLength(x)];
		int j = 0;
		for (int i = 1; i <= x / 2; i++) {
			if (x % i == 0 && x != i) {
				s[j++] = i;
			}
		}
		
		最小公倍数等于两数相乘除以最大公约数
 * */
public class Day06_4_1_5 {

	public static void main(String[] args) {

		gys_gbs.gys_gbs(15, 10);
	}

}

class gys_gbs {
	public static void gys_gbs(int x, int y) {
		int[] a = new int[getArrayLength(x)];
		int[] b = new int[getArrayLength(y)];
		a = serach(x);
		b = serach(y);
		int source_max_gys = getMax(a, b);
		int source_min_gbs = (x * y) / source_max_gys;
		System.out.println("最大公约数是：" + source_max_gys);
		System.out.println("最小公倍数是：" + source_min_gbs);
	}

	// 找出公约数的个数
	public static int getArrayLength(int x) {
		int count = 1;
		for (int i = 1; i <= x / 2; i++) {
			if (x % i == 0 && x != i) {
				count++;
			}
		}
		return count;
	}

	// 中出公约数并放入数组中
	public static int[] serach(int x) {
		int[] s = new int[getArrayLength(x)];
		int j = 0;
		for (int i = 1; i <= x / 2; i++) {
			if (x % i == 0 && x != i) {
				s[j++] = i;
			}
		}
		s[j] = x;
		return s;
	}

	// 找出两个数的最大公约数
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
