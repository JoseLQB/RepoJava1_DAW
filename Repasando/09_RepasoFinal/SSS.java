import java.util.*;

public class SSS{

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		List <String>l = new ArrayList<String>();
		List <Person>lp = new ArrayList<Person>();
		String palabras [] = new String[20];
		int i =0;
		String line;

		while(sc.hasNext()){

			line = sc.nextLine();
			palabras[i] =line;
			i++;
		}
		for(int n=0; n <= palabras.length; n++){

			if(i>0){
				l.add(palabras[n]);
				i--;
			}
		}
		for(String st : l){
			String partes []= st.split(":");
			Person p = new Person(partes[0], Integer.parseInt(partes[1]));
			lp.add(p);
		}
		lp.stream()
				.filter(p -> p.getName().equals("pepe"))
				.reduce((x, y) -> x + " --- " + y)
				.ifPresent(p -> System.out.println("Edades:: " + p.getAge()));
	}
}