package com.smartcarlab;

import edu.fiu.sysdesign.SelfCheckCapable;

public abstract class Sensor implements SelfCheckCapable  {
	private int Range;
	private String Location;
	private int NumberofSensors;
	public abstract int DetectObstacle();
	public abstract int DetectCorner();
	public abstract int TrackSpeed();
	public abstract int GeolocateSelf();
	public abstract int DetectMovement();

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
