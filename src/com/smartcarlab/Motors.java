package com.smartcarlab;

import edu.fiu.sysdesign.SelfCheckCapable;

public abstract class Motors implements SelfCheckCapable {
	private String type;
	private String Location;
	public abstract int Brake();
	public abstract int SpinForward();
	public abstract int SpinBackward();
	public abstract int SpinLeft();
	public abstract int SpinRight();
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
