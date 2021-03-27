package ro.ase.cts.factorymethod.main;
import ro.ase.cts.factorymethod.Factory;
import ro.ase.cts.factorymethod.FactoryFundas;
import ro.ase.cts.factorymethod.FactoryPortar;
import ro.ase.cts.factorymethod.Jucator;
public class Main {

	private static void afiseazaJucator(Factory factory, String numeJucator) {
		Jucator jucator=factory.creeazaJucator(numeJucator);
		System.out.println(jucator.toString());
	}
	
	
	public static void main(String[] args) {
		afiseazaJucator(new FactoryPortar(), "Tatarusanu");
		afiseazaJucator(new FactoryFundas(),"Ramos");
	}
}
