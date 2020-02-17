package repasoJava;

import java.util.Scanner;

public class usoTelephone {

	public static void main(String[] args) {
		Telephone tlf = new Telephone();

		Scanner sc = new Scanner(System.in);
		String input;
		String input2;
		int inputN;
		do {
			System.out.println("Introduce cable");
			input = sc.nextLine();
			tlf.setCable(input);
			System.out.println("Introduce numero");
			inputN = sc.nextInt();
			tlf.setNumero(inputN);
			
			System.out.println("Introduce tecla");
			input2 = sc.nextLine();
			tlf.setTecla(input2);
			
			System.out.println(tlf.getCable());
			System.out.println(tlf.getNumero());
			System.out.println(tlf.getTecla());
		}while(!input.equals(""));
		sc.close();
	}
}
