package Demo1;
/*   *
 *  ***
 * *****    �Ӽ�������һ����   ���մ���ʽ��ӡ��������
 *  	 	���ߣ�����
 */
import java.util.Scanner;
public class Demo3 {
	public static void main(String[] args) {
		System.out.println("������һ����");
		int x = new Scanner(System.in).nextInt();
		for(int i=1;i<=x;i++){
			for(int j=1;j<=x-i;j++){
				System.out.print(" ");
			}
			for(int p=1;p<=(i-1)*2+1;p++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
