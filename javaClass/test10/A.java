package test10;

public class A {
	private int x;
	int y;
	protected int z;
	public int t;
	
	private void f1(){
		System.out.println("f1....");
	}
	void f2(){
		System.out.println("f2....");
	}
	protected void f3(){
		A aa = new A();
		aa.f1();
		System.out.println("f3....");
	}
	public void f4(){
		System.out.println("f4....");
	}
	public static void main(String[] args) {
		A a = new A();
		//本类的内部方法
		
	}
}
