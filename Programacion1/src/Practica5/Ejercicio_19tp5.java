package Practica5;
/*Hacer un programa que dado un arreglo de enteros de tamaño
10 que se encuentra precargado, solicite al usuario un número
entero y elimine todas las ocurrencia de número en el arreglo.
Mientras exista (en cada iteración tiene que buscar la posición
dentro del arreglo) tendrá que usar la posición para realizar un
corrimiento a izquierda (quedarán tantas copias de la última
posición del arreglo como cantidad de ocurrencias del número). */


public class Ejercicio_19tp5 {
    final static int MAX = 10; 

    public static void main(String[] args) {
        int [] arr = {2,3,4,5,7,7,7,8,9,9};
        int numero = obtenerNumero();

        procesarArreglo(arr, numero);
        mostrarArreglo(arr);
    }
    public static void mostrarArreglo(int[] arr) {
        for(int i = 0; i< MAX; i++){
            System.out.print("|" + arr[i]);
        }
    }
    public static int obtenerNumero() {
        System.out.println("Ingrese un numero entero");
        int numero = Utils.leerInt();

        return numero;
    }
    public static void procesarArreglo(int [] arr, int numero){
        for(int i = 0; i < MAX; i++){
            int pos = obtenerPos(arr, numero);
            eliminarOcurrencias(arr, pos);
        }
    }
    public static void eliminarOcurrencias(int[] arr, int pos) {
        for(int i = pos; i<MAX-1; i++){
            arr[i] = arr[i+1];
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
