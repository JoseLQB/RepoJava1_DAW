//  Pon tú el objetivo de este programa.
//--Si introducimos una cadena de caracteres devuelve esta misma convirtiendo las minúsculas en mayúsculas
//--Si introducimos un entero o varios, nos devuelve la suma de estos
public class Punto3dgeneral1 {
   public static void main(String[] args) {
     int r = 0;
     for(String st : args) {
       if(st.matches("-?\\d+")) {//expresión regular que se refiere a cualquier entero
                                  //puede contener 0 o 1 - y varios dígitos
         int unEntero = Integer.parseInt(st);
         r += unEntero;
       }
       else {
         String stMay = st.toUpperCase();
         System.out.println(stMay);
       }
     }
     System.out.println(r);
   }
}
