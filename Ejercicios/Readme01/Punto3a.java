
public class Punto3a {

	public static void main(String[] args) {

		String[] nuevo = new String[args.length];
		for (int st = 0; st < args.length; st++) {

			nuevo[args.length - st - 1] = args[st];
		}

		for (int i = 0; i < nuevo.length; i++) {
			System.out.println(nuevo[i]);
		}
	}

}
