package ro.ase.cts.observer;
import java.util.List;
public class Restaurant implements Observabil {
	private List<Observer> observerList;
	private String nume;
	private String adresa;
	
	
	public Restaurant(String nume, String adresa) {
		super();
		this.nume = nume;
		this.adresa = adresa;
	}

	@Override
	public void adaugaObserver(Observer observer) {
		this.observerList.add(observer);
		
	}

	@Override
	public void stergeObserver(Observer observer) {
		// TODO Auto-generated method stub
		this.observerList.remove(observer);
	}

	@Override
	public void trimiteMesaj(String mesaj) {
		for(Observer observer: this.observerList) {
			observer.primesteMesaj("Restaurantul"+this.nume+" "+this.adresa+"trimite mesajul "+mesaj);
		}
	}
	public void realizareOfertaPret() {
		trimiteMesaj("s-a realizat oferta de pret");
	}
	public void introducereMeniu() {
		trimiteMesaj("meniu introdus");
	}
	

}
