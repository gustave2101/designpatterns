package decorator;

import auto.*;

public class Decorator extends Abstractauto{
    
    Abstractauto auto;
    String naam; 

    Decorator(Abstractauto a){

        super(a.merknaam);
    }

    public void printAuto(){

        System.out.print("auto heeft decoratie" + naam);
    }



}


