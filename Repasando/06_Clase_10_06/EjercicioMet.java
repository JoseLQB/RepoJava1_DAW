import java.util.Scanner;

public class EjercicioMet {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String reg;
		reg = getRegistro(sc);
		while (reg != null) {
			reg = getRegistro(sc);
			System.out.println(reg);
		}
	}

	private static String getRegistro(Scanner sc) {
		String registro = null;
		while (sc.hasNext()) {
			if (sc.nextLine().length() == 0) {
				registro = sc.nextLine();
			
			}
		}
		return registro;
	}
}

//Crear un metodo que es llamado por el main el cual sirve para obtener
//un registro de datos sabiendo que el separador de registro es una linea de
//entrada longitud 0
//getRegistro devuelve el próximo registro( un string ) o el string nulo cuando
//EOF
//leer del teclado de la siguiente manera:
//primera lectura es un nombre, la siguiente son sus aficiones
//juan (intro) natacion, musica, montañismo (intro)
//zoraida (intro) estudio, musica, bicicleta (intro)
//eof
//montar un hash donde la key es el nombre y el valor todas las aficiones