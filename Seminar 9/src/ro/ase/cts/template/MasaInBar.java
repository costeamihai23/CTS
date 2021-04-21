package ro.ase.cts.template;

public class MasaInBar extends OcupareMasa{

	public MasaInBar(int codMasa) {
		super(codMasa);
		// TODO Auto-generated constructor stub
	}
	public void aseazaTacamuri() {
		System.out.println("Pe masa "+this.codMasa+" au fost asezate paharele");
	}
}
