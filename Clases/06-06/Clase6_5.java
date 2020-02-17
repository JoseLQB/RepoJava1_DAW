
public class Clase6_5 {

	public static void main(String[] args) {
		boolean in = false;
		int i = 0;
		String[] ar = new String[30];
		for(int j = 0; j<=29; j++)
			ar[j]=null;
		

			
		for (String st : args) {
			for (int indx=0; ar[indx]!=null; indx++) {
			//for (String s : ar) {
				if (ar[indx].contains(st)) {
					in = true;

				}
			}
			if (!in) {
				ar[i++] = st;
			}
			in = false;
		

		}
		for (String r : ar) {
			if (i > 0) {
				i--;
				System.out.println(r);
			}

		}
	}

}
