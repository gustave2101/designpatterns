package main;

import auto.*;
import motor.*;
import decorator.*;
//import main.Abstractauto;

public class App {

	public static void main(String[] args) {
		Auto auto1 = new Auto("Mercedes");
		auto1.setMotor(new Benzinemotor());
		auto1.printAuto();

		Abstractauto a = new Auto("bmw");
		a = new Stoelverwarming(a);
	
		a.printAuto();

		Personenauto p = new Suv("bla");
		p.setMotor(new Dieselmotor());
		p.printAuto();
		p.setAantal_deuren(8);
		p.printPersonenAuto();
		
	}

}
