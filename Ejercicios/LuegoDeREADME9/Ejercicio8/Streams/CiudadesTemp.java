import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.Set;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CiudadesTemp {
	private String ciudad;
	private String mes;
	private int temperatura;

	public CiudadesTemp() {
	}

	public CiudadesTemp(String s, int i, String m) {
		this.ciudad = s;
		this.temperatura = i;
		this.mes = m;
	}

	public int getTemperatura() {
		return temperatura;
	}

	public String getMes() {
		return mes;
	}

	public String getCiudad() {
		return ciudad;
	}

	public static void main(String[] args) throws IOException {
		String line;
		List<CiudadesTemp> lista = new ArrayList<CiudadesTemp>();
		Set<String> set = new HashSet<String>();
		try {
			BufferedReader br = new BufferedReader(new FileReader ("ciudadesTemp.txt"));
			
			while((line = br.readLine())!=null){
				
				String[]parts = line.split(":");
				CiudadesTemp ct = new CiudadesTemp(parts[0], Integer.parseInt(parts[1]), parts[2]);
				lista.add(ct);
				set.add(ct.getCiudad());
				
			}
			lista
				.stream()
				.map(p -> p.getTemperatura())
				.forEach(System.out::println);
			
			set
				.stream()
				.filter(p -> !p.equals("Badajoz"))
				.forEach(System.out::println);
			
			set
				.stream()
				.sorted()
				.reduce((x, y) ->x + " " +y)
				.ifPresent(p -> System.out.println(" **" + p + "** "));
			
				
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	
    }
}