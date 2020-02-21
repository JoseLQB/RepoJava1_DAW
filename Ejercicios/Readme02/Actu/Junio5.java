import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import Project1.Person;

public class Junio5 {
        public static void main(String args[]) throws InterruptedException   {
                // Person p1 = new Person();
                Scanner sc = new Scanner(System.in);
                while (sc.hasNext()) {
                        String linea = sc.nextLine();
                        String part[] = linea.split(":");
                        Person p1 = new Person(part[0], part[1], part[2]);
                        for(int i = 0; 
                        System.out.print("--");
          //  Thread.sleep(5000);

                        if ((p1.getAddress().matches("(?im)^(av |avenida ).*")) && (p1.getName().length() >= 4)){
                   //if((p1.getAddress().contains("Avenida")) && (p1.getName().length() >= 4)) {
                                System.out.println(p1.getName()+ " ---> " + p1.getTlf());
                        }
                }
        }
}