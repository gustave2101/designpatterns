package main;

import main.motor.Benzinemotor;

public class App {

	public static void main(String[] args) {
		Auto auto1 = new Auto("Mercedes");
		auto1.setMotor(new Benzinemotor());
		auto1.printAuto();
	}

}
