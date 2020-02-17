import java.io.Console;

public class UsoPerson {

	public static void main(String[] args) {

		Person p = new Person();
		Console console = System.console();
        String input = null;
        
        System.out.println(" Nombre: ");
        input = console.readLine();
        p.setName(input);
		
        System.out.println(" Genero: ");
        input = console.readLine();
        p.setGender(input);
        
        System.out.println(" Edad: ");
        input = console.readLine();
        p.setAge(Integer.parseInt(input));
        
        System.out.println(" Peso: ");
        input = console.readLine();
        p.setWeight(Integer.parseInt(input));
		
        System.out.println(" Color de ojos: ");
        input = console.readLine();
        p.setEyeColor(input);
        
        System.out.println("Te llamas " + p.getName() + " , eres " + p.getGender() + 
        		" , tienes " + p.getAge() + " años, pesas " + p.getWeight() + " kilos y tus ojos son " +
        		p.getEyeColor() + ".");
	}

}
