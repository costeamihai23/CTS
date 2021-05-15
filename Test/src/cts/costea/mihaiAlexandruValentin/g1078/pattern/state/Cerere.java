package cts.costea.mihaiAlexandruValentin.g1078.pattern.state;

public class Cerere {
	public IStare stare;
	private int codCerere;
	private int nrZile;
	public Cerere(int codCerere) {
		super();
		this.stare = stare;
		this.codCerere = codCerere;
		this.nrZile = nrZile;
	}
	

		
	
	public void confirmareCerere() {
		
		if(this.stare instanceof StareVerificare) {
			System.out.println("Cererea cu codul "+codCerere+"a fost primita");
			this.stare=new StareConfirmare();
		}
		else {
			System.out.println("Cererea nu a fost primita");
		}
	}
	
	public void verificareCerere() {
		if(nrZile>=10) {
			System.out.println("Cererea a fost respinsa");
			this.stare=new StareRespingere();
		}else {
			System.out.println("Cererea a fost trimisa spre avizare");
			this.stare=new StareAvizareDecanat();
		}
	}
	
	public void avizareCerere() {
		if (this.stare instanceof StareAvizareDecanat) {
			System.out.println("Cererea a fost avizata");
			this.stare=new StareAvizareDecanat();
		}
	}
		
	
}