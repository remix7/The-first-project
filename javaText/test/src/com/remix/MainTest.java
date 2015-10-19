package com.remix;
//main  函数可以存在类中   需要传人参数  同样也可以类名.main调用

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
