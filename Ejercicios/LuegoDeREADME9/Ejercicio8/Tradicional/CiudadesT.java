//Ejercicio 8 con método tradicional

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CiudadesT {
	private String ciudad;
	private String mes;
	private int temperatura;

	public CiudadesT() {
	}

	public CiudadesT(String s, int i, String m) {
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
		List<CiudadesT> list = new ArrayList<CiudadesT>();
		Set<String> set = new HashSet<String>();
		Set<String> set2 = new HashSet<String>();
		
		try {
			BufferedReader br = new BufferedReader(new FileReader("ciudadesTemp.txt"));

			while ((line = br.readLine()) != null) {

				String[] parts = line.split(":");
				CiudadesT ct = new CiudadesT(parts[0], Integer.parseInt(parts[1]), parts[2]);
				list.add(ct);

			}
			for (CiudadesT s : list) {
				if (!s.getCiudad().equals("Badajoz")) {
					set.add(s.getCiudad());
				}
				set2.add(s.getCiudad());
				System.out.println(s.getTemperatura());
			}
			System.out.println("");
			for (String ss : set) {

				System.out.println(ss);
			}
			System.out.println("");
			System.out.print("** ");
			for (String ss : set2) {

				System.out.print(ss + " ");
			}
			System.out.print(" **");

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}
}
