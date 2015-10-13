package com.remix;

import java.util.Arrays;

//数组的排序
public class Day07_4_1_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 5, 59, 552, 2, 45, 484, 468, 468, 45, 2, 1, 87, 1, 54, 2,
				15, 48, 45, 86, 6, 68, 46468, 5, 222 };
		MaoPaoPaiXu(a);
		XuanZePaiXu(a);

	}

	// 选择排序 全部比较 11 12 13 14 15
	public static void XuanZePaiXu(int[] a) {
		int max = a[0];
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = i + 1; j < a.length - i; j++) {
				if (a[i] > a[j]) {
					max = a[i];
					a[i] = a[j];
					a[j] = max;
				}
			}
		}
		System.out.println(Arrays.toString(a));
	}

	// 冒泡排序 每两个比较 12 23 34 45
	public static void MaoPaoPaiXu(int[] a) {
		for (int i = 0; i < a.length - 1; i++) {// 控制循环的次数
			for (int j = 1; j < a.length; j++) {
				int max = a[j - 1];
				if (a[j] < a[j - 1]) {
					max = a[j];
					a[j] = a[j - 1];
					a[j - 1] = max;
				}
			}
		}
		System.out.println(Arrays.toString(a));
	}

}
