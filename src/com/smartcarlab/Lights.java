package com.smartcarlab;

import edu.fiu.sysdesign.SelfCheckCapable;

public abstract class Lights implements SelfCheckCapable {
	private String Color;
	private double Intensity;
	private int NumberofOLED;
	public abstract int illuminate();
	public abstract int Flash();
	public abstract int Strobe();


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
