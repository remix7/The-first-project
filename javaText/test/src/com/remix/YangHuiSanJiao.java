package com.remix;

import java.util.Scanner;

//��ӡ������ǵ�ǰ������  ���û��Լ�����
public class YangHuiSanJiao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("��������Ҫ��ӡ������ǵĲ�����");
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