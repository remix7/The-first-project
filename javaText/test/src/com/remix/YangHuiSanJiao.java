package com.remix;

import java.util.Scanner;

//打印杨辉三角的前多少项  由用户自己输入
public class YangHuiSanJiao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("输入你想要打印杨辉三角的层数：");
		YangHui(new Scanner(System.in).nextInt());
	}
	public static void YangHui(int x){
		int[][] a = new int[x][x];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j <a[i].length; j++) {
				a[i][j] = 1;
			}
		}
		for (int i = 2; i < a.length; i++) {
			for (int j = 1; j < i; j++) {
				a[i][j] = a[i-1][j-1]+a[i-1][j];
			}
		}
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}
}
