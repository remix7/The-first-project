package com.remix;

import java.util.Arrays;
import java.util.Random;
/*
 * ����Java��������50�������������ӡ������Ҫ���������Χ����0С�ڵ���100.
 * ע�������ԭ����0�����������ڵ���
 * */

public class Day08_4_1_9_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Arrays.toString(RandomTest()));
	}

	public static int[] RandomTest() {
		int[] a = new int[50];
		int x = 0;
		Random r = new Random();
		while (true) {
			a[x] = r.nextInt(101);
			if (a[x] == 0) {
				continue;
			}
			x++;
			if (x>49) {
				break;
			}
		}
		return a;
	}

}
