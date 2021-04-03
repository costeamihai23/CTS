package ro.ase.cts.adapter.Main;
import ro.ase.cts.adapter.AdapterBiletObiecte;
import ro.ase.cts.adapter.Bilet;
import ro.ase.cts.adapter.BiletOnline;
import ro.ase.cts.adapter.BiletAdapter;
public class Main {
	public static void rezervaSiVindeBiletLaCasa(Bilet bilet) {
		bilet.rezerva();
		bilet.vinde();
	}
	public static void rezervaSiVindeBiletePePlatforma(BiletOnline biletOnline) {
		biletOnline.rezervaBiletOnline();
		biletOnline.vindeBiletOnline();
	}
	public static void main(String[] args) {
		Bilet bilet=new Bilet(20);
		rezervaSiVindeBiletLaCasa(bilet);
		
		BiletAdapter biletAdapter=new BiletAdapter(35);
		rezervaSiVindeBiletePePlatforma(biletAdapter);
		
		BiletOnline biletOnline= new AdapterBiletObiecte(bilet);
		rezervaSiVindeBiletePePlatforma(biletOnline);
	}

}
