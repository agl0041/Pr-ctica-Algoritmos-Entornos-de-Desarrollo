//ALVARO GARCIA LAMUDA
package util;

public class Algoritmos 
{
	/**
	 *  Se recibe un int y devuelve el factorial del numero aportado
	 * 
	 * @param numero 	numero a calcular el factorial
	 * @return 			factorial del numero aportado
	 */
	public static int factorial(int numero) 
	{
		int factorial = 1;
		
		for (int i = 1; i < numero; i++) 
		{
			factorial = factorial * i;
		}
		return factorial;
	}

}
