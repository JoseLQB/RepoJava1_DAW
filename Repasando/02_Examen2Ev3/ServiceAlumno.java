import java.util.HashSet;
import java.util.HashMap;
import java.io.BufferedReader;
import java.io.FileReader;

public class ServiceAlumno {
	private HashMap<String, String> alumnos;

	public HashMap<String, String> getAlumnos() {
		return alumnos;
	}

	public void setAlumnos(HashMap<String, String> unHash) {
		this.alumnos = unHash;
	}

	public ServiceAlumno() throws Exception {
		alumnos = new HashMap<String, String>();
		try (BufferedReader br = new BufferedReader(new FileReader("fileAlumnos.txt"))) {

			String linea = br.readLine();
		    while(linea != null) {
		    	String[] parts = linea.split(":");
		    	String al = parts[1];
		        alumnos.put(al, "c");
			
			
		    }
			

		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}