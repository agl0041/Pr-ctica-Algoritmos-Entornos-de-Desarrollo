//ALVARO GARCIA LAMUDA
package util;

public class Algoritmos 
{
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
