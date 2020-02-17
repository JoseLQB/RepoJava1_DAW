package repasoJava;

public class Telephone{
	
	private String tecla;
	private String cable;
	private int numero;

	public Telephone(String tecla, String cable, int numero) {
		super();
		this.tecla = tecla;
		this.cable = cable;
		this.numero = numero;
	}

	public Telephone() {
		// TODO Auto-generated constructor stub
	}

	public String getTecla() {
		return tecla;
	}

	public void setTecla(String tecla) {
		this.tecla = tecla;
	}

	public String getCable() {
		return cable;
	}

	public void setCable(String cable) {
		this.cable = cable;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	
}
//Solo muestra los datos que nunca han sido repetidos y los graba en fichero
