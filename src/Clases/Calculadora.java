package Clases;

import Interfaces.ICalculadora;

/**
 * Clase Calculadora consta de 2 atributos privados (int a,int b)
 * @author rpere
 *
 */
public class Calculadora implements ICalculadora {
	
	private int a;
	private int b;
	
	/**
	 * Constructor completo de calculadora
	 * @param a
	 * @param b
	 */
	public Calculadora(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	/**
	 * Constructor vacio de Calculadora
	 */
	public Calculadora() {
	}
	
	/**
	 * Metodo Sumar (viene ICalculadora), devuelve la suma de 2 numeros (a,b) 
	 * @return  a + b
	 */
	
	@Override
	public int Sumar() {
		System.out.println("El resultado de la suma de " + a + " + " + b + " = " + (a + b));
		return a + b;
	}
	
	/**
	 * Metodo Restar (viene ICalculadora), devuelve la resta de 2 numeros (a,b) 
	 * @return  a - b
	 */
	@Override
	public int Restar() {
		System.out.println("El resultado de la resta de  " + a + " - " + b + " = " + (a - b));
		return a - b;
	}
	
	/**
	 * Metodo Multiplicar (viene ICalculadora), devuelve la multiplicacion de 2 numeros (a,b) 
	 * @return  a * b
	 */
	@Override
	public int Multiplicar() {
		System.out.println("El resultado de la multiplicación de " + a + " * " + b + " = " + (a * b));
		return a * b;
	}
	
	/**
	 * Metodo Division (viene ICalculadora), devuelve la division de 2 numeros (a,b) 
	 * @return  a / b
	 */
	@Override
	public int Dividir() {
		System.out.println("El resultado de la división de " + a + " / " + b + " = " + (a / b));
		return a / b;
	}

}
