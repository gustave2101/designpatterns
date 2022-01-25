import auto.*;
import auto.types.Cabrio;
import auto.types.Personenauto;
import decorator.*;
import fabriek.AbstractFactory;
import fabriek.FerrariFabriek;
import fabriek.KiaFabriek;
import fabriek.Verkoper;
import merk.Kia;
import motor.Benzinemotor;

public class App {

	public static void main(String[] args) {
		Abstractauto a = new Auto();
		a = new Stoelverwarming(a);
		a.setMerk(new Kia());
		a.setMotor(new Benzinemotor());
		a.toString();
		a.print();

		AbstractFactory ferrarifabriek = new FerrariFabriek();
		AbstractFactory kiafabriek = new KiaFabriek();
		
		Verkoper verkoper1 = new Verkoper("Klaas");
		verkoper1.addAuto(ferrarifabriek.createCabrio(false));
		verkoper1.print();
		verkoper1.addAuto(kiafabriek.createF1(false));
		verkoper1.print();
	}

}
