package day2015_05_11;

public class Interface {
	MobliPhone p = new MobliPhone();
	
}
interface Usb{
	public void USB();
}
class MobliPhone implements Usb{

	@Override
	public void USB() {
		// TODO Auto-generated method stub
		System.out.println("�����ֻ���������USB��");
	}	
}
class Computer implements Usb{

	@Override
	public void USB() {
		// TODO Auto-generated method stub
		System.out.println("���ǵ��ԣ�������USB��");
	}
	
}