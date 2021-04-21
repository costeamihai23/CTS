package ro.ase.cts.state;

public class Masa {
	private int cod;
	private State stare;
	
	public Masa(int cod) {
		super();
		this.cod = cod;
		this.stare=new StareLibera();
	}
	
	public void rezervaMasa() {
		if(this.stare instanceof StareLibera) {
			System.out.println("Masa cu codul "+cod+" a fost rezervata");
			this.stare=new StareRezervata();
		}
		else {
			System.out.println("Masa nu poate fi rezervata");
		}
	}
	public void ridicaRezervare() {
		
		if(this.stare instanceof StareRezervata) {
			System.out.println("Masa cu codul "+cod+" este ocupata");
			this.stare=new StareOcupata();
			
		}
		else {
			System.out.println("Nu aveti rezervare facuta");
		}
	}
	public void elibereazaMasa() {
		if(this.stare instanceof StareLibera) {
			System.out.println("Masa cu codul "+cod+" este eliberata");
			this.stare=new StareLibera();
		}
		else {
			System.out.println("Masa este deja libera");
			
		}
	}
	
	
}
