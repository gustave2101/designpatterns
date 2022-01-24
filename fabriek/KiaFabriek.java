package fabriek;

import auto.Abstractauto;
import auto.Auto;
import auto.types.Cabrio;
import auto.types.F1;
import decorator.Spoiler;
import decorator.Stoelverwarming;
import merk.Kia;
import motor.Elektromotor;
import motor.Hybridemotor;

public class KiaFabriek implements AbstractFactory{

    @Override
    public Auto createCabrio(boolean stoelverwarming) {
        Abstractauto tempAuto = new Cabrio();
        if(stoelverwarming){
            tempAuto = new Stoelverwarming(tempAuto);
        }
        tempAuto.setMotor(new Elektromotor());;
        tempAuto.setMerk(new Kia());
        return (Auto) tempAuto;
    }

    @Override
    public Auto createF1(boolean spoiler) {
        Abstractauto tempAuto = new F1();
        if(spoiler){
            tempAuto = new Spoiler(tempAuto);
        }
        tempAuto.setMotor(new Hybridemotor());;
        tempAuto.setMerk(new Kia());
        return (Auto) tempAuto;
    }
    
}
