package ro.ase.cts.chain.Main;

import ro.ase.cts.chain.Cont;
import ro.ase.cts.chain.ContCredit;
import ro.ase.cts.chain.ContCurent;
import ro.ase.cts.chain.ContEconomii;

public class Main {

	
	public static void main(String[] args) {
		Cont contEconomii=new ContEconomii(1000,"RO83231");
		Cont contCredit=new ContCredit(2000,"RO8323231");
		Cont contCurent=new ContCurent(800,"RO8323213121");
		
		
		contCurent.setSuccesor(contEconomii);
		contEconomii.setSuccesor(contCredit);
		
		contCurent.plateste(300);
		contCurent.plateste(100);
		contCurent.plateste(250);
		contCurent.plateste(300);
		contCurent.plateste(300);
		
	}
}
