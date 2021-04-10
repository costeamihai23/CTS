package ro.ase.cts.program;
import ro.ase.cts.decorator.Card;
import ro.ase.cts.decorator.Decorator;
import ro.ase.cts.decorator.DecoratorContaclessTelefon;
public class Main {
	public static void main(String[] args) {
		Card card1=new Card("Mirel",2500);
		card1.realizeazaPlataNormala(300);
		card1.realizeazaPlataOnline(100);
		
		Decorator cardNou=new Decorator(card1);
		cardNou.platesteContactLess(800);
		cardNou.realizeazaPlataNormala(50);
		cardNou.realizeazaPlataOnline(400);
		System.out.println("Soldul este: "+card1.getSold());
		
		DecoratorContaclessTelefon decoratorContactlessTelefon=new DecoratorContaclessTelefon(card1);
		decoratorContactlessTelefon.platesteContactLess(300);
	}

}
