package ro.ase.cts.readers;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import ro.ase.cts.clase.Angajat;
import ro.ase.cts.clase.Aplicant;

public abstract class ReaderAplicanti {
	protected String fileName;
	
          public ReaderAplicanti(String fileName) {
		super();
		this.fileName = fileName;
	}
		public abstract List<Aplicant>readAplicanti(String fileName) throws FileNotFoundException;
		public List<Aplicant> readAplicanti() throws FileNotFoundException {
			// TODO Auto-generated method stub
			return null;
		}
      
}