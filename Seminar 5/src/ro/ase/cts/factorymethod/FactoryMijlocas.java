package ro.ase.cts.factorymethod;

public class FactoryMijlocas implements Factory {

	@Override
	public Jucator creeazaJucator(String numeJucator) {
		// TODO Auto-generated method stub
		return new Mijlocas(numeJucator);
	}

}
