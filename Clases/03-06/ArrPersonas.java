
public class ArrPersonas {

	public static void main(String[] args) {
		//variables de clase
		Person p1 = new Person();
		Person p2 = new Person("zoraida", "Ave Maria Purisima 18");
		Person[] ar = new Person[20];
		ar[0] = new Person("Juan", "Av la Paz 23, 3A");
		
		//System.out.println(Person.getContadorDeInstancias());
		System.out.println(Person.contadorDeInstancias);
	}

}
