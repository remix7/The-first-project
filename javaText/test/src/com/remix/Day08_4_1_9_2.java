package com.remix;

import java.util.Arrays;
import java.util.Random;
/*
 * 请用Java代码生成50个随机数，并打印出来。要求随机数范围大于0小于等于100.
 * 注意随机数原包括0不包括括号内的数
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
