package ro.ase.cts.builder;

public class RezervareBuilderV2 implements RezervareBuilderAbstract {
	
	private int CodRezervare;
	private boolean areMancareInclusa;
	private boolean areBauturaInclusa;
	private boolean areScaunErgonomic;
	private boolean areMuzicaAmbientala;
	private String genMuzica;
	
	public RezervareBuilderV2() {
		this.CodRezervare=0;
		this.areBauturaInclusa=false;
		this.areMuzicaAmbientala=false;
		this.areMancareInclusa=false;
		this.areMuzicaAmbientala=false;
		this.genMuzica="";
	}
	
	
	public RezervareBuilderV2 setCodRezervare(int codRezervare) {
	this.setCodRezervare(codRezervare);
		return this;
	}
	public RezervareBuilderV2 setAreMancareInclusa(boolean areMancareInclusa) {
		this.setAreMancareInclusa(areMancareInclusa);
		return this;
	}
	public RezervareBuilderV2 setAreBauturaInclusa(boolean areBauturaInclusa) {
		this.setAreBauturaInclusa(areBauturaInclusa);
		return this;
	}
	public RezervareBuilderV2 setAreScaunErgonomic(boolean areScaunErgonomic) {
		this.setAreScaunErgonomic(areScaunErgonomic);
		return this;
	}
	public RezervareBuilderV2 setAreMuzicaAmbientala(boolean areMuzicaAmbientala) {
		this.setAreMuzicaAmbientala(areMuzicaAmbientala);
		return this;
	}
	public RezervareBuilderV2 setGenMuzica(String genMuzica) {
		this.setGenMuzica(genMuzica);
		return this;
	}


	@Override
	public Rezervare build() {
		// TODO Auto-generated method stub
		return new Rezervare(CodRezervare, areMancareInclusa, areBauturaInclusa, areScaunErgonomic, areMuzicaAmbientala, genMuzica);
	}
	

}
