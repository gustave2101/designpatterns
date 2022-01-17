package main;

import main.motor.Motor;

public class Auto {

	private Motor motor;
	public String merknaam = "";
	
	public Auto(String merknaam) {
		this.merknaam = merknaam;
	}
	
	public void setMotor(Motor motor) {
		this.motor = motor;
	}
	
	public void printAuto() {
		System.out.println("Merknaam: " + merknaam + " | " + "Motor: " + motor.toString() + " | ");
	}
}
