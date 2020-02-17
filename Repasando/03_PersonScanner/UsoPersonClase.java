import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UsoPersonClase {
	public static void main(String args[]) throws FileNotFoundException {

		List<String> l = new ArrayList<String>();
		Scanner sc = new Scanner(new File(args[0]));
		String line;
		Person p = new Person();
		while (sc.hasNext()) {

			line = sc.nextLine();
			//System.out.println(line);
			//String part = line.split(": ")[0];
			String part2 = line.split(": ")[1];
			l.add(part2);
		}
		//System.out.println(l);
		for(String st: l) {
			p.setName(l.get(0));
			p.setGender(l.get(1));
			p.setAge(Integer.parseInt(l.get(2)));
			p.setWeight(Integer.parseInt(l.get(3)));
			p.setEyeColor(l.get(4));	
		}
		System.out.println("Te llamas " + p.getName() + ", tu género es " + p.getGender() + ", tu edad es "
				+ p.getAge() + ", pesas " + p.getWeight() + " kilos y tus ojos son " + p.getEyeColor() );
		
	}
}
