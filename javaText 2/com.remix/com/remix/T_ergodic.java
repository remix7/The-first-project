package com.remix;

import java.util.Scanner;

public class T_ergodic {
	public static void main(String[] args) {
		//int[][] b = {{123,456,789},{147,258,369},{-987,-654,-321}};
		System.out.print("������������������(Ĭ��������������ͬ��");
		System.out.print("�����Ԫ�ظ���Ϊ�����������Ļ�����");	
		int n = new Scanner(System.in).nextInt();
		int[][]  a = new int[n][n];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.print("������������������е����Իس�������" );
				a[i][j]=new Scanner(System.in).nextInt();
			}
		}
		Ergodic(a);
	}
	public static void Ergodic(int[][] a){
		for (int i = 0;  i< a.length; i++) {
			System.out.print("����ĵ�" +(i+1) +"�����ǣ�" );
			for (int j = 0; j < a[i].length; j++) {				
				System.out.print(a[i][j]+" ");				
			}			
			System.out.println();
		}
	}
}
