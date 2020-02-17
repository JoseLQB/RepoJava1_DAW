import java.util.List;
import java.util.ArrayList;

public class Ejerc5 {

	public static void main(String[] args) {
		String st = "luisc,carlosm,barreda,bocanegra";
		List<String> lista1 = new ArrayList<String>();
		String[] names = st.split(",");
		for (String s : names) {
			lista1.add(s);
		}
		for (String unst : lista1) {
			System.out.println(".............." + unst + "............");
		}
	}
}