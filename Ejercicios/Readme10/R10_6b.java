import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class R10_6b{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		List <String> ls = new ArrayList<String>();
		String input;

		while(sc.hasNext()){
			input = sc.nextLine();
			ls.add(input);

		}
		for(int n = ls.size() -1; n>=0; n--){

			System.out.println(ls.get(n));
		}
	}
}
