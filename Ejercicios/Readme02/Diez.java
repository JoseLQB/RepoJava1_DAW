
public class Diez {
	public static void main(String[] args) {

		for(String st : args) {
			for(int n =0; n<args.length; n++){
				if(n%2==0 && args[n].equals(st)) {
					System.out.println(n + " ---- " + args[n]);
				}
			}
		
			
		}
		
	}
}