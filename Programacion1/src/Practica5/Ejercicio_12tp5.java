package Practica5;
/*Dado dos arreglos de números enteros: un arreglo A de tamaño
MAXA y un arreglo B de tamaño MAXB con números entre 0 y
MAXA-1, determinar la suma de los elementos del arreglo A cuyas
posiciones son indicadas por el arreglo B. Por ejemplo, dado
A={3,6,31,9}, MAXA=3 y B={0,2} con MAXB=2 el sistema deberá
informar: 34 (lo cual es el resultado de sumar el 3 de la posición 0
y el 31 de la posición 2 del arreglo A).
13. Dado un arreglo de caracteres d */

   //b[0] == 0
   //a[0] == 3
   //sukma+= a[b[i]]
public class Ejercicio_12tp5 {
   final static int MAXA = 5;
   final static int MAXB = 3;

   public static void main(String[] args) {
      int [] A = {2,4,6,7,9};
      int [] B = {6,5,4};

      sumarArreglos(A, B);
   }

   public static void sumarArreglos(int[] a, int[] b) {
      int suma = 0;
      for(int i = 0; i< MAXB; i++){
         int pos = buscarPosA(a, i);
         b[i+pos]= suma;
         //suma+=pos;
      }
      System.err.println("La suma es: " +suma);
   }

   public static int buscarPosA(int[] a, int i) {
      int pos = 0;
      while ((pos < MAXA) && (a[pos] != i)){
         pos++;
         }
        
      return pos;
   }

}
