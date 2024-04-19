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
	
	/**
	 *  Se recibe un int y devuelve boolean segun sea primo o no
	 * 
	 * @param numero 	numero a calcular si es primo
	 * @return 			boolean segun si el numero aportado es primo
	 */
	public static boolean esPrimo(int numero) 
	{
		boolean primo = true;
		
		for (int i = 2; i < numero; i++) 
		{
			if (numero % i == 0) 
			{
				primo = false;
				break;
			}
		}
		return primo;
	}

}
