package com.remix;

import java.util.*;

public class T_9_9 {
	public static void main(String[] args) {
		System.out.print("请输入你想要的乘法表的行数：");
		int a = new Scanner(System.in).nextInt();
		if (a>9) {
			System.out.println("行数默认小于等于9！");
			a = 9;
		}
		chengFabiao(a);
	}
	public static void chengFabiao(int a){
		for (int i = 1; i <= a; i++) {
			for (int j = 1; j <= i; j++) {				
				System.out.print(i+"*"+j +"=" +i*j +" ");
				if(i==j){
					System.out.println();
				}				
			}			
		}
	}
}
