package Demo1;
//����һ����  ��ӡÿ�еĵݼӵ�*  ���ߣ�����
import java.util.Scanner;
public class Demo2 {
	public static void main(String[] args) {
		System.out.println("������һ����");
		int x = new Scanner(System.in).nextInt();
		for(int i = 1;i <= x;i ++){
			for(int a = 1;a <= i;a++){
			System.out.print("*");
			}
			System.out.print("\n");
		}
	}
}

	
