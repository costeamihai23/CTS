package ro.ase.cts.builder;

public class Main {

	public static void main(String args[]) {
		Rezervare r1=new Rezervare(12345, false, false, false, true, "Rock");
		Rezervare r2=new RezervareBuilder().setCodRezervare(15).setAreScaunErgonomic(true).build();
		Rezervare r3=new RezervareBuilder().setCodRezervare(123).setAreBauturaInclusa(true).setAreMuzicaAmbientala(true).build();
		
		System.out.println(r1);
		System.out.println(r2);
		System.out.println(r3);
		
		RezervareBuilderV2 b2=new RezervareBuilderV2();
		b2.setAreMancareInclusa(true);
		RezervareBuilderV2 b3=new RezervareBuilderV2().setCodRezervare(4);
		
		System.out.println(b2);
		System.out.println(b3);
		
	}
}
