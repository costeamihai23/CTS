package ro.ase.cts.tests;
import ro.ase.cts.clase.Grupa;
import ro.ase.cts.clase.Student;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestGrupa {
	private Grupa grupa;
	
	@Before
	public void setup() {
		this.grupa=new Grupa(1078);
    	for(int i=0;i<35;i++) {
    		Student student=new Student();
    		for(int j=0;j<7;j++) {
    			student.adaugaNota(8);
    		}
    		grupa.adaugaStudent(student);}
	}

	@Test
	public void test() {
		Grupa grupa=new Grupa(1078);
		assertEquals(1078,grupa.getNrGrupa());
	}
	
	@Test 
	public void testConstructorLimitaInferioara() {
		Grupa grupa=new Grupa(1000);
		assertEquals(1000,grupa.getNrGrupa());
	}
	
	@Test
	public void testConstructorLimitaSuperioara() {
		Grupa grupa=new Grupa(1100);
		assertEquals(1100,grupa.getNrGrupa());
	}

	@Test(expected=IllegalArgumentException.class)
		public void testConstructorSubLimita() {
			Grupa grupa=new Grupa(999);
		}
	@Test(timeout=200)
	public void testConstructorPerformanta() {
		Grupa grupa=new Grupa(1000);
	}
	public void testConstructorExistaLista() {
		Grupa grupa=new Grupa(1078);
		assertNotNull(grupa.getStudenti());
	}
	public void testGetPromovabilitateRight() {
		Grupa grupa=new Grupa(1078);
		for(int i=0;i<8;i++) {
			Student student=new Student();
			student.adaugaNota(10);
			grupa.adaugaStudent(student);
		}
		for(int i=0;i<2;i++) {
			Student student=new Student();
			student.adaugaNota(3);
		
		}
		assertEquals(0.8,grupa.getPromovabilitate(),0.001);
		}
	public void testGetPromovabilitateBoundary() {
		Grupa grupa=new Grupa(1078);
		for(int i=0;i<8;i++) {
			Student student=new Student();
			student.adaugaNota(3);
			grupa.adaugaStudent(student);
		}
		assertEquals(0,grupa.getPromovabilitate(),0.001);
	}
	@Test
	public void testGetPromovabilitateInversa() {
		int nrInteligralisti=31;
		int nrRestantieri=2;
		Grupa grupa=new Grupa(1078);
		for(int i=0;i<8;i++) {
			Student student=new Student();
			student.adaugaNota(3);
			grupa.adaugaStudent(student);
		}
		for(int i=0;i<2;i++) {
			Student student=new Student();
			student.adaugaNota(3);
			grupa.adaugaStudent(student);
		
		}
		assertEquals(nrInteligralisti,grupa.getPromovabilitate()*grupa.getStudenti().size(),0.001);
	}
	@Test
	public void testGetPromovabilitateError() {
		Grupa grupa=new Grupa(1078);
		assertEquals(0,grupa.getPromovabilitate(),0.001);
	}
	@Test(timeout=500)
    public void testGetPromovabilitatePerformance() {
    	Grupa grupa=new Grupa(1078);
    	for(int i=0;i<35;i++) {
    		Student student=new Student();
    		for(int j=0;j<7;j++) {
    			student.adaugaNota(8);
    		}
    		grupa.adaugaStudent(student);
    	}
    	grupa.getPromovabilitate();
    }
	@Test
	public void testGerPromovabilitateCardinalityAreRestanta() {
		Grupa grupa=new Grupa(1078);
		Student student=new Student();
		student.adaugaNota(3);
		grupa.adaugaStudent(student);
		assertEquals(0,grupa.getPromovabilitate(),0.001);
	}
	@Test
	public void testGerPromovabilitateCardinalityNUAreRestanta() {
		Grupa grupa=new Grupa(1078);
		Student student=new Student();
		student.adaugaNota(3);
		grupa.adaugaStudent(student);
		assertEquals(1,grupa.getPromovabilitate(),0.001);
	}
	

	}
	
