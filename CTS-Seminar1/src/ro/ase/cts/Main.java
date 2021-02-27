package ro.ase.cts;
import clase.Animal;
import clase.Zebra;
import clase.Zoo;
import clase.Zookeeper;
public class Main {
	public static void main(String[] args) {
		Zoo zoo=new Zoo();
		Animal a1=new Zebra("Monica");
		Animal a2=new Zebra("Costel");
		//Animal g1=new Girafa("Mariana");
		//Animal g2=new Girafa("Florica");
		zoo.AdaugareAnimal(a1);
		zoo.AdaugareAnimal(a2);
		
		zoo.hranireAnimale();
		zoo.mutareAnimale();
	}

}
