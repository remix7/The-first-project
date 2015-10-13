package javaTest;

import java.util.Scanner;

public class Njc {
	public static void main(String[] args) {
		System.out.print("请输入一个你想求垒乘的数：");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();	
		float sum = 0;		
		for (int i = 1; i <= a; i++) {
			float s = 1;
			for (int j = 1; j <=i; j++) {
				s = s*j;
			}
			sum+=s;
		}
		System.out.println(a+"个数垒乘相加="+sum);
	}
}
