package com.lianxi;

public class Exception_1 {
	public static void main(String[] args) {
		teacher t = new teacher("������");
		try {
			t.prelect();
		} catch (NoPlanException e) {
			System.out.println("����ʦ�򻻻����Ͽ�");
		}
	}
	
	
}
class Computer{
	private int state = 3;
	public void run() throws LanPingException,MaoYanException{
		if(state == 2)
			throw new LanPingException("������");
		if(state == 3)
			throw new MaoYanException("ð����");
		System.out.println("��������");
	}
	public void reset(){
		state = 1;
		System.out.println("��������");
	}
}
class teacher{
	private String Name;
	private  Computer cmpt;
	
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public teacher(String Name){
		this.Name = Name;
		cmpt = new Computer();
	}
	public  void prelect()throws NoPlanException{
		System.out.println("��ʦ������"+Name);
		try {
			cmpt.run();
		} catch (LanPingException e) {
			cmpt.reset();
		} catch (MaoYanException e) {
			test();
			throw new NoPlanException("��ʱ�޷�����");
		}
		System.out.println("����");
	}
	public void test(){
		System.out.println("����ϰ");
	}
}
class LanPingException extends Exception{
	public LanPingException(String message){
		super(message);
	}
}
class MaoYanException extends Exception{
	public MaoYanException(String message){
		super(message);
	} 
}
class NoPlanException extends Exception{
	public NoPlanException(String message){
		super(message);
	}
}






