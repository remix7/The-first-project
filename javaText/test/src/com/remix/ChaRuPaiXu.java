package com.remix;

import java.util.Arrays;

//��������
/*��  ��һ����������a[0]��a[1]��������   
 * �ڶ�����a[2]  �Ƚ��Ѿ��ĺ����a[0]��a[1]��������  �Դ�����
 * */
public class ChaRuPaiXu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] x = { 5, 4, 2,10,2,1,33,58,199,0,200,10 };
		System.out.println(Arrays.toString(shot(x)));

	}

	public static int[] shot(int[] a) {
		int value, j;
		for (int i = 1; i < a.length; i++) {
			value = a[i];
			for (j = i - 1; j >= 0&&value<a[j]; j--) {
					a[j + 1] = a[j];
					a[j] = value;
			}
			
		}
		return a;

	}
}