package Practica6;
/* Hacer un programa que dada una matriz de enteros de tamaño
5*10 que se encuentra precargada, solicite al usuario un número
entero y una posición fila, columna. Con estos datos tendrá que
realizar un corrimiento a derecha (se pierde el último valor en
dicha fila) y colocar el número en la matriz en la posición fila,
columna indicada.
 */
public class Ejercicio_4 {
    final static int MAXFILA = 5, MAXCOLUMNA = 10;

    public static void main(String[]args){
        int [][] matriz= { {1,2,3,4,5,6,7,8,9,10},
                            {11,12,13,14,15,16,17,18,19,20},
                            {21,22,23,24,25,26,27,28,29,30},
                            {31,32,33,34,35,36,37,38,39,40},
                            {41,42,43,44,45,46,47,48,49,50}};
        System.out.println("Ingrese una posicion de fila");
        int fila = Utils.leerInt();
        System.out.println("Ingreser una posicion de columna");
        int column = Utils.leerInt();
        System.out.println("Ingreser un numero");
        int numero = Utils.leerInt();
        corrimientoEinsercion(matriz[fila], column,numero);
        mostrarMatriz(matriz);
    }
    public static void corrimientoEinsercion(int [] matriz, int column,int numero){
        for(int i = MAXCOLUMNA-1; i > 0; i--){
            matriz[i]= matriz[i-1];
        } 
        matriz[column] = numero;
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
