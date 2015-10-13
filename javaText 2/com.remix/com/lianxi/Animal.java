package com.lianxi;

abstract public class Animal {
	abstract public void eat();
	public static void main(String[] args) {
		Animal a = new Cat();
		function(a);
		Animal b = new dog();
		function(b);
	}
	public static void function(Animal a){
		a.eat();
		if(a instanceof Cat){
			((Cat) a).eatMouse();
		}
		else if(a instanceof dog){
			((dog) a).kanmen();
		}
	}
}
class Cat extends Animal{

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("√®≥‘”„");
	}

	public void eatMouse() {
		System.out.println("√®◊•¿œ Û");
	}
}
class dog extends Animal{

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("π∑≥‘»‚");
	}
	public void kanmen() {
	
		System.out.println("π∑ø¥√≈");
	}
}
