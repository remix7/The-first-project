package com.remix;

public class T1_9_9 {
	public static void main(String[] args) {		
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= i; j++) {				
				System.out.print(i+"*"+j +"=" +i*j +" ");
				if(i==j){
					System.out.println();
				}
				
			}			
		}
	}
}
