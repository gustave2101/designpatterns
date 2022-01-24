import auto.*;
import motor.*;
import decorator.*;
//import main.Abstractauto;
import fabriek.Verkoper;

public class App {

	public static void main(String[] args) {
		Auto auto1 = new Auto("Mercedes");
		auto1.setMotor(new Benzinemotor());

		Abstractauto a = new Auto("bmw");
		a = new Stoelverwarming(a);
		a.printAuto();
		
		Verkoper verkoper1 = new Verkoper("Klaas");
		verkoper1.addAuto(auto1);
		verkoper1.print();
	}

}
