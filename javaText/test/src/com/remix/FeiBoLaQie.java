package com.remix;

public class FeiBoLaQie {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(getData(4));
	}
	public static int getData(int x){
		System.out.println(x);
		if (x == 1 || x == 2 ) {
			return 1;
		}
		else{
			return getData(x-1)+getData(x-2);
		}
	}
}
