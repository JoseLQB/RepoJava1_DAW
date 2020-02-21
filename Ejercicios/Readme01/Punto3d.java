//Itroduce dos nmeros por argumentos y mostar la suma


public class Punto3d {

	public static void main(String[] args) {

		int r = 0;
		int n = Integer.parseInt(args[0]);
		int m = Integer.parseInt(args[1]);
		int[] nums = { n, m };

		for (int el : nums) {

			r += el;

		}
		System.out.println(r);
	}

}
