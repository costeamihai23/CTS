package ro.ase.cts.main;
import ro.ase.cts.memento.ManagerMemento;
import ro.ase.cts.memento.MeciJucat;
import ro.ase.cts.memento.Memento;
public class Main {
	public static void main(String[] args) {
		MeciJucat meci1=new MeciJucat("Real Madrid","Barcelona",100,150,200,3000);
		Memento memento=meci1.creareMemento();
		ManagerMemento manager=new ManagerMemento();
		manager.adaugaMemento(memento);
		
		meci1.setNumarSpectatori(80000);
		meci1.setNumarBileteVandute(90000);
		meci1.setNumeEchipaGazda("Dinamo");
		meci1.setNumeEchipaOaspeti("Steaua");
		manager.adaugaMemento(meci1.creareMemento());
		System.out.println(meci1.toString());
		
	}
}
