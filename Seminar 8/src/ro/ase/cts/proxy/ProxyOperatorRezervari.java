package ro.ase.cts.proxy;

public class ProxyOperatorRezervari implements InterfataOperatoriRezervari {

	private OperatorRezervari operator;
	private int nrMinimPersoane;
	public ProxyOperatorRezervari(OperatorRezervari operator, int nrMinPers) {
		super();
		this.operator = operator;
		this.nrMinimPersoane=nrMinPers;
	}

	@Override
	public void realizeazaRezervare(String numeClient, int nrPersoane) {
		if(nrPersoane>=4) {
			operator.realizeazaRezervare(numeClient, nrPersoane);
		}
		else {
			System.out.println("Va rugam, nu mai veniti");
		}
		
	}
	

}
