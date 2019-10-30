package es.studium.ConversionMoneda;

import java.util.Scanner;

public class ConversionMoneda {

	public static void main(String[] args) 
	{
		int option = 0;
		double cantidad = 0;
		Scanner teclado = new Scanner(System.in);
		do {


			System.out.println("         Menu"+"\n 1-Pasar de Pesetas a Euros"+ "\n 2-Pasar de Euros a Pesetas"+"\n 3-Salir");
			option=teclado.nextInt();
			if(option==1 || option==2) 
			{
				System.out.println("Introduce la cantidad que se quiera convertir:");
				cantidad=teclado.nextDouble();

				if(option==1)
				{
					System.out.println("\n"+"El resultado es:"+" "+converpesAeur(cantidad)+"€"+"\n");
				}
				if(option==2)
				{
					System.out.println("\n"+"El resultado es:"+" "+convereurApes(cantidad)+" "+"pesetas"+"\n");
				}
			}
		}while(option!=3);
		teclado.close();
	}
	private static double converpesAeur(double cantidad) 
	{
		double resultado;
		resultado= cantidad/166.386;
		return resultado;

	}
	private static double convereurApes(double cantidad) 
	{
		double resultado2;
		resultado2= cantidad*166.386;
		return resultado2;

	}


}
