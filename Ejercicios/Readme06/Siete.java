public class Siete {
	public static void main(String[] args) {
		int nume = readOnlyIntegers("5");
		while (nume != 0) {
			System.out.println(".............." + nume + "............");
			nume = readOnlyIntegers("0");
		}
	}

	public static int readOnlyIntegers(String st) {
		return Integer.parseInt(st); 
	}
	
}

