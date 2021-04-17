package ro.ase.cts.main;

import ro.ase.cts.strategy.Client;
import ro.ase.cts.strategy.PlataCard;
import ro.ase.cts.strategy.PlataCash;

public class Main {
	public static void main(String[] args) {
		Client client=new Client("Georgel",new PlataCash());
		client.platesteNota(200);
		client.setModPlata(new PlataCard());
		client.platesteNota(25);
	}
}
