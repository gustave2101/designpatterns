
package auto;

import motor.Motor;

public class Abstractauto {
    
    protected Motor motor;
	public String merknaam;

    public Abstractauto(String merknaam){

        this.merknaam = merknaam;
    }

	public void setMotor(Motor motor) {
		this.motor = motor;
	}
	
	public void printAuto() {
		System.out.println("Merknaam: " + merknaam + " | " + "Motor: " + motor.toString() + " | ");
	}
}
