package ro.ase.cts.fly.main;
import ro.ase.cts.fly.AbstractFly;
import ro.ase.cts.fly.Client;
import ro.ase.cts.fly.FlyFactory;
import ro.ase.cts.fly.Rezervare;

public class MainFly {
	public static void main(String[] args) {
		Rezervare r1=new Rezervare(1,4,"12:00");
		Rezervare r2=new Rezervare(2,6,"16:00");
		Rezervare r3=new Rezervare(3,4,"20:00");
		FlyFactory flyFactory=new FlyFactory();
		Client client1=flyFactory.getClient("0721031232");
		client1.printeazaRezervare(r1);
		flyFactory.getClient("0721031232").printeazaRezervare(r1);
		flyFactory.getClient("0733333333").printeazaRezervare(r1);
		
		
		
		
	}
}
