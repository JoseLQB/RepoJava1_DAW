
public class ArrMulti {

	public static void main(String[] args) {
		
		int [][] a = new int [2][4];
		
		a[1][2]=8;
		
		for(int i = 0; i<2; i++) {
		for(int j = 0; j<4; j++) {
		a[i][j]=0;
		System.out.print(a[i][j] + "|");
		}
		System.out.println();
	}

}
}