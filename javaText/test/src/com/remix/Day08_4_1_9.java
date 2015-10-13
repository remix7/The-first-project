package com.remix;

import java.util.Arrays;
/*
 * 请申明一个字符串数组，并把1-99的值放入其中。
 * 要求放入其中的值必须是两位(如：{"01","02","03",...,"99"})，并打印此数组。
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
