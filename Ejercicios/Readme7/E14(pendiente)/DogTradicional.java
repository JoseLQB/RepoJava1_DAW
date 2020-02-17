
public class DogTradicional {

	public static void main(String[] args) {
		
		Dog d = new Dog(null, null, null);
		
		if(d.getBreed().equals("BULLDOG") && (d.getWeight()>5)){
			
			System.out.println(d.getName());
			
		}
		
	}

}
