package ro.ase.cts.facade;

public class VerificatorPersoane {
	public static boolean verifica(Persoana persoana) {
		if (persoana.getVarsta() >= 18) {
			if (!Politie.esteUrmarit(persoana)) {
				BirouDeCredite birouCredite = new BirouDeCredite();
				if (!birouCredite.areCredite(persoana)) {
					return true;
				}
			}
		}
		return false;
	}}

