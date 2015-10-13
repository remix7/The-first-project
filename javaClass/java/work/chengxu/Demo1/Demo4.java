package Demo1;

import java.util.Scanner;

public class Demo4 {
	public static void main(String[] args) {
		System.out.println("请输入一个数");
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();		
		System.out.println(jc(n));
		
	}
	public static int jc(int n){
		if(n == 1){
			return 1;
		}
		else {
			return n*jc(n-1);
		}
	}
}
