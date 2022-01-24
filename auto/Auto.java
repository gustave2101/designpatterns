package auto;

import motor.Motor;


public class Auto extends Abstractauto {

	public Auto(String merknaam){

		super(merknaam);
	}
	
	public void setMotor(Motor motor) {
		super.setMotor(motor);
	}
	
	public void print() {
		System.out.println("Merknaam: " + merknaam + " | " + "Motor: " + super.motor.toString() + " | ");
	}
}
