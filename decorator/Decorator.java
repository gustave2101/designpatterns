package decorator;

import auto.*;

public class Decorator extends Abstractauto{
    
    Abstractauto auto;
    String naam; 

    Decorator(Abstractauto a){

        super();
    }

    public void printAuto(){

        System.out.print("auto heeft decoratie" + naam);
    }



}


