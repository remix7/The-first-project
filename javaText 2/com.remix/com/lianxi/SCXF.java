package com.lianxi;

public class SCXF {
	public static void main(String[] args) {
		Source s = new Source();
		shengchan sc = new shengchan(s);
		xiaofei xf = new xiaofei(s);
		Thread t1 = new Thread(sc);
		Thread t2 = new Thread(sc);
		Thread t3 = new Thread(xf);
		Thread t4 = new Thread(xf);
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		
	}
}
//Ҫ���������
class Source{
	private String name;
	private int count = 1;
	private boolean flag = false;
	public synchronized void set(String name){
		while(flag)//ѭ������������
			try {
				wait();//ͣ��
			} catch (Exception e) {}
		this.name = name+"--"+count++;
		System.out.println(Thread.currentThread().getName()+"...������"+this.name);
		flag = true;
		this.notifyAll();//ȫ������
	}
	public synchronized void out(){
		while(!flag) {
			try {
				wait();
			} catch (Exception e) {}
		}
		System.out.println(Thread.currentThread().getName()+"...�����ߡ�������"+this.name);
		flag = false;
		this.notifyAll();
	}
}
//������
class shengchan implements Runnable{
	private Source sou;
	public shengchan(Source sou){
		this.sou = sou;
	}
	public void run() {
		while (true) {
			sou.set("shangpin");
		}
	}
}
//������
class xiaofei implements Runnable{
	private Source sou;
	public xiaofei(Source sou){
		this.sou = sou;
	}
	public void run() {
		while (true) {
			sou.out();
		}
	}
}