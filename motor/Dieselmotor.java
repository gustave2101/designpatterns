package main.motor;

import main.motor.brandstof.Diesel;

public class Dieselmotor implements Motor {

	@Override
	public void addBrandstof() {
		// TODO Auto-generated method stub
		
	}
	
	public String toString() {
		return "Diesel motor die " + Diesel.getNaam() + " gebruikt.";
	}


}
