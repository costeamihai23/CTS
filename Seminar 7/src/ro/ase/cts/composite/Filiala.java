package ro.ase.cts.composite;

public class Filiala implements Sediu {
	private String numeFiliala;

	public Filiala(String numeFiliala) {
		super();
		this.numeFiliala = numeFiliala;
	}

	@Override
	public void descriere() {
	 System.out.println("Filiala "+numeFiliala);
		
	}

	@Override
	public void adaugaSediu(Sediu sediu) throws Exception {
		// TODO Auto-generated method stub
		throw new Exception();
	}

	@Override
	public void stergeSediu(Sediu sediu) throws Exception {
		// TODO Auto-generated method stub
		throw new Exception();
	}

	@Override
	public Sediu getSediu(int pozitie) throws Exception {
		throw new Exception();
		// TODO Auto-generated method stub
		
	}
	

}
