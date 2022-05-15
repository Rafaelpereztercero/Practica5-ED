package Interfaces;
/**
 * Interface  ICalculadora
 * @author rpere
 *
 */
public interface ICalculadora {
	/**
	 * Metodo Sumar, devuelve la suma de 2 numeros (a,b) 
	 * @return  a + b
	 */
	public int Sumar();
	/**
	 * Metodo Restar, devuelve la resta de 2 numeros (a,b) 
	 * @return  a - b
	 */
	public int Restar();
	/**
	 * Metodo Multiplicar, devuelve la multiplicacion de 2 numeros (a,b) 
	 * @return  a * b
	 */
	public int Multiplicar();
	/**
	 * Metodo Dividir, devuelve la division de 2 numeros (a,b) 
	 * @return  a / b
	 */
	public int Dividir();
}
