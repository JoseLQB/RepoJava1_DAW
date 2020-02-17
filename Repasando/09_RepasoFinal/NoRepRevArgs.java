import java.util.*;
public class NoRepRevArgs{
	public static void main(String[] args) {
		Set<String>set = new HashSet<String>();

		for(String st : args){

			if(!set.contains(st)){
				set.add(st);
			}
			else{set.remove(st);}
		}

		for(String st : set){
			System.out.println(st);
		}

		set.stream()
			.sorted()
			.filter(!(p -> p.startsWith("p")))
			.forEach(p -> System.out.println(p));
		
		
		

	}


}