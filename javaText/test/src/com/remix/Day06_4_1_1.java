package com.remix;

import java.util.Scanner;

/*
 * 输入一个int型数组的长度   并手动初始化  
 * 求和  求最大值 和最小值
 */
public class Day06_4_1_1 {

	public static void main(String[] args) {
		Array.abc();
	}
}

class Array {
	public static void abc() {
		Scanner m = new Scanner(System.in);
		System.out.println("请输入你想要的数组长度");
		int[] a = new int[m.nextInt()];
		Scanner s = new Scanner(System.in);
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			System.out.print("请输入第" + (i + 1) + "个数字：");
			a[i] = s.nextInt();
			sum += a[i];

		}
		int max = a[0], min = a[0];
		for (int i = 1; i < a.length; i++) {
			if (max < a[i])
				max = a[i];
			if (min > a[i])
				min = a[i];
		}
		System.out.println(min);
		System.out.println(max);
		System.out.println(sum);
	}
}
