package com.remix;
//计算任一个数的因子  病保存带数组中   遍历数组
public class Day06_4_1_3_2 {
	public static void main(String[] args) {
		int[] c = yinzi_1.serach(152521);
		printArray(c);
	}

	public static void printArray(int a[]) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}
}

class yinzi_1 {
	public static int[] serach(int n) {
		int[] source = new int[ArrayLength(n)];
		int j = 0, sum = 0;
		for (int i = 1; i <= n / 2; i++) {
			if (n % i == 0 && n != i) {
				source[j++] = i;
				sum += i;
			}
		}
		System.out.println(sum);
		return source;

	}

	public static int ArrayLength(int n) {
		int count = 0;
		for (int i = 1; i <= n / 2; i++) {
			if (n % i == 0 && n != i) {
				count++;
			}
		}
		return count;
	}
}
