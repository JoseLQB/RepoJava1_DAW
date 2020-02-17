public class Coches implements  Vehiculo{

	private String marca;

	public Coches(){
	}

	public Coches(String marca){
		this.marca = marca;
	}

	public void setMarca(String marca){
		this.marca = marca;
	}

	public String getMarca(){

		return marca;
	}

	public void arrancar(){

		System.out.println("run, run");
	}
}