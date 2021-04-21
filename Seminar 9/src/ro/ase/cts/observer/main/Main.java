package ro.ase.cts.observer.main;
import ro.ase.cts.observer.Client;
import ro.ase.cts.observer.Restaurant;
public class Main {
	
	public static void main(String[] args) {
		Restaurant r1=new Restaurant("restaurant","Craiova");
		Client c1=new Client("Ion");
		Client c2=new Client("Dorel");
		Client c3=new Client("Marcel");
		r1.adaugaObserver(c1);
		r1.adaugaObserver(c2);
		r1.realizareOfertaPret();
		r1.stergeObserver(c2);
		r1.adaugaObserver(c3);
		r1.introducereMeniu();
		
	}
}
