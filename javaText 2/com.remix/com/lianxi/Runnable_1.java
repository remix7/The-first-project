package com.lianxi;

public class Runnable_1 {
	public static void main(String[] args) {
		maipiao m = new maipiao();
		new Thread(m).start();
		new Thread(m).start();
		new Thread(m).start();
	}
}
class maipiao implements Runnable{
	 private static int x = 1000;
	 Object obj = new Object();
	public void run() {
		while (true) {
			show();
		}
	}
	public synchronized void show(){
		if (x>0) {
			try{Thread.sleep(10);}catch(Exception e){}
			System.out.println(Thread.currentThread().getName()+"��ƱƱ:"+x--);
		}
	}
}
/*
 * �������ģʽ�е�����ʽ  �Ķ��߳�д��
class Single{
	private static Single s = null;
	private Single(){}
	public static Single getInstance(){
		if (s==null) {
			synchronized (Single.class) {
				if (s==null) {
					s = new Single();
				}
			}
		}
		return s;
		}
	}
*/
	
	