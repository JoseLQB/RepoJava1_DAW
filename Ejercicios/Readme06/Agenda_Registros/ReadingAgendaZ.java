import java.io.FileReader;
import java.util.Scanner;

public class ReadingAgendaZ {
	public static void main(String[] args) throws Exception {
		String line;
		Scanner in = new Scanner(new FileReader("agenda.txt"));
		String str = " ";
		String[] parte;
		System.out.println("Nombre y Apellido" + "            " + "Telefono");
		System.out.println("-----------------" + "            " + "---------");

		while (in.hasNext()) {
			line = in.nextLine();
			if (line.length() != 0) {
				str = str + line + ": ";

			} else {
				parte = str.split(":");

				System.out.println(parte[0] + "         " + parte[2] + "-" + parte[3]);
				// System.out.println(str);
				str = " ";

			}

		}

		parte = str.split(":");
		System.out.println(parte[0] + "         " + parte[2]+ "-" + parte[3]);
	}
}
// Pendiente de realizar lo mismo distribuyendo algunas cosas en el main y en un getRegistro