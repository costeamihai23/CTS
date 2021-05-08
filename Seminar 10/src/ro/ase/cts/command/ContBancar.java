package ro.ase.cts.command;

public class ContBancar {
	private String iban;
	private float sold;
	public ContBancar(String iban, float sold) {
		super();
		this.iban = iban;
		this.sold = sold;
	}
	
	
	public void constituire(float sumaInitiala) {
		this.sold=sumaInitiala;
		System.out.println("S-a constituit contul cu suma de "+sold);
	}
	public void retragere(float suma) {
		if(sold>=suma) {
			sold-=suma;
			System.out.println("S-au retras "+sold);
		}else {
		
		System.out.println("Nu mai ai bani");}
	
	}
	public void depunere(float suma) {
		this.sold=suma;
		System.out.println("A fost depusa suma de "+sold);
	}
}

