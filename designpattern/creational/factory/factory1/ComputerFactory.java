package com.rahul.designpattern.factory.client;

public class ComputerFactory {

	private ComputerFactory() {

	}

	public static Computer getComputer(ComputerEnum computerType, String ram, String hdd, String cpu,
			boolean isGraphicEnabled, boolean isBluetoothEnabled) {
		switch (computerType) {
		case PC: {
			return new PC(ram, hdd, cpu, isGraphicEnabled, isBluetoothEnabled);
		}
		case SERVER: {
			return new Server(ram, hdd, cpu, isGraphicEnabled, isBluetoothEnabled);
		}
		case LAPTOP: {
			return new Laptop(ram, hdd, cpu, isGraphicEnabled, isBluetoothEnabled);
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + computerType);
		}
	}
}
