package com.remix;
//计算任一个数的因子  病保存带数组中   遍历数组

import java.awt.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Day06_4_1_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.print("输入一个数：");
		yinzi.yin(s.nextInt());
		
	}

}
class yinzi{
	public static void yin(int a){
		ArrayList s = new ArrayList();
		int sum=0;
		for (int i = 1; i <= a; i++) {
			if (a%i == 0 && a != i) {
				s.add(i);
				sum+= i;
			}
		}
		System.out.println(sum);
		Object[] abc = s.toArray();
		for (int i = 0; i < abc.length; i++) {
			System.out.print(abc[i]+" ");
		}
	}
	
}
