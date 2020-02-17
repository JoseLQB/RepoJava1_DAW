public class ProbandoInterface{

	public static void main(String[] args) {
	
	Coches c = new Coches();
	hacerArrancar(c);
	}
	public static void hacerArrancar(Vehiculo v){

		v.arrancar();
	}
}