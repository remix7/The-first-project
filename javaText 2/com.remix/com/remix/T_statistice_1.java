package com.remix;

import java.util.Scanner;

public class T_statistice_1 {
	public static void main(String[] args) {
//		int[][] b = {{123,456,789},{147,258,369},{-987,-654,-321}};
		System.out.print("请输入你的数组的行数(默认行数和列数相同，");
		System.out.print("数组的元素个数为行数和列数的积）：");	
		int n = new Scanner(System.in).nextInt();
		int[][]  a = new int[n][n];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.print("请输入你想放入数组中的数以回车结束：" );
				a[i][j]=new Scanner(System.in).nextInt();
			}
		}
		printArray(a);
//		printArray(b);
	}
	//数组大小总和的计算方法
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
