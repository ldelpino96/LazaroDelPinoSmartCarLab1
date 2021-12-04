package com.smartcarlab;

import edu.fiu.sysdesign.SelfCheckCapable;

public abstract class Camera implements SelfCheckCapable{
	public int LensQuantity;
	public int LensDepth;
	public double LensAperture;
	public String Gyroscope;
	public abstract int Record();
	public abstract int TrackFace();
	public abstract int IdentifyObject();
	public abstract int TakePicture();
	public abstract int RecordVideo();

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
