import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class ReadingAgendaZ {
	public static void main(String[] args) throws Exception {
		Scanner in = new Scanner(new FileReader("agenda.txt"));
		System.out.println("Nombre y Apellido" + "            " + "Telefono");
		System.out.println("-----------------" + "            " + "---------");
		getRegistro(in);

	}

	private static String getRegistro(Scanner in) throws FileNotFoundException {

		String line;
		
		String str = " ";
		String[] parte;


		while (in.hasNext()) {
			line = in.nextLine();
			if (line.length() != 0) {
				str = str + line + ": ";

			} else {
				parte = str.split(":");
				if (parte[3].equals(" ")) {
					System.out.println(parte[0] + "         " + parte[2]);
					// System.out.println(str);
					str = " ";

				} else {
					System.out.println(parte[0] + "         " + parte[2] + " -" + parte[3]);
					// System.out.println(str);
					str = " ";

				}
			}

		}

		parte = str.split(":");
		System.out.println(parte[0] + "         " + parte[2] + " -" + parte[3]);
		return str;

	}
}