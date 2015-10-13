package com.lianxi;

public class Exception_1 {
	public static void main(String[] args) {
		teacher t = new teacher("刘教授");
		try {
			t.prelect();
		} catch (NoPlanException e) {
			System.out.println("换老师或换机房上课");
		}
	}
	
	
}
class Computer{
	private int state = 3;
	public void run() throws LanPingException,MaoYanException{
		if(state == 2)
			throw new LanPingException("蓝屏了");
		if(state == 3)
			throw new MaoYanException("冒烟了");
		System.out.println("电脑运行");
	}
	public void reset(){
		state = 1;
		System.out.println("电脑重启");
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
		System.out.println("教师姓名："+Name);
		try {
			cmpt.run();
		} catch (LanPingException e) {
			cmpt.reset();
		} catch (MaoYanException e) {
			test();
			throw new NoPlanException("课时无法继续");
		}
		System.out.println("讲课");
	}
	public void test(){
		System.out.println("做练习");
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






