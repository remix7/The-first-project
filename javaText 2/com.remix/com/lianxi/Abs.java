package com.lianxi;

public class Abs {
	public static void main(String[] args) {
		Demo d = new Demo();
		d.show();
	}
}
abstract class AbsDamo{
	abstract public void show();
}
class Demo{
	final int x = 4;
	class abc extends AbsDamo{
 		public void show() {
		}
	}
	public void show(){
		AbsDamo ad =new AbsDamo(){
			public void show() {
			System.out.println("show-demo:"+x);
			}
		};
		ad.show();
	}
}