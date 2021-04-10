package ro.ase.cts.decorator;

public class Decorator extends DecoratorAbstract {

	public Decorator(Card card) {
		super(card);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void platesteContactLess(int suma) {
		if (super.getCard().getSold() > suma) {
			System.out.println("A facut plata prin metoda contactless: " + suma);
			super.getCard().setSold(super.getCard().getSold() - suma);
		}

	}

}
