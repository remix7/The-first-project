package com.remix;
//����.��̬����  ʱ   ���캯��û��ִ�� ִ�е��Ǿ�̬�����
//���ж����ʱ��   ������þ�̬����  ��̬����鲻ִ��  ���ǹ��캯����ִ��
public class StaticTest {
	static int i ;
	static{
		i = 11;
		System.out.println(" ��̬�����ִ��");
	}
	public StaticTest(){
		System.out.println("���캯����ִ��");
	}
	static void f(){
		System.out.println("��̬������ִ��"+i);
	}
	public static void main(String[] args) {
		StaticTest.f();
		StaticTest s= new StaticTest();
		s.f();
	}
	
}
