import java.util.stream.Stream;
import java.util.Arrays;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.IntStream;

public class EjStreams {

	public static void main(String[] args) {
		
		Person ar[] = new Person[20];
		/*Stream <Person> l = */
		OptionalDouble z = Arrays.stream(ar) 
				= maptoInt (Person::getEdad())
				.average();
		
		z.ifPresent(p --> System.out.println(p));
		
	}

}
