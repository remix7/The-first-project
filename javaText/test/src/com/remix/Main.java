package com.remix;

//������һ�����飨���⣩������ֵ��Ȼ��������ݲ�������ӡ�����顣
import java.util.Arrays;
import java.util.Random;

public class Main {
	public static void main(String[] args) {
		/* ������ʾ����ɾ���˶����֣��ڴ�����Java���� */
		// int[] a = { 1, 2, 3, 4, 5, 10, 3, 5, -1, 0 };
		// System.out.print(Arrays.toString(ChaRuPaiXu(a)));

		// a= Arrays.copyOf(a,a.length+1);
		// System.out.println(Arrays.toString(a));
		// Arrays.sort(a);
		//
		// System.out.println(Arrays.toString(a));
		int[] a = new int[100000];
		for (int i = 0; i < a.length; i++) {
			a[i] = new Random().nextInt();
		}
		long start = System.currentTimeMillis();
		// Arrays.sort(a);//0mx
		// a = MaoPaoPaiXu(a);//180ms
		// a= XuanZePaiXu(a); //130ms
		// a = ChaRuPaiXu(a);//36ms
		long end = System.currentTimeMillis();
		System.out.println(end - start);
	}

	// ð������
	public static int[] MaoPaoPaiXu(int[] a) {
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = 1; j < a.length; j++) {
				int max = a[j];
				if (a[j] < a[j - 1]) {
					max = a[j];
					a[j] = a[j - 1];
					a[j - 1] = max;
				}
			}
		}
		return a;
	}

	// �x������
	public static int[] XuanZePaiXu(int[] a) {
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					int min = a[j];
					a[j] = a[i];
					a[i] = min;
				}
			}
		}
		return a;
	}

	// ��������
	public static int[] ChaRuPaiXu(int[] a) {
		int value;
		for (int i = 1; i < a.length; i++) {
			value = a[i];
			for (int j = i - 1; j >= 0 && value < a[j]; j--) {
				a[j + 1] = a[j];
				a[j] = value;
			}

		}
		return a;

	}
}