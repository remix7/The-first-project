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
		System.out.println("Ö÷°åÆô¶¯");
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
		System.out.println("Éù¿¨Æô¶¯");
	}

	public void close() {
		System.out.println("Éù¿¨¹Ø±Õ");
	}
}
class NetCard implements PIC{

	public void open() {
		System.out.println("Íø¿¨´ò¿ª");
	}

	public void close() {
		System.out.println("Íø¿¨¹Ø±Õ");
	}
}
