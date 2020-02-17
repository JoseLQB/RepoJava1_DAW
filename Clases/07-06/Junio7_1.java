import java.util.Scanner;

public class Junio7_1 {

	public static void main(String[] args) {

		String algo = "hola que tal \n como estas\n mañana salgo \n tengo mucho que estudiar";
		Scanner sc = new Scanner(algo);

		while (sc.hasNextLine()) {
			System.out.println(sc.nextLine());
		}

	}

}
//uso de la api de scanner sobre un string, que los datos de entrada para el objeto
//sean contenidos en un string