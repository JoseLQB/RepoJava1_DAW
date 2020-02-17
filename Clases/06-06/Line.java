import java.util.List;
import java.util.Arrays;
1
public class Line {
 public static void main(String[] args) {
 List<String> lista = Arrays.asList("zoraida","concejero","cristianb","martinl","puiu");
 int nume = lista.size() - 1;
 while(nume >= 0) {
 System.out.println(".............." + lista.get(nume) + "............");
 }
 }
}
