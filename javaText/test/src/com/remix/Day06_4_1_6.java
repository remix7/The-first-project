package com.remix;
/*
 * �������в���һ����  
 * */

public class Day06_4_1_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChaRu();
	}
	public static void ChaRu(){
		int[] a = {1,2,3,4,5,6,7,8,9,10};
		//��3�Ǳ��λ�ò���100
		int[] b = new int[11];
		for (int i = 0; i < a.length; i++) {
			b[i] = a[i];
		}
		a = b;
		for (int i = a.length-1; i > 3; i--) {
			a[i] = a[i-1];
		}
		a[3] = 100;
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}
	}
	

}