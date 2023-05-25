package com.rahul.designpattern.factory.client;

public class ClientTest {

	public static void main(String[] args) {
		Computer PC = ComputerFactory.getComputer(ComputerEnum.PC, "16 GB", "120 GB", "2.23 HGZ", true, true);
		System.out.println("PC Config: " + PC);

		Computer Server = ComputerFactory.getComputer(ComputerEnum.SERVER, "16 GB", "120 GB", "2.23 HGZ", true, true);
		System.out.println("Sever Config: " + Server);

		Computer Laptop = ComputerFactory.getComputer(ComputerEnum.LAPTOP, "16 GB", "120 GB", "2.23 HGZ", true, true);
		System.out.println("Laptop Config: " + Laptop);
	}

}
