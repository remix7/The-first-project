package com.remix;

import java.util.Arrays;

public class ChaRuOneValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 45, 8, 22, 48, 97, 25, 13, 55, 78, 1 };
		Day07_4_1_1.MaoPaoPaiXu(a);
		maopao(a);
		System.out.println(Arrays.toString(otherSource(a, -1)));
	}

	// �������в���һ���� ʹ�仹����˳���  ��������
	public static int[] otherSource(int[] a, int value) {
		a = Arrays.copyOf(a, a.length + 1);
		int i;
		for (i = a.length - 2; i >= 0; i--) {
			if (value < a[i]) {
				a[i + 1] = a[i];
			} else {
				break;
			}
		}
		a[i + 1] = value;
		// int x = 0;
		// for (int i = a.length - 2; i >= 0; i--) {
		// if (value > a[a.length - 2]) {
		// x = a.length - 1;
		// break;
		// }
		// if (value < a[i]) {
		// a[i + 1] = a[i];
		// x = i;
		// } else {
		// break;
		// }
		// }
		// a[x] = value;
		return a;
	}

	// ð������
	public static void maopao(int[] a) {
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = 1; j < a.length - 1 - i; j++) {
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