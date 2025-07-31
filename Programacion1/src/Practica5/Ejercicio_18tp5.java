package Practica5;
/*Hacer un programa que dado un arreglo de enteros de tamaño
10 que se encuentra precargado, solicite al usuario un número
entero y elimine la primera ocurrencia del número (un número
igual) en el arreglo (si existe). Para ello tendrá que buscar la
posición y si está, realizar un corrimiento a izquierda (queda una
copia de la última posición del arreglo en la anteúltima posición). */

 //Definir una constante para ele tamaño MAX 10
  //Definir el arreglo
   //pedir un numero entero 
    //Corroborar que el numero ingresado exista en el arreglo 
     // si existe eliminarlo 
      // sino indicar que no existe
public class Ejercicio_18tp5 {
    final static int MAX = 10; 

    public static void main(String[] args) {
        int[] enteros = {1,2,3,4,5,6,7,8,9,10};
        int numero = obtenerNumero();

        procesarArreglo(enteros, numero);
        mostrarArreglo(enteros);
    }
    public static void mostrarArreglo(int []enteros){
        for(int i = 0; i< MAX; i++){
            System.out.print("|" + enteros[i]);
        }
    }
    public static int obtenerNumero() {
        System.out.println("Ingrese un numero entero");
        int numero = Utils.leerInt();

        return numero;
    }
    public static void procesarArreglo(int [] enteros, int numero){
        int pos = obtenerPos(enteros, numero);
        if(pos < MAX && enteros[pos] == numero ){
            eliminarElemento(enteros, pos);
        }else  {
            System.out.println("no existe el numero");
        }
    }
    public static void eliminarElemento(int[] enteros, int pos) {
        for(int i = pos; i<MAX-1; i++){
            enteros[i]= enteros[i+1];
        }
    }
    public  static int obtenerPos(int[] enteros, int numero) {
        int posicion = 0;
         while ((posicion < MAX) && (enteros[posicion] != numero)){
            posicion++;
            }
        return posicion;
    }

}
