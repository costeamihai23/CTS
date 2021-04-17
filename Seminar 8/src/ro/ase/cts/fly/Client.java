package ro.ase.cts.fly;

public class Client implements AbstractFly {
	private String nume;
	private String nrTelefon;
	private String email;
	
	
	
	public Client(String nume, String nrTelefon, String email) {
		super();
		this.nume = nume;
		this.nrTelefon = nrTelefon;
		this.email = email;
	}




	@Override
	public void printeazaRezervare(Rezervare rezervare) {
		System.out.println("Clientul "+this.toString()+" a realizat o rezervare "+rezervare.toString());
		
	}
}
