
public class Punto3c {

	public static void main(String[] args) {

		String[] nuevo = new String[args.length];
		System.out.println("------------------------------------------------------------");
		System.out.println("------------------------------------------------------------");
		System.out.println("Se muestran los argumentos: ");
		for (String st : args) {

			System.out.println(st);
		}

		System.out.println("El numero de argumentos introducidos es de: " + args.length);
		System.out.println("------------------------------------------------------------");
		System.out.println("------------------------------------------------------------");
		System.out.println("Mostramos los argumentos que tienen más de 10 caracteres : ");

		for (String st : args) {

			if (st.length() > 10) {
				System.out.println(st);
			}

		}
		
		System.out.println("------------------------------------------------------------");
		System.out.println("------------------------------------------------------------");
		System.out.println("Se ha creado un nuevo array con el contenido del primero, invertimos el orden: ");
		
		for (int st = 0; st < args.length; st++) {

			nuevo[args.length - st - 1] = args[st]; 
		}

		for (int i = 0; i < nuevo.length; i++) {
			System.out.println(nuevo[i]);
		}
		System.out.println("------------------------------------------------------------");
		System.out.println("------------------------------------------------------------");
		System.out.println("Se muestran solo las palabras que contienen la letra e");
		for (String st : args) {

			if (st.contains("e")) {

				System.out.println(st);

			}
		}

	}
}
