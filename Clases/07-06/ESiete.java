import java.util.Arrays;
import java.util.List;

public class ESiete {
	public static void main(String[] args) {
		
		
		List<String> lista = Arrays.asList("zoraida", "concejero", "cristianb", "martinl", "puiu");
		String[] t = new String[3];
		t[0]= "pepe";
		t[1]= "juan";
		t[2]= "pipo";
		//int nume = lista.size() - 1;
		
		List <String>lista1 = Arrays.asList(t);
		lista.remove(1);
		lista.add("hola");
		
		for(String st:lista) {
			System.out.println(".............." + st + "............");
		}
		for(String s:lista1) {
			System.out.println(".............." + s + "............");
		}
		}
	
}
