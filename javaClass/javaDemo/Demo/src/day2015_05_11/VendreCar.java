package day2015_05_11;

public class VendreCar {
	public static void main(String[] args) {
		CarShop car = new CarShop();
		car.sellCar(new BMW());
		car.sellCar(new CheryQQ());
		car.sellCar(new Auto());
		System.out.println("总收入："+car.getMonry());
	}
}
interface Car{
	String getName();
	double getPirce();
}
class BMW implements Car{

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "BMW";
	}

	@Override
	public double getPirce() {
		// TODO Auto-generated method stub
		return 300000.0;
	}
	
}
class Auto implements Car{

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "大众";
	}

	@Override
	public double getPirce() {
		// TODO Auto-generated method stub
		return 80000.0;
	}
	
}
class CheryQQ implements Car{

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "QQ";
	}

	@Override
	public double getPirce() {
		// TODO Auto-generated method stub
		return 30000.0;
	}
	
}

class CarShop{
	private double money=0;
	public void sellCar(Car car){
		System.out.println("车型："+car.getName()+"  价格："+ car.getPirce());
		money+=car.getPirce();
	}
	public double getMonry(){
		return money;
	}
	
}










