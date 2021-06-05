package ro.ase.cts.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import ro.ase.cts.clase.Grupa;
import ro.ase.cts.mocks.StudentDummy;
import ro.ase.cts.mocks.StudentFake;
import ro.ase.cts.mocks.StudentStub;

public class TestGrupaWithMocks {

	@Test
	public void test() {
		
		StudentDummy student = new StudentDummy();
		Grupa grupa=new Grupa(1078);
		grupa.adaugaStudent(student);
		assertEquals(1,grupa.getStudenti().size());
		
	}
	@Test 
	public void testGetProm() {
		StudentStub student=new StudentStub();
		Grupa grupa=new Grupa(1078);
		grupa.adaugaStudent(student);
		assertEquals(0,grupa.getPromovabilitate(),0.01);
	}
	
	@Test
	public void testGrupaWithFakeRight() {
		Grupa grupa=new Grupa(1078);
		//10 studenti - 7 integralisti si 3 restantieri
		
		for(int i=0;i<7;i++) {
			StudentFake student=new StudentFake();
			student.setValoareAreRestante(false);
			grupa.adaugaStudent(student);
		}
		for(int i=0;i<3;i++) {
			StudentFake student=new StudentFake();
			student.setValoareAreRestante(true);
			grupa.adaugaStudent(student);
		}
		assertEquals(0.7,grupa.getPromovabilitate(),0.01);
	}

}
