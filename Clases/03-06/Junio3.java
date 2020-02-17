import java.util.Scanner;

public class Junio3 {

	public static void main(String[] args) {
		
		//leer lo que se me da por teclado
		//leo y muestro
		//¿cuando termino de leer? cuando recibo EOF
		
		Scanner sc = new Scanner(System.in);
		
		/*String input = sc.nextLine();

		System.out.println(input);*/
	
		String line;
		while(sc.hasNext()) {
			
			line = sc.nextLine();
			System.out.println(line);

		}
		System.out.println("FIN");
	}//leer un fichero con scanner

}
