import java.util.Scanner;
import java.util.Hashtable;
import java.util.Set;
import java.util.*;
import java.io.*;

public class HashTable{

	public static void main(String[] args) throws Exception{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));
		Hashtable<String, String> hash = new Hashtable <String, String>();
		String line, line2;

		while((line2 = br2.readLine()) !=null){

			line = br.readLine();
			if(line2){
				hash.put(line, line2);
			}else{
				System.out.println(line + " : ----: " +"falta algo");
			}


		}
		for(String st : hash.keySet()){

			System.out.println(st + " : ---- : " + hash.get(st));
		}

	}


}02509827K<<<