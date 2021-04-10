package ro.ase.cts.decorator;

public abstract class DecoratorAbstract implements CardAbstract {
	
	private Card card;
	
	public DecoratorAbstract(Card card) {
		super();
		this.card = card;
	}

	@Override
	public void realizeazaPlataOnline(int suma) {
		card.realizeazaPlataOnline(suma);
	}

	@Override
	public void realizeazaPlataNormala(int suma) {
		card.realizeazaPlataNormala(suma);
	}
	public abstract void platesteContactLess(int suma);

	public Card getCard() {
		return card;
	}

}
