package com.remix;

import java.util.Scanner;

public class T_statistice_1 {
	public static void main(String[] args) {
//		int[][] b = {{123,456,789},{147,258,369},{-987,-654,-321}};
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
		printArray(a);
//		printArray(b);
	}
	//�����С�ܺ͵ļ��㷽��
	public static void printArray(int[][] a){
		int max=-100000;
		int min=0;
		int sum=0;
		for (int i = 0; i < a.length; i++) {			
			for (int j = 0; j < a[i].length; j++) {
				
				if(a[i][j]>max){
					max = a[i][j];
				}
				if(a[i][j]<min){
					min = a[i][j];
				}	
				sum+=a[i][j];
			}			
		}		
		System.out.println("max= "+max);
		System.out.println("min= "+min);
		System.out.println("sum= "+sum);	
	}
}
