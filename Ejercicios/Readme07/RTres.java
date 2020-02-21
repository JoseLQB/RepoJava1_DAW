import java.util.Scanner;

public class RTres {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[] arrInt = new int[20];
		int i = 0;
		while (sc.hasNext()) {

			arrInt[i] = sc.nextInt();
			i++;
		}
		for (int iin : arrInt) {

			if (i > 0) {
				System.out.println(iin);
				i--;
			}

		}
	}

}
