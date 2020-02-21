//Devuelve el número de espacios en blanco 

import java.util.Scanner;

public class R1_ContarBlancos {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String linea;
		int i = 0;
		
		while(sc.hasNext()) {
			
			linea = sc.nextLine();
			if(linea.length() == 0) {
				
				i++;
				
			}
			
		}
		System.out.println(i);
	}

}
