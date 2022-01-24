package main;

import auto.*;
import motor.*;
import decorator.*;
//import main.Abstractauto;
import merk.Bmw;

public class App {

	public static void main(String[] args) {
		// Auto auto1 = new Auto("Mercedes");
		// auto1.setMotor(new Benzinemotor());
		// auto1.printAuto();

		// Abstractauto a = new Auto("bmw");
		// a = new Stoelverwarming(a);
	
		//a.printAuto();

		Personenauto p = new Suv();
		p.setMotor(new Dieselmotor());
		p.setMerk(new Bmw());
		p.printAuto();
		
	}

}
