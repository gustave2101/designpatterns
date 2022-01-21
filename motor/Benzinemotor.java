package motor;

import motor.brandstof.Benzine;

public class Benzinemotor implements Motor {
	
	public Benzinemotor() {
		
	}
	
	@Override
	public void addBrandstof() {
		System.out.println(Benzine.getType() + " toegevoegd aan de tank.");
	}
	
	public String toString() {
		return "Benzine motor die " + Benzine.getNaam() + " gebruikt.";
	}

}
