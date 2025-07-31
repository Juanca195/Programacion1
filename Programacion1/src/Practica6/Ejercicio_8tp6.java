package Practica6;
/*Hacer un programa que dada una matriz de enteros ordenada
creciente por filas de tamaño 4*5 que se encuentra precargada,
solicite al usuario un número entero y una fila, y elimine la primera
ocurrencia de número en la fila indicada (un número igual) si
existe. 
 */
public class Ejercicio_8tp6 {
    final static int MAXFILA = 4, MAXCOLUMNA= 5;

    public static void main(String[]args){
        int [][] mat = {{1,2,3,4,5},
                        {6,7,8,9,10},
                        {11,12,13,14,15},
                        {16,17,18,19,20}};

        System.out.println("Ingreser un numero");
        int numero = Utils.leerInt();
        System.out.println("Ingrese una posicion de fila");
        int fila = Utils.leerInt();
        procesarMatriz(mat, numero, fila);
        mostrarMatriz(mat);
    }
    public static void procesarMatriz(int [][] mat, int numero, int fila){
        //int posfila = mat[fila];
        for(int i = 0; i < MAXFILA; i++){
            if(esOcurrencia(mat[i], numero)){
                eliminarOcurrencia(mat[i], fila);
            }
        }
    }
    public static void eliminarOcurrencia(int [] mat, int fila){
        for(int i = fila; i <MAXFILA-1; i++){
            mat[i] = mat[i+1];
        }
    }
    public static boolean esOcurrencia(int [] fila,int numero){
        boolean esOcurrencia = false;
        for(int i = 0; i <MAXFILA; i++){
            if(numero == fila[i]){
                esOcurrencia = true;
            }
        }
        return esOcurrencia;
    }
    public static void mostrarMatriz(int [][] matriz){
        for(int fila = 0; fila <MAXFILA; fila++){
            for(int column = 0; column<MAXCOLUMNA; column++){
                System.out.print( "|" +matriz[fila][column]);
            }
            System.out.println();
        }
    }
}
