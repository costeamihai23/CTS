package ro.ase.cts.program;

import ro.ase.cts.command.ContBancar;
import ro.ase.cts.command.ManagerComenzi;
import ro.ase.cts.command.ContBancar;
import ro.ase.cts.command.ComandaDepunere;
import ro.ase.cts.command.ComandaConstituire;
import ro.ase.cts.command.ComandaRetragere;


public class Main {
	
	public static void main(String[] args) throws Exception {
		try {
		ManagerComenzi manager=new ManagerComenzi();
		ContBancar cont=new ContBancar("RO90821",0);
		
		manager.invoca(new ComandaConstituire(cont, 1000)); 
		
		manager.executaComanda();
		manager.invoca(new ComandaRetragere(cont, 800));
		manager.executaComenzi();
		;
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
