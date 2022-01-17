package main.motor;

import main.motor.brandstof.Elektriciteit;

public class Elektromotor implements Motor {

	@Override
	public void addBrandstof() {
		// TODO Auto-generated method stub
		
	}
	
	public String toString() {
		return "Elektro motor die " + Elektriciteit.getNaam() + " gebruikt.";
	}


}
