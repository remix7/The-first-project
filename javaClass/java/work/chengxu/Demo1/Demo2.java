package Demo1;
//输入一个数  打印每行的递加的*  作者；刘涛
import java.util.Scanner;
public class Demo2 {
	public static void main(String[] args) {
		System.out.println("请输入一个数");
		int x = new Scanner(System.in).nextInt();
		for(int i = 1;i <= x;i ++){
			for(int a = 1;a <= i;a++){
			System.out.print("*");
			}
			System.out.print("\n");
		}
	}
}

	
