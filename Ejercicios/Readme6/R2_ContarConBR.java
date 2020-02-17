import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

//Mediante un objeto BufferedReader, leer desde teclado líneas de caracteres.
//Mostrar su longitud.
//Terminar cuando es introducido la línea con contenido "fin".

public class R2_ContarConBR {

	public static void main(String[] args) throws IOException {

	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String linea ;
		while (br.lines() !=null) {
			linea= br.readLine();
			
			System.out.println(linea.length());
			if(linea.equals("fin")) {
				break;
			}

		}
	}

}
