package ro.ase.cts.command;

public class ComandaRetragere implements ICommand {
	private ContBancar cont;

	public ComandaRetragere(ContBancar cont, int i) {
		super();
		this.cont = cont;
	}
	private float suma;

	@Override
	public void executa() {
		// TODO Auto-generated method stub
		cont.retragere(suma);
	}
	
}
