package com.remix;

import java.util.Arrays;
/*
 * ������һ���ַ������飬����1-99��ֵ�������С�
 * Ҫ��������е�ֵ��������λ(�磺{"01","02","03",...,"99"})������ӡ�����顣
 * 
 * */
public class Day08_4_1_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Arrays.toString(StringLunch()));
	}
	public static String[] StringLunch(){
		String[] s = new String[99];
		for (int i = 0; i < s.length; i++) {
			if (i<9) {
				s[i]="0"+(i+1);
				
			}else{
				s[i] =""+(i+1) ;
			}
			
		}
		return s;
	}
	
}
