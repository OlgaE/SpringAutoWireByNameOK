package com.demo;

public class Triangle {
	
	private Point pointA;
	
	public Point getPointA() {
		return pointA;
	}
	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}

	public void draw(){
		System.out.println("PointA = (" + getPointA().getX() + "," + getPointA().getY() + ")");
	}
}
