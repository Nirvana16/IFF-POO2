package testes;

import static org.junit.Assert.*;

import org.junit.Test;

import quadrado.Quadrado;

public class QuadradoTest {

	@Test
	public void testCalcularArea() {
		Quadrado q = new Quadrado();
		q.setLado(5);
		assertEquals(25.0,q.calcularArea(),0.001);
		q.setLado(10);
		assertEquals(100.0,q.calcularArea(),0.001);
		q.setLado(4);
		assertEquals(16.0,q.calcularArea(),0.001);
		q.setLado(3);
		assertEquals(9.0,q.calcularArea(),0.001);
		
	}
	@Test
	public void testCalcularPerimetro() {
		Quadrado q = new Quadrado();
		q.setLado(5);
		assertEquals(20,q.calcularPerimetro(),0.1);
	}	
	@Test
	public void testCalcularDiagonal() {
		Quadrado q = new Quadrado();
		q.setLado(5);
		assertEquals(7,q.calcularDiagonal(),0.1);
	}

}
