package text;

import java.util.Scanner;

public class text {
	public static void main(String[] args) {
		int i,a,x,z,sum=0;
		Scanner s = new Scanner(System.in);
		x = s.nextInt();
		for(i=1;;i++){
			z=x%10;
			a=x/10;
			sum+=z;
			x=a;
		}
	//	System.out.println(sum);
	}
}
