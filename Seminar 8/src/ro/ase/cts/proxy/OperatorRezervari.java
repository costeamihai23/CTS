package ro.ase.cts.proxy;

public class OperatorRezervari implements InterfataOperatoriRezervari {

	@Override
	public void realizeazaRezervare(String numeClient, int nrPersoane) {
		System.out.println("A fost realizata rezervarea pentru "+nrPersoane+" pe numele"+numeClient);
		
	}

}
