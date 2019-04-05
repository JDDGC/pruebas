package paqueteRomanos;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ConversorRomanos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner (System.in);
		int numero=0,millares=0,centenas=0,decenas=0,unidades=0 ;
		String []cen={"C","CC","CCC","CD","D","DC","DCC","DCCC","CM"};
		String []dec={"X","XX","XXX","XL","L","LX","LXX","LXXX","XC"};
		String []uni={"I","II","III","IV","V","VI","VII","VIII","IX"};
		String salida="";
		do {
			try {
				System.out.println("Ingresa un numero entero dentro del rango 1-1000:");
				numero = entrada.nextInt();
				if(numero<=1000) {
					millares=(numero/1000)%10;
					centenas=(numero/100)%10;
					decenas=(numero/10)%10;
					unidades=(numero%10);
					if(millares>0) {salida+="M";}
					if(centenas>0) {salida+=cen[centenas-1];}
					if(decenas>0) {salida+=dec[decenas-1];}
					if(unidades>0) {salida+=uni[unidades-1];}
					System.out.println("\nNumero romano: "+salida+"\n");
					salida="";
				}else {
					System.out.println("El numero debe ser menor o igual a 1000 \n");
				}
			}catch(InputMismatchException e){
				System.out.println("Error, solo introducir numeros enteros \n");
	            entrada.nextLine();
			}
		} while (true);
	}
}
