package com.remix;

public class Cercal {
	public static double PI = 3.14;
	private double r;
	private Point center;
	
	public double getR() {
		return r;
	}

	public void setR(double r) {
		this.r = r;
	}

	public Point getCenter() {
		return center;
	}

	public void setCenter(Point center) {
		this.center = center;
	}

	public Cercal(double r, Point center) {
		super();
		this.r = r;
		this.center = center;
	}
	public Cercal(){}
	public static void getMianJi(double r){
		System.out.println(r*r*PI);
	}
	public static void getZhouChang(double r){
		System.out.println(2*r*PI);
	}
	public static void getTrueOrflase(Point p,Cercal c){
		if (Math.sqrt(p.x-c.center.x*p.x-c.center.x)+
				(p.y-c.center.y*p.y-c.center.y)>c.r) {
			System.out.println("该点不在圆内");
		}else if (Math.sqrt(p.x-c.center.x*p.x-c.center.x)+
				(p.y-c.center.y*p.y-c.center.y)==c.r) {
			System.out.println("该点在圆上");
		}else{
			System.out.println("该点在圆内");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cercal c = new Cercal(3.4,new Point(1.2,18));
		Cercal.getMianJi(c.getR());
		Cercal.getZhouChang(c.getR());
		Cercal.getTrueOrflase(new Point(2.1,3.1), c);
	}

}

class Point {
	double x, y;

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}

	public Point(double x, double y) {
		super();
		this.x = x;
		this.y = y;
	}

	public Point() {
	}
}
