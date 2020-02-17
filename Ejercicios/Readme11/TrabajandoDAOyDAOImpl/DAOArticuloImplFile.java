import java.util.List;
import java.util.ArrayList;
import java.io.FileReader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class DAOArticuloImplFile implements DAOArticulo {
   private Scanner scan = null;
   private String fileName = null;
   public DAOArticuloImplFile(String fileName) throws Exception{
      scan = new Scanner(new FileReader(fileName));
      this.fileName = fileName;
   }
   public Articulo get() throws Exception{
      String line;
      if(scan.hasNext()) {
        line = scan.nextLine();
        String[] campos = line.split(":");
        return new Articulo(campos[0], campos[1], campos[2]);
      }
      else {
       scan.close();
       return null;
      }
   }
   public List<Articulo> findAll()  throws Exception{
      List<String> allLines = Files.readAllLines(Paths.get(fileName));
      List<Articulo> result = new ArrayList<Articulo>();
      for(String st : allLines){
        String[] campos = st.split(":");
        result.add(new Articulo(campos[0], campos[1], campos[2]));
      }
      return result;
   }

}
