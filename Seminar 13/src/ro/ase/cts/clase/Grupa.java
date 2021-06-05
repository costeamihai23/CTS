package ro.ase.cts.clase;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

//O grupa contine maxim 35 de studenti
// Numarul grupei pentru facultatea noastra este cuprins intre 1000 - 1100

public class Grupa {
    private List<IStudent> studenti;
    private int nrGrupa;

    public List<IStudent> getStudenti() {
		return studenti;
	}

	public int getNrGrupa() {
		return nrGrupa;
	}

	public Grupa(int nrGrupa){
        this.nrGrupa=nrGrupa;
        studenti=new ArrayList<>();
    }

    public void importaStudenti(List<IStudent> studenti){
        this.studenti.addAll(studenti);
    }

    public void adaugaStudent(IStudent student){
        studenti.add(student);
    }

    public IStudent getStudent(int index){
        if(index>=0 && index< studenti.size()){
            return studenti.get(index);
        }
        throw new IndexOutOfBoundsException();
    }

    public float getPromovabilitate(){
        int nrRestantieri=0;
        for(IStudent student:studenti){
            if(student.areRestante()){
                nrRestantieri++;
            }}if(nrRestantieri==0) {
            return (studenti.size()-nrRestantieri)/(float)studenti.size();
        }
        return (studenti.size()-nrRestantieri)/(float)studenti.size();
    }
    
    
    
}