public class Punto3aClase {

	public static void main(String[] args) {
		String[] nuevo = new String[args.length];
		int len =args.length -1;
		int j = 0;

		for(int i = len; i>=0; i--, i++){

			nuevo[j] = args[i];

		}

		for(String st : nuevo) {;
		
			System.out.println(st);

		}
	}

}