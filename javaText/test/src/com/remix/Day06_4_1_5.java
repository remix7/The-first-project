package com.remix;

/*
 * ������������С��Լ������󹫱�����
 * Ҫע��
 * int[] s = new int[getArrayLength(x)];
		int j = 0;
		for (int i = 1; i <= x / 2; i++) {
			if (x % i == 0 && x != i) {
				s[j++] = i;
			}
		}
		
		��С����������������˳������Լ��
 * */
public class Day06_4_1_5 {

	public static void main(String[] args) {

		gys_gbs.gys_gbs(15, 10);
	}

}

class gys_gbs {
	public static void gys_gbs(int x, int y) {
		int[] a = new int[getArrayLength(x)];
		int[] b = new int[getArrayLength(y)];
		a = serach(x);
		b = serach(y);
		int source_max_gys = getMax(a, b);
		int source_min_gbs = (x * y) / source_max_gys;
		System.out.println("���Լ���ǣ�" + source_max_gys);
		System.out.println("��С�������ǣ�" + source_min_gbs);
	}

	// �ҳ���Լ���ĸ���
	public static int getArrayLength(int x) {
		int count = 1;
		for (int i = 1; i <= x / 2; i++) {
			if (x % i == 0 && x != i) {
				count++;
			}
		}
		return count;
	}

	// �г���Լ��������������
	public static int[] serach(int x) {
		int[] s = new int[getArrayLength(x)];
		int j = 0;
		for (int i = 1; i <= x / 2; i++) {
			if (x % i == 0 && x != i) {
				s[j++] = i;
			}
		}
		s[j] = x;
		return s;
	}

	// �ҳ������������Լ��
	public static int getMax(int[] a, int[] b) {
		int max = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b.length; j++) {
				if (a[i] == b[j]) {
					if (max < a[i]) {
						max = a[i];
					}
				}
			}
		}
		return max;
	}

	
}