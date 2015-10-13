package com.remix;

public class T1_9_9_1 {
	public static void main(String[] args) {
		int sum = 0;
		int max=0;
		int min=0;
		int[][] A = {{1,2,-2},{4,5,-18},{7,30,9}};
			for (int i = 0; i < A.length; i++) {
				for (int j = 0; j < A[i].length; j++) {
					sum+=A[i][j];
					if(A[i][j]>max){
						max=A[i][j];
					}
					if(A[i][j]<min){
						min=A[i][j];
					}
			}		
		}
			System.out.println(sum);
			System.out.println(max);
			System.out.println(min);
	}	
}
