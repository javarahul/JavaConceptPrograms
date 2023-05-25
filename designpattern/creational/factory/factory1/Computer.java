package com.rahul.designpattern.factory.client;

public interface Computer {
	public abstract String ram();
	public abstract String hdd();
	public abstract String cpu();
	
	public boolean isGraphicEnabled();
	public boolean isBluetoothEnabled();
	
}
