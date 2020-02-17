
public class Person {

	private String name;
	private String gender;
	private int age;
	private int weight;
	private String eyeColor;

	public Person() {

		contadorDeInstancias++;

	}

	// private static int contadorDeInstancias = 0;
	public static int contadorDeInstancias = 0;

	public static int getContadorDeInstancias() {// obligatoriamente es static
		return contadorDeInstancias;
	}

	public Person(String name, String gender, int age, int weight, String eyeColor) {
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.weight = weight;
		this.eyeColor = eyeColor;
		contadorDeInstancias++;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public String getEyeColor() {
		return eyeColor;
	}

	public void setEyeColor(String eyeColor) {
		this.eyeColor = eyeColor;
	}

}
