import java.util.List;
import java.util.ArrayList;

public class Cinco {
	public static void main(String[] args) {
		String st = "luisc,carlosm,barreda,bocanegra";

		String part[] = st.split(",");
		List<String> lista1 = new ArrayList<String>();
		
		for(String str:part) {
			
			lista1.add(str);
		}

		for (String unSt : lista1) {

			System.out.println(".............." + unSt + "............");
		}
	}

}