//Itroduce nmeros por argumentos en línea de cdo y mostar la suma


public class Punto3dgeneral {
   public static void main(String[] args) {
     int r = 0;
     for(String st : args) {
       int unEntero = Integer.parseInt(st);
       r += unEntero;
     }
     System.out.println(r);
   }
}
