package paqueteTraductor;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class TraductorMorse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String abcmorse[] ={".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--..",".----","..---","...--","....-",".....","-....","--...","---..","----.","-----"};
		String abecedario="ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
		String texto;
		String salida="";
		Pattern patronMorse = Pattern.compile("^(-|\\.|\\s){1,}$");
		Pattern patronTexto = Pattern.compile("^([A-Z]|[a-z]|[0-9]|\\s){1,}$");
		Scanner entrada=new Scanner(System.in);
		do {
			System.out.print("Introduzca texto alfanumerico para convertir a morse o solo (. y -) para convertir a texto: \n");
			texto = entrada.nextLine().toUpperCase();
			Matcher validaMorse = patronMorse.matcher(texto);
			Matcher validaTexto = patronTexto.matcher(texto);
			if(validaMorse.find()) {
				String[] palabras = texto.split("   ");
				for(int j = 0 ; j < palabras.length ; j++){
					String[] letras = palabras[j].split(" ");
					for (int k = 0; k < letras.length; k++) {
						for (int l = 0; l < abcmorse.length; l++) {
							if(letras[k].equals(abcmorse[l])){
								salida+=abecedario.charAt(l);
							}
						}
					}
					salida+=" ";
				}
				System.out.println("Codigo traducido a texto :\n");
				System.out.println(salida+"\n");
				salida="";
			}else {
				if(validaTexto.find()) {
					for (int i = 0; i < texto.length(); i++) {
						if(texto.charAt(i)==' '){
							salida+="  ";
						}else{
							salida+=abcmorse[abecedario.indexOf(texto.charAt(i))]+" ";
						}
					}
					System.out.println("Texto traducido a morse:\n");
					System.out.println(salida+"\n");
					salida="";

				}else {
					System.out.println("Entrada no valida, introduzca texto alfanumerico o solo (. y -) segun el caso \n");
				}
			}
		}while(true);	
	}
}