package com.remix;

import java.util.Scanner;

public class T_ergodic {
	public static void main(String[] args) {
		//int[][] b = {{123,456,789},{147,258,369},{-987,-654,-321}};
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
		Ergodic(a);
	}
	public static void Ergodic(int[][] a){
		for (int i = 0;  i< a.length; i++) {
			System.out.print("数组的第" +(i+1) +"行数是：" );
			for (int j = 0; j < a[i].length; j++) {				
				System.out.print(a[i][j]+" ");				
			}			
			System.out.println();
		}
	}
}
