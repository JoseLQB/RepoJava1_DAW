
//En vez de imprimir los datos lo graba en un fichero de texto

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class UsoPersonFich {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Person p = new Person();
		FileWriter fichero = null;
		PrintWriter pw = null;



		System.out.println("¿Quieres empezar?");
	

		String input = sc.nextLine();
	
	while(input.equals("si")){		

			System.out.println(" Nombre: ");
			p.setName(sc.nextLine());

			System.out.println(" Genero: ");
			p.setGender(sc.nextLine());

			System.out.println(" Edad: ");
			p.setAge(Integer.parseInt(sc.nextLine()));

			System.out.println(" Peso: ");
			p.setWeight(Integer.parseInt(sc.nextLine()));

			System.out.println(" Ojos ");
			p.setEyeColor(sc.nextLine());

					try {
			fichero = new FileWriter("Person.txt");
			pw = new PrintWriter(fichero, true);

			pw.println("Nombre: " + p.getName());
			pw.println("Genero: " + p.getGender());
			pw.println("Edad: " + p.getAge());
			pw.println("Peso: " + p.getWeight());
			pw.println("Ojos: " + p.getEyeColor());

			fichero.close(); ///

		} catch (IOException e) {

			e.printStackTrace();
		}

			if(sc.nextLine().equals("x")){
				break;
			}




		}	



	}

}
