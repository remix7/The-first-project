package com.remix;
/*
 * ����Ķ���Ĺ��캯��   Ĭ�ϻ���ø����޲εĹ��캯��
 * this һ���Ǿ�̬�ĳ�Ա�������ʷǾ�̬�ĳ�Աǰ��ʡ��this
 *  this���ǵ�ǰ����v��ʵʵ�������ã� ��������������Ǹ������� m1 
 *  �����˷�������������������ʵ��
 *  ����test������test�����ֹ�������д  ���Ե���������ĺ���
 * 
 * */
public class ChongZaiTest {
	public static void main(String[] args) {
		m m1= new m();
	}
}
class v{
	public v(){test();}
	public void test(){
		System.out.println("this is A test");
	}
}
class m extends v{
	public m(){}
	public void test(){
		System.out.println("this is B test");
	}
}
