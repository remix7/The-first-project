package com.remix;

import java.util.Scanner;

/*
 * ����һ��int������ĳ���   ���ֶ���ʼ��  
 * ���  �����ֵ ����Сֵ
 */
public class Day06_4_1_1 {

	public static void main(String[] args) {
		Array.abc();
	}
}

class Array {
	public static void abc() {
		Scanner m = new Scanner(System.in);
		System.out.println("����������Ҫ�����鳤��");
		int[] a = new int[m.nextInt()];
		Scanner s = new Scanner(System.in);
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			System.out.print("�������" + (i + 1) + "�����֣�");
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