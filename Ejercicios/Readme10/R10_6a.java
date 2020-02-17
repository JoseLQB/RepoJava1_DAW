import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Stream;
import java.util.OptionalInt;
import java.util.stream.Collectors;

public class R10_6a{

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		List <Integer> li  = new ArrayList <Integer> ();
		int nume;

		while(sc.hasNext()){

			nume = sc.nextInt();
			li.add(nume);


		}
	
		OptionalInt r = li.stream()
				  .mapToInt(i -> i)
				  .max();

	    if(r.isPresent()){
	    	
	    	System.out.println(r.getAsInt());
	    
	    } else {

	    	System.out.println("No ha valores para mostrar");

	    }

							


		
	}

}