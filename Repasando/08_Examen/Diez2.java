public class Diez2 {
	
	public static void main(String[] args) {

		int n = 0;
		for(String st : args) {

			if((n%2==0)&&(args[n].equals(st))){

				System.out.println(n + " ---- " + st);


			}
			n++;
			
	}
} 
}