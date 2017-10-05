package testes;

import static org.junit.Assert.*;

import org.junit.Test;

import exemplo2.Professor;

public class ProfessorTest {

	@Test
	public void testSalarioBruto() {
		Professor p = new Professor("Doutorado");
		p.setSalario(10000);
		assertEquals(12000,p.salarioBruto(),0.001);
		
		p.setTitulacao("Mestre");
		assertEquals(11000,p.salarioBruto(),0.001);
		
		p.setTitulacao("Graduado");
		assertEquals(10000,p.salarioBruto(),0.001);
		
		
		
	}

}
