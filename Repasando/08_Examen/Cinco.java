import java.util.List;
import java.util.ArrayList;
public class Cinco {
	public static void main(String[] args) {
		String st = "luisc,carlosm,barreda,bocanegra";

		List<String> lista1 = new ArrayList<String>();
		String[]parts = st.split(",");
		for(String c : parts){
			lista1.add(c);
		}
		for(String unSt : lista1){

			System.out.println(".............." + unSt + "............");
		}
	}
} 