package com.leaning;

public class T_exchange {
	public static void main(String[] args) {
		exchange p = new exchange();
		
	}
}
class exchange{
	int[][] a ;
	
	public void exchang(int[][] a){
		for (int i = 0; i < a.length; i++) {
			System.out.println("数组的第"+(i+1)+"行是：");
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j]+" ");
			}
		}
		System.out.println();
	}	
}