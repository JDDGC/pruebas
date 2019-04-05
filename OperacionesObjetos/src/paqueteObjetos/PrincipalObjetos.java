package paqueteObjetos;

import java.util.Scanner;

public class PrincipalObjetos {
	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		int numero=0;
		int opcion=0;
		Cubo cubo=new Cubo();
		do {
			System.out.println("Valor Actual: "+numero);
			System.out.println("Ingresa el valor de un lado nuevo: ");
			numero = entrada.nextInt();
			cubo.setLado(numero);
			do {
				String salida="\nValor Actual: "+numero+"\n\n"+
							  "ELIJA UNA OPCION: \n"+
							  "1.-Calcular area de Cuadrado \n"+
							  "2.-Calcular perimetro de Cuadrado \n"+
							  "3.-Calcular volumen de Cubo \n"+
							  "4.-Calcular perimetro de Cubo \n"+
							  "5.-Cancelar \n";
				System.out.println(salida);
				opcion=entrada.nextInt();
				switch (opcion) {
				case 1:
					System.out.println("El area del cuadrado es: "+cubo.calcularArea());
					break;
				case 2:
					System.out.println("El perimetro del cuadrado es: "+cubo.calcularPerimetro());
					break;
				case 3:
					System.out.println("El volumen del cubo es: "+cubo.calcularVolumen());
					break;
				case 4:
					System.out.println("El perimetro del cubo es: "+cubo.calcularPerimetroCubo());
					break;

				default:
					break;
				}
				
			}while(opcion!=5);
		}while(true);
	}
}
