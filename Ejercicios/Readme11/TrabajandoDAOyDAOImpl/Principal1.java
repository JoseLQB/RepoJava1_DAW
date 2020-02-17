import java.util.List;
import java.util.Collections;
import java.util.Map;
import java.util.Map.Entry;
import java.util.ArrayList;
import java.util.stream.Stream;
import java.util.stream.Collectors;

public class Principal1 {
   public static void main(String[] args) throws Exception {
      List<Articulo> lista = new ArrayList<Articulo>(); 
      DAOArticulo dao = new DAOArticuloImplFile("entradas");
      DAOArticulo dao1 = new DAOArticuloImplJSON("entradas.json");
      //DAOArticulo dao2 = new DAOArticuloImplDB();
     /* for(Articulo ar : dao2.findAll()) {
        lista.add(ar);
      }*/
      lista.forEach(p -> System.out.println(p.getNombre()));
      for(Articulo art1 : dao.findAll()) {
        lista.add(art1);
      }
      for(Articulo art1 : dao1.findAll()) {
        lista.add(art1);
      }
      Map<String, Long> collect = lista.stream()
                                       .map(Articulo::getCodcat)
                                       .collect(Collectors.groupingBy(o -> o, Collectors.counting()));
      System.out.println(collect);
      String key = Collections.max(collect.entrySet(), Map.Entry.comparingByValue()).getKey();
      System.out.println(key);
      lista.stream()
           .filter(p -> p.getCodcat().equals(key))
           .forEach(p -> System.out.println(p.getNombre()));
  }
}

//javac -cp .;JARS/* Principal1.java