package com.remix;

import java.util.Arrays;

/*
 * ���ҳ� {1,123,234,32534,54,432,2232,65,34,21,213,246,7,212,44,123,324567765}
 * ���ܱ�4����������������Сֵ������ӡ������
 * 
 * */
public class lianxi_2 {
	public static void main(String[] args) {
		int[] x = { 1, 123, 234, 32534, 54, 432, 2232, 65, 34, 21, 213, 246, 7,
				212, 44, 123, 324567765 };
		// System.out.println("������Ϊ��"+getMax(x));
		// System.out.println("��С����Ϊ��" +getMin(x));
		// Arrays.toString() �����������ֱ�Ӵ�ӡ����
		// ��[1, 123, 234, 32534, 54, 432, 2232, 65, 34, 21, 213, 246, 7, 212,
		// 44, 123, 324567765]
		System.out.println(Arrays.toString(x));

		// Arrays �е�copyOf���� ���Խ��������� ��һ��������Ҫ�����ݵ����� �ڶ������������ݺ�ĳ���
		x = Arrays.copyOf(x, x.length + 1);
		x[x.length - 1] = 10000;
		sop(x);
		int[] s = new int[x.length];

		// System.arraycopy��������ܹ��������� Դ���� �ĵط���ʼ ���������� �ǵط���ʼ �����ĳ���
		System.arraycopy(x, 0, s, 0, x.length);
		System.out.println();
		sop(s);
	}

	public static int getMax(int[] array) {
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < array.length; i++) {
			if (array[i] % 4 == 0) {
				if (array[i] > max) {
					max = array[i];
				}
			}
		}
		return max;
	}

	public static int getMin(int[] array) {
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < array.length; i++) {
			if (array[i] % 4 == 0) {
				if (array[i] < min) {
					min = array[i];
				}
			}
		}
		return min;
	}

	public static void sop(int[] x) {
		for (int i = 0; i < x.length; i++) {
			System.out.print(x[i] + " ");
		}
	}
}