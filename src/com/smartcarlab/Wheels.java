package com.smartcarlab;

import edu.fiu.sysdesign.SelfCheckCapable;

public abstract class Wheels implements SelfCheckCapable {
	private int Quantity;
	private String Location;
	public abstract int Rotate();
	public abstract int Drift();

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
