package com.smartcarlab;

import edu.fiu.sysdesign.SelfCheckCapable;

public abstract class CPU implements SelfCheckCapable {
	private float MemoryCapacity;
	private String Bluetooth;
	private String WifiReceptor;
	private int StorageCapacity;
	private String OS;
	public abstract int ConnectServer();
	public abstract int CheckComponents();
	public abstract int RunUpdate();
	public abstract int SaveData();
	public abstract int Move();
	public abstract int stop();
	public abstract int Accelerate();
	public abstract int AdjustLight();
	public abstract int AdjustVolume();
	public abstract int ShareData();
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
