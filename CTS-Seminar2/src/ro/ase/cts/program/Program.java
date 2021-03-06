package ro.ase.cts.program;
import ro.ase.cts.clase.*;
import ro.ase.cts.readers.ReaderAngajat;
import ro.ase.cts.readers.ReaderAplicanti;
import ro.ase.cts.readers.ReaderElevi;

import java.io.FileNotFoundException;
import java.util.List;

public class Program {
	public static List<Aplicant>citesteAplicanti(ReaderAplicanti reader) throws FileNotFoundException{
		List<Aplicant>listaAplicanti=reader.readAplicanti();
		return listaAplicanti;
		
	}

	public static void main(String[] args) {
		List<Aplicant> listaAplicanti;
		try {
			listaAplicanti = citesteAplicanti( new ReaderAngajat("angajati.txt"));
			for(Aplicant aplicant:listaAplicanti)
				System.out.println(aplicant.toString());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}