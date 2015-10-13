package com.lianxi;

public class ZH16 {
	public static void main(String[] args) {
		Hex(60);
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
}
