package javaTest;

public class T1 {
	public static void main(String[] args) {
		int a = 1;
		int b = 1;
		System.out.print(a+" ");
		System.out.print(b+" ");		
		for (int i = 0; i < 20; i++) {
			int c = a+b;
			a=b;
			b=c;
			System.out.print(b+" ");			
		}
	}
}
