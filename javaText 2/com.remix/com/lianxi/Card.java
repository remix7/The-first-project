package com.lianxi;

public class Card {
	public static void main(String[] args) {
		mainCard mc = new mainCard();
		mc.run();
		mc.usePIC(new NetCard());
		mc.usePIC(new SoundCard());
	}
}
interface PIC{
	public void open();
	public void close();
}	
class mainCard{
	public void run(){
		System.out.println("��������");
	}
	public void usePIC(PIC p){
		if (p!=null) {
			p.open();
			p.close();
		}
	}
}
class SoundCard implements PIC{

	public void open() {
		System.out.println("��������");
	}

	public void close() {
		System.out.println("�����ر�");
	}
}
class NetCard implements PIC{

	public void open() {
		System.out.println("������");
	}

	public void close() {
		System.out.println("�����ر�");
	}
}
