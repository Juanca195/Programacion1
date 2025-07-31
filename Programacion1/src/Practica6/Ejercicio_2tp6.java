package Practica6;
/*Hacer un programa que dada una matriz de enteros de tamaño
5*10 que se encuentra precargada, obtenga la cantidad de
números pares que tiene y la imprima.
 */
public class Ejercicio_2tp6 {
    final static int MAXFILA = 5; 
    final static int MAXCOLUMNA = 10;

    public static void main(String[]args){
        int [][] matriz = { {1,2,3,4,5,6,7,8,9,10},
                            {11,12,13,14,15,16,17,18,19,20},
                            {21,22,23,24,25,26,27,28,29,30},
                            {31,32,33,34,35,36,37,38,39,40},
                            {41,42,43,44,45,46,47,48,49,50}};
    System.out.println("Matriz");
    mostrarMatriz(matriz);
    int contador = contarPares(matriz); 
    System.out.println("La cantidad de pares es: " +contador);
    }
    public static int contarPares(int [][] mat){
        int contador =0;
        for(int fila =0; fila <MAXFILA; fila++){
            for(int colum = 0; colum<MAXCOLUMNA; colum++){
                if(mat[fila][colum] % 2 ==0){
                    contador++;
                }
            }
        }
        return contador;
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
