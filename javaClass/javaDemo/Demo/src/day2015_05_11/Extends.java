package day2015_05_11;

public class Extends {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LittleMonkey lm1 = new LittleMonkey();
		lm1.age = 1;
		lm1.name="Monkey";
		lm1.Swimming();
		lm1.Jiao();
		lm1.Jiao1();
	}

}

class Monkey{
	int age;
	String name;
	public void Jiao1(){
		System.out.println("���ӻ��");
	}
}
interface Fish{
	public void Swimming();
}
interface Brid{
	public void Jiao();
}
class LittleMonkey extends Monkey implements Fish,Brid{

	@Override
	public void Swimming() {
		// TODO Auto-generated method stub
		System.out.println("���ӻ�����Ӿ");
	}
	@Override
	public void Jiao() {
		// TODO Auto-generated method stub
		System.out.println("�����볪��");
	}
}