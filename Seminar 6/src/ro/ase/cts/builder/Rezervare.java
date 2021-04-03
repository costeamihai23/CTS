package ro.ase.cts.builder;

public class Rezervare {
	
	private int CodRezervare;
	private boolean areMancareInclusa;
	private boolean areBauturaInclusa;
	private boolean areScaunErgonomic;
	private boolean areMuzicaAmbientala;
	private String genMuzica;
	public Rezervare(int codRezervare, boolean areMancareInclusa, boolean areBauturaInclusa, boolean areScaunErgonomic,
			boolean areMuzicaAmbientala, String genMuzica) {
		super();
		CodRezervare = codRezervare;
		this.areMancareInclusa = areMancareInclusa;
		this.areBauturaInclusa = areBauturaInclusa;
		this.areScaunErgonomic = areScaunErgonomic;
		this.areMuzicaAmbientala = areMuzicaAmbientala;
		this.genMuzica = genMuzica;
	}
	@Override
	public String toString() {
		return "Rezervare [CodRezervare=" + CodRezervare + ", areMancareInclusa=" + areMancareInclusa
				+ ", areBauturaInclusa=" + areBauturaInclusa + ", areScaunErgonomic=" + areScaunErgonomic
				+ ", areMuzicaAmbientala=" + areMuzicaAmbientala + ", genMuzica=" + genMuzica + "]";
	}
	public void setCodRezervare(int codRezervare) {
		CodRezervare = codRezervare;
	}
	public void setAreMancareInclusa(boolean areMancareInclusa) {
		this.areMancareInclusa = areMancareInclusa;
	}
	public void setAreBauturaInclusa(boolean areBauturaInclusa) {
		this.areBauturaInclusa = areBauturaInclusa;
	}
	public void setAreScaunErgonomic(boolean areScaunErgonomic) {
		this.areScaunErgonomic = areScaunErgonomic;
	}
	public void setAreMuzicaAmbientala(boolean areMuzicaAmbientala) {
		this.areMuzicaAmbientala = areMuzicaAmbientala;
	}
	public void setGenMuzica(String genMuzica) {
		this.genMuzica = genMuzica;
	}
	
	
	
}
