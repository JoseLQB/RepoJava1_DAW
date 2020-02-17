import java.util.*;
import java.io.*;

//Esto sería la manera fácil de hacerlo pero no era este mi objetivo

public class UsoPersonClase2 {

	public static void main(String[] args) throws FileNotFoundException {

		Person p = new Person(null, null, 0, 0, null);

		
		Scanner sc = new Scanner(new File("Person2.txt"));

		int n = 0;

		while (sc.hasNext()) {
			String line = sc.nextLine();
			String parts []= line.split(":");

			for (String s : parts) {
				p.setName(parts[0]);
				p.setGender(parts[1]);
				p.setAge(Integer.parseInt(parts[2]));
				p.setWeight(Integer.parseInt(parts[3]));
				p.setEyeColor(parts[4]);
			}
			System.out.println("Nombre: " + p.getName() + ", género: " + p.getGender() + ", edad: "
					+ p.getAge() + ", peso: " + p.getWeight() + ", color de ojos " + p.getEyeColor() );

		}

	}

}