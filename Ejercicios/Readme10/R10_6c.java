import java.util.Scanner;

public class R10_6c{

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String arr[] = new String [4];
		String input;
		int i =0;

		while((sc.hasNext()) && i <=3){
			input = sc.nextLine();
			arr[i] = input;
			i++;
			

		}
		for(String st : arr){
			if(i>0){
				System.out.println(st);
				i--;
			}
		}
	}
}