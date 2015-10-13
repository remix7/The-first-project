package com.lianxi;

public class ZH {
	public static void main(String[] args) {
		toBin(1000);
		System.out.println();
//		Hex(60);
//		System.out.println();
		toHex(1000);
		System.out.println();
		tobin(-1000);
	}
	public static void toBin(int num){
		StringBuffer sb = new StringBuffer();
		while (num>0) {
			sb.append(num%2);
			num = num/2;			
		}
		System.out.print(sb.reverse());
	}
	public static void to16(int num){
		StringBuffer sb = new StringBuffer();
		while (num>0) {
			
			
		}
	}
	
	public static void Hex(int num){
		StringBuffer bf = new StringBuffer();
		for (int x = 0; x < 8; x++) {
			int temp = num & 15;
			if (temp>9) {
				bf.append((char)(temp-10+'A'));
			}
			else{
				bf.append(temp);
			}			
			num=num >>> 4;
		}
		System.out.println(bf.reverse());
	}
	public static void toHex(int num){
		char[] x16= {'0','1','2','3',
				'4','5','6','7',
				'8','9','A','B',
				'C','D','E','F'};
		char[] arr = new char[8];
		int pose = arr.length;
		while (num!=0) {
			arr[--pose]=x16[num&15];
			num = num >>> 4;			
		}
		for (int i = pose; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
	public static void tobin(int num){
		char[] x16= {'0','1'};
		char[] arr = new char[32];
		int pose = arr.length;
		while (num!=0) {
			arr[--pose]=x16[num&1];
			num = num >>> 1;			
		}
		for (int i = pose; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
}









