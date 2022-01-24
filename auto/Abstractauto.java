
package auto;

import motor.Motor;
import merk.*;

public class Abstractauto {
    
    private Motor motor;
	//private Merk merk; 
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

	// public void setMerk(Merk m){

	// 	this.merk = m;
	// }
}
