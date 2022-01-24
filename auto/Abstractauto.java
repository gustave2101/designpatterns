
package auto;

import merk.Merk;
import motor.Motor;

public class Abstractauto {
    
    protected Motor motor;
	protected Merk merk;

	public void setMotor(Motor motor) {
		this.motor = motor;
	}
	
	public void print() {
		System.out.println("Merknaam: " + merk.toString() + " | " + "Motor: " + motor.toString() + " | ");
	}

	public void setMerk(Merk m){
		this.merk = m;
	}
}
