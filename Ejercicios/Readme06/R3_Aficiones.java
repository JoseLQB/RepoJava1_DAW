import java.util.Hashtable;
import java.util.Scanner;

public class R3_Aficiones {
	
	public static void main(String[] args)  {

		Scanner sc = new Scanner (System.in);
		String nombre;
		String aficiones;
		Hashtable<String, String> ht = new Hashtable<String, String>();
		
		while(sc.hasNext()) {
			nombre = sc.nextLine();
			aficiones = sc.nextLine();
			ht.put(nombre, aficiones);
		}
		sc.close();
		
		for(String st : ht.keySet()) {
			
			System.out.println(st + "  :  " + ht.get(st));
			
		}
		
		
		
		
	}
	

}
