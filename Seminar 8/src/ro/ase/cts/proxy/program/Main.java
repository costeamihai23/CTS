package ro.ase.cts.proxy.program;
import ro.ase.cts.proxy.OperatorRezervari;
import ro.ase.cts.proxy.ProxyOperatorRezervari;
public class Main {
	
	
	public static void main(String[] args) {
		OperatorRezervari operator=new OperatorRezervari();
		operator.realizeazaRezervare("Dorel", 3);
		
		ProxyOperatorRezervari proxy=new ProxyOperatorRezervari(operator, 4);
		proxy.realizeazaRezervare("Ionel", 3);
		proxy.realizeazaRezervare("Giani", 21);
	}
}
