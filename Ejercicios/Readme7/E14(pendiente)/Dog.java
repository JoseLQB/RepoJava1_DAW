public class Dog {
	static public enum BREED {
		PUG, SRD, BULLDOG
	}

	private BREED breed;
	private String name;
	private Integer weight;

	public Dog(String s, Integer i, BREED r) {
		this.name = s;
		this.breed = r;
		this.weight = i;
	}

	public BREED getBreed() {
		return breed;
	}

	public String getName() {
		return name;
	}

	public Integer getWeight() {
		return weight;
	}
}
