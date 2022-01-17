package main.motor;

import main.motor.brandstof.Benzine;
import main.motor.brandstof.Elektriciteit;

public class Hybridemotor implements Motor {

	@Override
	public void addBrandstof() {
		// TODO Auto-generated method stub
		
	}
	
	public String toString() {
		return "Hybride motor die " + Benzine.getNaam() + " en " + Elektriciteit.getNaam() + " gebruikt.";
	}


}
