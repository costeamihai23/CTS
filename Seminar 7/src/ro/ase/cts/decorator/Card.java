package ro.ase.cts.decorator;

public class Card implements CardAbstract {
	private String titular;
	private int sold;
	
	
	public Card(String titular, int sold) {
		super();
		this.titular = titular;
		this.sold = sold;
	}
	

	public int getSold() {
		return sold;
	}


	public void setSold(int sold) {
		this.sold = sold;
	}


	public String getTitular() {
		return titular;
	}


	@Override
	public void realizeazaPlataOnline(int suma) {
		if(suma>0) {
			sold-=suma;
		System.out.println("S-a realizat plata online:"+suma);
		}
	}

	@Override
	public void realizeazaPlataNormala(int suma) {
		if(suma>0) {
			sold-=suma;
		System.out.println("S-a realizat plata online:"+suma);
		
	}
	
	}}
