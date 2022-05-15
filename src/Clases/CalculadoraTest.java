package Clases;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * Clase de testing CalculadoraTest
 * 
 * @author rpere
 *
 */
class CalculadoraTest {

	/**
	 * Testing del metodo Sumar
	 * 
	 * @return a + b
	 */
	@Test
	void testSumar() {
		Calculadora calculadora = new Calculadora(1, 2);
		int resultado = calculadora.Sumar();
		assertEquals(resultado, 3);
	}

	/**
	 * Testing del metodo Restar
	 * 
	 * @return a - b
	 */
	@Test
	void testRestar() {
		Calculadora calculadora = new Calculadora(1, 2);
		int resultado = calculadora.Restar();
		assertEquals(resultado, -1);
	}

	/**
	 * Testing del metodo Multiplicar
	 * 
	 * @return a * b
	 */
	@Test
	void testMultiplicar() {
		Calculadora calculadora = new Calculadora(1, 2);
		int resultado = calculadora.Multiplicar();
		assertEquals(resultado, 2);
	}

	/**
	 * Testing del metodo Dividir
	 * 
	 * @return a / b
	 */
	@Test
	void testDividir() {
		Calculadora calculadora = new Calculadora(1, 2);
		int resultado = calculadora.Dividir();
		assertEquals(resultado, 0);
	}

}
