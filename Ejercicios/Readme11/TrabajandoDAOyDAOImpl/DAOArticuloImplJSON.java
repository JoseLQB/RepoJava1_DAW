import java.util.List;
import java.util.ArrayList;
import java.nio.file.Paths;
import java.nio.file.Files;
import org.json.JSONArray;
import org.json.JSONObject;

public class DAOArticuloImplJSON implements DAOArticulo {
   private List<Object> lista = new ArrayList<Object>();
   private int i = 0;
   private int len = 0;
   private String codigo;
   private String codcat;
   private String nombre;
   public DAOArticuloImplJSON(String fileName) throws Exception{
     String line = new String(Files.readAllBytes(Paths.get(fileName)));
     JSONArray recs = new JSONArray(line);
     for(Object o : recs) {
       lista.add(o);
     }
     len = lista.size();
   }
   public List<Articulo> findAll() throws Exception{
      List<Articulo> result = new ArrayList<Articulo>();
      for(Object o : lista) {
         codigo = ((JSONObject) o).getString("codigo");
         nombre = ((JSONObject) o).getString("nombre");
         codcat = ((JSONObject) o).getString("codcat");
         result.add(new Articulo(codigo,nombre,codcat));
      }
      return result;
   }
   public Articulo get() throws Exception{
      if(i < len) {
        Object obj = lista.get(i);
        codigo = ((JSONObject) obj).getString("codigo");
        nombre = ((JSONObject) obj).getString("nombre");
        codcat = ((JSONObject) obj).getString("codcat");
        i++;
        return new Articulo(codigo,nombre,codcat);
      }
      return null;
   }
}

