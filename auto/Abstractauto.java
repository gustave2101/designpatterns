
package auto;

import motor.Motor;
import merk.Merk;

public class Abstractauto {
    
    private Motor motor;
	private Merk merk; 

	public void setMotor(Motor motor) {
		this.motor = motor;
	}
	
	public void printAuto() {
		System.out.println("Merknaam: " + merk.toString() + " | " + "Motor: " + motor.toString() + " | ");
	}

	public void setMerk(Merk m){

		this.merk = m;
	}
}
