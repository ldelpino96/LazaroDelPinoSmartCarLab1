package com.smartcarlab;

public abstract class SmartCar {
	private String color;
	private String Model;
	private int weight;
	private int dimensions;
	private int NumberofWheels;
	public abstract int moveForward();
	public abstract int moveBackward();
	public abstract int stop();
	public abstract int turnRight();
	public abstract int turnLeft();
	public abstract int spin();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}

}
