import java.util.Scanner;

public class RTresV2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[] arrInt = new int[20];
		int i = 0;
		while (sc.hasNext()) {

			arrInt[i + 19] = sc.nextInt();
			i--;
		}
		for (int iin : arrInt) {

			if (i < 20) {
				System.out.println(iin);
				i++;
			}

		}
	}

}
//Versión 2 del ejercicio anterior. Muestra los numeros introducidos en orden inverso //queda pendiente quitar los nulls