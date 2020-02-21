public class Person {

	private String nombre;
	private String direccion;
	private String telefono;
	private String movil;

	public Person() {
	}

	public Person(String nombre, String direccion, String telefono, String movil) {

		this.nombre = nombre;
		this.direccion = direccion;
		this.telefono = telefono;
		this.movil = movil;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getMovil() {
		return movil;
	}

	public void setMovil(String movil) {
		this.movil = movil;
	}
	

}
