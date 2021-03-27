package ro.ase.cts.factory.main;

import ro.ase.cts.factory.Factory;
import ro.ase.cts.factory.TipJucator;
import ro.ase.cts.factory.Jucator;

public class Main {
	
	public static void main(String[] args) {
		Factory factory=new Factory();
		Jucator portar=factory.getJucator(TipJucator.Portar, "Dorel");
		Jucator fundas=factory.getJucator(TipJucator.Fundas, "Aurel");
		
		System.out.println(portar.toString());
		System.out.println(fundas.toString());
	}
}
