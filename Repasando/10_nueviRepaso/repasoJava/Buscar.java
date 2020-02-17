package repasoJava;

import java.util.Scanner;

public class Buscar {
	
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int cont = 0;
		char caracter = 0;
		System.out.println("Introduce");
		String input = sc.nextLine();
		
		while(input.length()!=0) {
			int nuevoCont = 0;
			for(int j = 0; j<input.length();j++) {
				if(input.charAt(0)==input.charAt(j)) {
					nuevoCont++;
				}
			}
			if(nuevoCont>cont) {
				cont = nuevoCont;
				caracter = input.charAt(0);
			}
			input = input.replaceAll(input.charAt(0) + "", "");
		}
		System.out.println(caracter + ": " + cont);
	}
	
	
}
