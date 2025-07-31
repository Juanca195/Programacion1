package Practica6;
/*  Hacer un programa que dada una matriz de enteros de tamaño
5*10 que se encuentra precargada, solicite al usuario un número
entero y elimine todas las ocurrencia de número en la matriz si
existe. Mientras exista (en cada iteración tiene que buscar la
posición fila y columna) tendrá que usar dicha posición para
realizar un corrimiento a izquierda (quedarán tantas copias de la
última posición de cada fila como cantidad de ocurrencias del
número). Tener en cuenta, como se hizo en arreglos, si el
elemento a eliminar es el último de alguna fila de la matriz.
 */
public class Ejercicio_6tp6 {
     final static int MAXFILA = 5, MAXCOLUMNA=10;
     public static void main(String[]args){
        int [][] mat = {{1,2,3,4,5,6,7,8,9,10},
                        {11,12,13,14,15,16,17,18,19,20},
                        {21,22,23,23,23,26,27,28,29,30},
                        {31,32,33,34,35,35,35,38,39,40},
                        {41,42,43,44,45,46,47,48,49,50}};
        System.out.println("Ingrese un numero");
        int numero = Utils.leerInt();
        compararNumeroconPos(mat, numero);
        mostraMatriz(mat);
     }
     public static void compararNumeroconPos(int [][] mat, int numero){
        for(int fila = 0; fila <MAXFILA; fila++){
            for(int column =0; column<MAXCOLUMNA; column++){
             if(mat[fila][column]==numero){
                eliminarNumero(mat[fila], column);
                }
            }
        }
    }
   
    private static void eliminarNumero(int[] mat, int column) {
        for(int pos = column; pos < MAXCOLUMNA-1; pos++){
            mat[pos] = mat[pos+1];
        }
    }
    public static void mostraMatriz(int [][] matriz){
        for(int fila = 0; fila<MAXFILA; fila++){
            for(int column = 0; column<MAXCOLUMNA; column++){
                System.out.print("|" + matriz[fila][column]);
            }
            System.err.println("");
        }
    }
}
