package Practica5;
/*Implementar un método que realice un corrimiento a derecha
en un arreglo ordenado de tamaño MAX=10 a partir de una
posición. */

import Practica3.Utils;

public class Ejercicio_15 {
    final static int MAX=10;

    public static void main(String[] args) {
        int[] arrEnteros = {6,7,8,9,10,11,12,13,14,15};

        System.out.println("Ingrese una posicion");
        int pos = Utils.leerInt();

        correrDerecha(arrEnteros, pos);
        mostrarArreglo(arrEnteros);

        
    }

    public static void correrDerecha(int[] arrEnteros, int pos) {
        for(int i = MAX-1; i>pos; i--){
            arrEnteros[i] = arrEnteros[i-1];
        }
        //arrEnteros[] = pos;
    }

    private static void mostrarArreglo(int[] arrEnteros) {
        for(int i = 0; i < MAX; i++){
            System.out.print("|"  + arrEnteros[i]);
        }
    }

}
