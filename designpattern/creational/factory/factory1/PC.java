package com.rahul.designpattern.factory.client;

public class PC implements Computer {

	private String ram;
	private String hdd;
	private String cpu;

	private boolean isGraphicEnabled;
	private boolean isBluetoothEnabled;

	@Override
	public String ram() {
		return this.ram;
	}

	@Override
	public String hdd() {
		return this.hdd;
	}

	@Override
	public String cpu() {
		return this.cpu;
	}

	@Override
	public boolean isGraphicEnabled() {
		return this.isGraphicEnabled;
	}

	@Override
	public boolean isBluetoothEnabled() {
		return this.isBluetoothEnabled;
	}

	public PC(String ram, String hdd, String cpu, boolean isGraphicEnabled, boolean isBluetoothEnabled) {
		super();
		this.ram = ram;
		this.hdd = hdd;
		this.cpu = cpu;
		this.isGraphicEnabled = isGraphicEnabled;
		this.isBluetoothEnabled = isBluetoothEnabled;
	}

	@Override
	public String toString() {
		return "Laptop [ram=" + ram + ", hdd=" + hdd + ", cpu=" + cpu + ", isGraphicEnabled=" + isGraphicEnabled
				+ ", isBluetoothEnabled=" + isBluetoothEnabled + "]";
	}
}
