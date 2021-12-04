package com.smartcarlab;

import edu.fiu.sysdesign.SelfCheckCapable;
import edu.fiu.sysdesign.SelfCheckUtils;

public class SmartCar implements SelfCheckCapable {
	private String color;
	private String Model;
	private int weight;
	private int dimensions;
	private int NumberofWheels;
	private Battery powersource;
	private Camera recorder;
	private CPU computer;
	private Lights illumination;
	private Motors motion;
	private Sensor detector;
	private Speaker sound;
	private Wheels bearings;
	
	public SmartCar() {
		
		powersource = new Battery();
		recorder = new Camera();
		computer = new CPU();
		illumination = new Lights();
		motion = new Motors();
		detector = new Sensor();
		sound = new Speaker();
		bearings = new Wheels();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SmartCar mySmartCar = new SmartCar();
		mySmartCar.runSelfCheck();
	}
	@Override
	public boolean selfCheck() {
		// TODO Auto-generated method stub
		return SelfCheckUtils.randomCheck(0.1);
	}
	
	@Override
	public String getComponentName() {
		// TODO Auto-generated method stub
		return "Check completed";
	}

	@Override
	public boolean runSelfCheck() {
		// TODO Auto-generated method stub
		return SelfCheckUtils.basicSelfCheckRunner(this);
	}
}


