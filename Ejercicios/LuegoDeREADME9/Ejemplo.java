
import java.util.Scanner;
import java.util.Hashtable;
import java.io.FileNotFoundException;
import java.io.FileReader;
public class Ejemplo{
        public static void main(String[] args) throws FileNotFoundException {
                Scanner sc = new Scanner(new FileReader("ficheros/ciudades.txt"));
                Hashtable <String, Integer> ht = new Hashtable <String, Integer>();
                String line;
                while(sc.hasNext()){
                        line = sc.nextLine();
                        String partes [] = line.split(":");
                        ht.put(partes[0], Integer.parseInt(partes[1]));
                }
                for(String st : ht.keySet()){
                        System.out.println(st + "----------" + ht.get(st));
                }
        }
}