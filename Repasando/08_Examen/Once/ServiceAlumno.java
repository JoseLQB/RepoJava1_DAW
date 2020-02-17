import java.util.Set;
import java.util.HashSet;
import java.util.HashMap;
import java.io.BufferedReader;
import java.io.FileReader;

public class ServiceAlumno {
	private HashMap<String,String> alumnos;

	public HashMap<String,String> getAlumnos() { 
		return alumnos; 
	}

	public void setAlumnos(HashMap<String,String> unHash) {
		this.alumnos = unHash;
	}


	public ServiceAlumno() throws Exception {
		alumnos = new HashMap<String,String>();
		String line;
		try (BufferedReader br = new BufferedReader(new FileReader("fileAlumnos.txt"))) {

			while((line = br.readLine())!= null){
				
				String parts[] = line.split(":");
				alumnos.put(parts[0], parts[1]);

			}
	
		}
		catch (Exception ex) {
		 ex.printStackTrace(); 
		}
	}

}
