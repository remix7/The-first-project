package com.remix;
//写一个方法  向任意一个整形数组的任意位置插入一个数
//当然下标不嫩越界
import java.util.Arrays;

public class Day06_4_1_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] s = {1,2,3,4,5,8,9,5,10,4};
		s = insertArray(s, 5, 100);
		System.out.println(Arrays.toString(s));

	}

	public static int[] insertArray(int[] a, int index, int value) {
		a = Arrays.copyOf(a, a.length + 1);
		int[] b = new int[a.length];
		System.arraycopy(a, 0, b, 0, a.length);
		a = b;
		for (int i = a.length-1; i > index; i--) {
			a[i] = a[i-1];
		}
		a[index] = value;
		return a;
	}
	
}
