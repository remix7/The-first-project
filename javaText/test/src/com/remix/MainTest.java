package com.remix;
//main  �������Դ�������   ��Ҫ���˲���  ͬ��Ҳ��������.main����

public class MainTest {
	public static void main(String[] args) {
		String[] s = { "hello", "world" };
		Test.main(s);
		
	}
}

class Test {
	public static void main(String[] args) {
		for (int i = 0; i < args.length; i++) {
			System.out.println(args[i]);
		}
	}
}
