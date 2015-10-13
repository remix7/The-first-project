package com.lianxi;

public class GetTime {
	public static void main(String[] args) {
		gt g= new gt();
		g.getTime();
	}
}
abstract class ge{
	public   final void getTime(){
		long start = System.currentTimeMillis();
		runCode();
		long end = System.currentTimeMillis();
		System.out.println(end-start);	
	}	
	public abstract void runCode();
}	

class gt extends ge{
	public void runCode(){
		for (int i = 0; i < 8000; i++) {
			System.out.println(i);
		}
	}	
}

