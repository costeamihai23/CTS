package ro.ase.cts.state.main;
import ro.ase.cts.state.Masa;
public class Main {
	public static void main(String[] args) {
		Masa m1=new Masa(10);
		m1.elibereazaMasa();
		m1.rezervaMasa();
		m1.ridicaRezervare();
		m1.elibereazaMasa();
	}
}
