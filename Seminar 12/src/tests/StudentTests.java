package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import ro.ase.cts.clase.Student;

public class StudentTests {

	@Test
	public void testConstructorCuParametru() {
		String nume="Martinel";
		Student student=new Student(nume);
		assertEquals(nume, student.getNume());
	}
	
	@Test
	public void testConstructorFaraParametrii() {
		Student student=new Student();
		assertNotNull(student.getNume());
		assertNotNull(student.getNote());
	}
	
	@Test
	public void testAdaugaNota() {
		Student student=new Student();
		int nota=10;
		student.adaugaNota(nota);
		assertEquals(nota,student.getNota(0));
	}
	
	@Test
	public void testDimensiuneLista() {
		Student student=new Student();
		int nota=10;
		student.adaugaNota(nota);
		assertEquals(1,student.getNote().size());
	}
	
	@Test
	public void testCalculMedie() {
		Student student=new Student();
		int nota1=5;
		int nota2=4;
		
		student.adaugaNota(nota1);
		student.adaugaNota(nota2);
		float medie1=student.calculeazaMedie();
		float medie2=(nota1+nota2)/2.0f;
		assertEquals(medie2,medie1,0.0001);
	}
	
	@Test
	public void testAreRestante() {
		Student student=new Student();
		student.adaugaNota(6);
		student.adaugaNota(8);
		assertTrue(student.areRestante());
	}
	@Test
	public void testNuAreRestante() {
		Student student=new Student();
		student.adaugaNota(6);
		student.adaugaNota(8);
		assertFalse(student.areRestante());
	}
	@Test
	public void testSetNume() {
		Student student=new Student();
		String nume="marti";
		student.setNume(nume);
		assertEquals(nume,student.getNume());
	}
	@Test(expected=IndexOutOfBoundsException.class)
	
	public void testGetNotaAruncaExceptie() {
		Student student=new Student();
		student.getNota(-1);
	}
	@Test
	public void testJU3GetNotaAruncaExceptie() {
		Student student=new Student();//1
		try {
			//2
			student.getNota(-1);
			//3  nu este exec
			fail("Metoda nu arunca nicio exceptie");
		}
		catch(IndexOutOfBoundsException exception) {
			//4  nu este exec
			
		}
		catch(Exception exception) {
			//5 nu este exec
			fail("Metoda nu arunca IndexOutOfBoundsException ci alt tip de exceptie");
		}
		//6
	}
	
	@Test (expected = IllegalArgumentException.class)
	public void testNotaNegativa() {
		Student student=new Student();
		student.adaugaNota(-2);
		
		
	}
	@Test (expected = IllegalArgumentException.class)
	public void testNotePreaMari()
	{
		Student student=new Student();
		student.adaugaNota(200);
	}	
}
