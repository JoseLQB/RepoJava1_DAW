//- b. Que solo se muestren las palabras del array que contengan la letra "e"
public class Punto3b {

	public static void main(String[] args) {

		for (String st : args) {

			if (st.contains("e")) {

				System.out.println(st);
				
			}
		}
	}
}
