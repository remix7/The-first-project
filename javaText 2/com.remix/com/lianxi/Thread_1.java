package com.lianxi;

public class Thread_1 {
	public static void main(String[] args) {
		abc a = new abc("����");
		abc b = new abc("����");
		abc c = new abc("����");
		a.start();
		b.start();
		c.start();
		for (int i = 0; i < 100; i++) {
			System.out.println("====== "+i);
		}
	}
}
class abc extends Thread{
	public String name;
	public abc(String name){
		super(name);
	}
	public void run(){
		for (int i = 0; i < 100; i++) {
			System.out.println(Thread.currentThread().getName()+":"+i);
		}
	}
}