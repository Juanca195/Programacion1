package Practica6;
/* Hacer un programa que dada una matriz de enteros ordenada
creciente por filas de tamaño 4*5 que se encuentra precargada,
solicite al usuario un número entero y una fila, y luego inserte el
número en la matriz en la fila indicada manteniendo su orden.
 */
public class Ejercicio_7tp6 {
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
        int posF=0;
        for(int i = fila; i< MAXFILA; i++ ){
            posF = buscarposOrdenada(mat[fila]);
            corrimientoEinsercion(mat[fila], numero,posF);
        }
    }
    public static int buscarposOrdenada(int [] arr){
        int pos = 0; 
        while(pos < MAXFILA && arr[pos]<arr[pos+1]){
            pos++;
        }
        return pos;
    }
    public static void corrimientoEinsercion(int [] mat, int numero, int pos ){
        for(int i = MAXFILA-1; i > pos; i--){
            mat[i]= mat[i-1];
        } 
        mat[pos] = numero;
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
