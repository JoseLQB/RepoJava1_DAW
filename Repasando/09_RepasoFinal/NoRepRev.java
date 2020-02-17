import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.List;


public class NoRepRev{

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Set<String>set = new HashSet<String>();
		List<Integer>list = new ArrayList<Integer>();
		int line;
		while(sc.hasNext()){
			line = sc.nextInt();
			list.add(line);
		}
		list.stream()

	
		//.max()

		.forEach(p -> System.out.println(p));
	}
	



}