import java.util.Scanner;

public class Punto3a {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] nuevo = new int[30];
		for (int st = 0; st < args.length; st++) {
			nuevo[args.length - st - 1] = sc.nextInt();
		}
		for (int i = 0; i < nuevo.length; i++) {
			System.out.println(nuevo[i]);
		}
	}
}