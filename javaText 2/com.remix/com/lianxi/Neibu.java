package com.lianxi;

public class Neibu {
	public static void main(String[] args){
		Test.function().method();
		jisuan js = new jisuan();
		try {
			System.out.println(js.jis(4, 1));
		} catch (Exception e) {
			System.out.println("����");
		}
		
		
		new Object(){
			public void show(){
				System.out.println("ͬ���ǳɹ���");
			}
		}.show();
	}
}
interface Inter{
	void method();
}
class Test{
	public static Inter function(){
		return new Inter(){
			public void method() {
				System.out.println("�ɹ���");
			}
		};
	}
}
class jisuan{
	int jis(int a,int b)throws Exception{
		return a/b;
	}
}