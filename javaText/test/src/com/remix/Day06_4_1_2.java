package com.remix;

//����ֵ����
public class Day06_4_1_2 {
	public static void main(String[] args) {
		// int[] a = {1,2,3,4,5,8,6,4,8,5,55,22};
		// Array2.Reverse(a);
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8 };
		for (int i = 0; i < (arr.length) / 2; i++) {
			int swap = arr[i];
			arr[i] = arr[arr.length - 1 - i];
			arr[arr.length - 1 - i] = swap;
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}

class Array2 {
	public static void Reverse(int[] array) {
		for (int i = 0; i < (array.length) / 2; i++) {
			int swap = array[i];
			array[i] = array[array.length - 1 - i];
			array[array.length - 1 - i] = swap;
		}
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}
}
