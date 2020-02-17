package repasoJava;

import java.util.Scanner;

public class Contar {

	public static void main(String[] args) {
		
		System.out.println(inviertePalabra("hola", "hola".length()-1));
		
	}
	
	public static String inviertePalabra(String palabra, int longitud) {
		if(longitud == 0) {
			return palabra.charAt(longitud) + "";
		}else {
			return palabra.charAt(longitud) + (inviertePalabra(palabra, longitud-1));
		}
	}

}
