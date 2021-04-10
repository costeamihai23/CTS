package ro.ase.cts.facade;

public class Main {
	
	public static void main(String[] args) {
		Persoana persoana=new Persoana("Doamna","199010256711");
		if(persoana.getVarsta()>=18) {
			if(!Politie.esteUrmarit(persoana)) {
				BirouDeCredite birou=new BirouDeCredite();
				if(!birou.areCredite(persoana)) {
					System.out.println("S-a creat contul");
				}
			}
		}
		Persoana persoana2 = new Persoana("Andrei", "1990714845623");
		if (VerificatorPersoane.verifica(persoana2)) {
			System.out.println("Cont creat pentru " + persoana2.getNume());
		}
		else {
			System.out.println("Nu se poate crea contul pentru " + persoana2.getNume());
		}
		
	}
}
