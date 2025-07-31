package Practica5;
/*  Hacer un programa que determine si los valores almacenados en
un arreglo de enteros se encuentran en orden ascendente. */

  //determinar un arreglos de enteros
   //ver si esta en orden ascendente


public class Ejercicio_8tp5 {
    final static int MAX = 10;
    public static void main(String[] args) {
        int [] arrEnteros = {2,4,6,8,10,12,14,16,18,20};
        ordenDelarreglo(arrEnteros);
        mostrarArreglo(arrEnteros);
    }
    public static void ordenDelarreglo(int[] arrEnteros) {
        for(int i = 0; i < MAX-1; i++){
            if(arrEnteros[i] > arrEnteros[i +1]){
                System.err.println("Esta en orden descendente");
            }
        }
        System.out.println("Esta en orden ascendente");
    }
    public static void mostrarArreglo(int[] arreglo) {
        for(int pos = 0; pos<MAX ; pos++){
         System.out.print("|" + arreglo[pos]);
        }
     }
}
