import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class EjercicioJunio11 {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(new FileReader("agenda.txt"));
		String reg;
		reg = getRegistro(sc);
		while (reg != null) {
			System.out.println(reg);
			reg = getRegistro(sc);
			
		}
	}

	private static String getRegistro(Scanner sc) {
		String registro = null;
		StringBuilder str = new StringBuilder();
		while (sc.hasNext()) {
			registro = sc.nextLine();
			str.append(registro);
			if (registro.length() == 0) {

				return str.toString();
			
			}
		}
		if(str.length()!=0) {
			return str.toString();
		}
		return null;
	}
}