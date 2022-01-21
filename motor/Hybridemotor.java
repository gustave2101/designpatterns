package motor;

import motor.brandstof.Benzine;
import motor.brandstof.Elektriciteit;

public class Hybridemotor implements Motor {

	@Override
	public void addBrandstof() {
		// TODO Auto-generated method stub
		
	}
	
	public String toString() {
		return "Hybride motor die " + Benzine.getNaam() + " en " + Elektriciteit.getNaam() + " gebruikt.";
	}


}
