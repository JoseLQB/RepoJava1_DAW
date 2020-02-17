
public class Person {

	private String name;
	private String address;
	
	//private static int contadorDeInstancias = 0;
	public static int contadorDeInstancias = 0;

	public Person() {
		contadorDeInstancias ++;
	}
	public Person(String name, String address) {
	
		this.name = name;
		this.address = address;
		contadorDeInstancias ++;
	}
	public static int getContadorDeInstancias() {//obligatoriamente es static
		return contadorDeInstancias;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	//Atributo de clase, contador instancias
	

}
