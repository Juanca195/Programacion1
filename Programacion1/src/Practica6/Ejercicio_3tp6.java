package Practica6;

import Practica2.Utils;

/* Hacer un programa que dada una matriz de enteros de tamaño
5*10 que se encuentra precargada, solicite al usuario una posición
fila, columna y realice un corrimiento a izquierda.
 */
public class Ejercicio_3tp6 {
    final static int MAXFILA = 5; 
    final static int MAXCOLUMNA = 10;

    public static void main(String[] args) {
        int [][] matriz = { {1,2,3,4,5,6,7,8,9,10},
                            {11,12,13,14,15,16,17,18,19,20},
                            {21,22,23,24,25,26,27,28,29,30},
                            {31,32,33,34,35,36,37,38,39,40},
                            {41,42,43,44,45,46,47,48,49,50}};
        
        System.out.println("Ingrese una posicion de fila");
        int fila = Utils.leerInt();
        System.out.println("Ingrese una poscion de columna");
        int column = Utils.leerInt();

        eliminarPos(matriz[fila], column);
        mostrarArreglo(matriz);
    }
    public static void eliminarPos(int [] matriz, int column){
        for(int i = column; i<MAXCOLUMNA-1; i++){
            matriz[i]= matriz[i+1];
        }
        //matriz[column]=5;
    }
    public static void mostrarArreglo(int [][] matriz){
        for(int fila = 0; fila<MAXFILA; fila++){
            for(int column = 0; column<MAXCOLUMNA; column++){
                System.out.print("|" +matriz[fila][column]);
            }
            System.out.println("");
        }
    }
}
// if(elementoRepitos(arrPixeles, inicio, fin)){
                    //int cant_numeros = fin-inicio+1;
                    //int valor_inicial = arrPixeles[inicio];
                    //comprimirSec(arrPixeles, inicio, fin);
               // }//parte del codigo del ejecicio 1tipo parcial