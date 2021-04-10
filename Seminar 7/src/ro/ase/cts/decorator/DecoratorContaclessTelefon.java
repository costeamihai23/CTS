package ro.ase.cts.decorator;

public class DecoratorContaclessTelefon extends DecoratorAbstract {

	public DecoratorContaclessTelefon(Card card) {
		super(card);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void platesteContactLess(int suma) {
		if (super.getCard().getSold() > suma) {
			System.out.println("A facut plata prin metoda contactless cu telefonul: " + suma);
			super.getCard().setSold(super.getCard().getSold() - suma);
		}
		
	}
	

}
