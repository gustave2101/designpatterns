package auto.types;

import auto.Auto;

public abstract class Personenauto extends Auto{

    protected int kilometerstand = 0;

    public void setKilometerstand(int km){

        this.kilometerstand = km;
    }

    public void printPersonenauto(){

        System.out.println("auto aantal km: " + this.kilometerstand);
    }
    
}
