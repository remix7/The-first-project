package Demo1;

import java.util.Scanner;
//����һ�������ж�����18���ϵ   ����֧��˫��֧�����֧��


public class Demo1 {
	public static void main(String[] args) {
		int age;
		System.out.println("������һ������");
		Scanner ag = new Scanner(System.in);
		age = ag.nextInt();
		if(age>=18){
			System.out.println("����������18�꣬ҪΪ�Լ�����Ϊ����");
		}
		  else if(10<=age&&age<18){
			System.out.println("������䲻��18�꣬���Բ��ø���");
		}
		  else if(age<10){
			  System.out.println("����Բ��ø���");
		  }

	}
}
