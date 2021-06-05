package ro.ase.cts.mocks;

import java.util.List;

import ro.ase.cts.clase.IStudent;

public class StudentFake implements IStudent {

	private String valoareGetNume;
	private List<Integer> valoareGetNote;
	private float valoareGetMedie;
	private int valoareGetNota;
	private boolean valoareAreRestante;
	
	
	
	public String getValoareGetNume() {
		return valoareGetNume;
	}

	public void setValoareGetNume(String valoareGetNume) {
		this.valoareGetNume = valoareGetNume;
	}

	public List<Integer> getValoareGetNote() {
		return valoareGetNote;
	}

	public void setValoareGetNote(List<Integer> valoareGetNote) {
		this.valoareGetNote = valoareGetNote;
	}

	public float getValoareGetMedie() {
		return valoareGetMedie;
	}

	public void setValoareGetMedie(float valoareGetMedie) {
		this.valoareGetMedie = valoareGetMedie;
	}

	public int getValoareGetNota() {
		return valoareGetNota;
	}

	public void setValoareGetNota(int valoareGetNota) {
		this.valoareGetNota = valoareGetNota;
	}

	public boolean isValoareAreRestante() {
		return valoareAreRestante;
	}

	public void setValoareAreRestante(boolean valoareAreRestante) {
		this.valoareAreRestante = valoareAreRestante;
	}

	@Override
	public String getNume() {
		// TODO Auto-generated method stub
		return valoareGetNume;
	}

	@Override
	public void setNume(String nume) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Integer> getNote() {
		// TODO Auto-generated method stub
		return valoareGetNote;
	}

	@Override
	public void adaugaNota(int nota) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public float calculeazaMedie() {
		// TODO Auto-generated method stub
		return valoareGetMedie;
	}

	@Override
	public int getNota(int index) {
		// TODO Auto-generated method stub
		return valoareGetNota;
	}

	@Override
	public boolean areRestante() {
		// TODO Auto-generated method stub
		return false;
	}

}
