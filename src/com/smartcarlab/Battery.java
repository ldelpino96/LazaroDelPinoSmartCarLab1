package com.smartcarlab;

import edu.fiu.sysdesign.SelfCheckCapable;

public abstract class Battery implements SelfCheckCapable {
	private float capacity;
	private int Charge;
	private int size;
	private String material;
	public abstract int Recharge();
	public abstract int PowerOn();
	public abstract int PowerOff();

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
