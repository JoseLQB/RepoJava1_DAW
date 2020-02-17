import java.util.Scanner;

public class EjerciciosNum {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int ar[] = new int[20];
		int i = 0;
		while (sc.hasNext()) {
			ar[i++] = sc.nextInt();
		}
		for (int s : ar) {

			if (i > 0) {
				System.out.println(s);
				i--;

			}
		}

	}

}
