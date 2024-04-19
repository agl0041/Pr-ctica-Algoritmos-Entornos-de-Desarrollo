//ALVARO GARCIA LAMUDA
package app;

public class Principal 
{
	public static void main(String[] args) 
	{
		//Variables
		int [] numeros = new int [5];
		int []resultadoFibonacci = new int [5];
		int []resultadoFactorial = new int [5];
		boolean []resultadoPrimos = new boolean [5];
		int numFibonacci =0;
		int n;
		int v;
		boolean x;
		int numFactorial =0;
		
		//Instanciar random
		java.util.Random rm=new java.util.Random();
		
		for (int i = 0; i < numeros.length; i++) 
		{					
			int num = rm.nextInt(1,10);
			numeros[i]=num;
		}
		
		
		
		

	}
}