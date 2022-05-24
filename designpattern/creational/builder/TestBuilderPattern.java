package javaprograms.designpattern.creational.builder;

public class TestBuilderPattern {

	public static void main(String[] args) {
		Computer computer = new Computer.ComputerBuilder("500 GB", "2 GB").setBluetoothEnabled(true)
				.setGraphicsCardEnabled(true).build();
		System.out.println("HDD:-> "+ computer.getHDD());
		System.out.println("RAM:-> "+ computer.getRAM());

		System.out.println("isBluetoothEnabled:-> "+ computer.isBluetoothEnabled());
		System.out.println("isGraphicsCardEnabled:-> "+ computer.isGraphicsCardEnabled());
	}

}
