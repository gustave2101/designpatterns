import auto.*;
import decorator.*;
import fabriek.AbstractFactory;
import fabriek.FerrariFabriek;
import fabriek.KiaFabriek;
import fabriek.Verkoper;

public class App {

	public static void main(String[] args) {
		Abstractauto a = new Auto();
		a = new Stoelverwarming(a);

		AbstractFactory ferrarifabriek = new FerrariFabriek();
		AbstractFactory kiafabriek = new KiaFabriek();
		
		Verkoper verkoper1 = new Verkoper("Klaas");
		verkoper1.addAuto(ferrarifabriek.createCabrio(false));
		verkoper1.print();
		verkoper1.addAuto(kiafabriek.createF1(false));
		verkoper1.print();
	}

}
