package Practica6;
/*Hacer un programa que dada una matriz de enteros de tamaño
4*5 que se encuentra precargada, solicite al usuario el ingreso de
una fila y dos números enteros (columnas de la matriz), y ordene
de forma creciente la matriz en la fila indicada entre las dos
posiciones columnas ingresadas. */
public class Ejercicio_9tp6 {
    final static int MAXFILA = 4, MAXCOLUMNA= 5;

    public static void main(String[]args){
        int [][] mat = {{1,2,3,4,5},
                        {6,7,8,9,10},
                        {11,12,13,14,15},
                        {16,17,18,19,20}};
        System.out.println("Ingrese una posicion de fila");
        int fila = Utils.leerInt();
        System.out.println("Ingreser un numero que van a ser columnas");
        int numero = Utils.leerInt();
        System.out.println("Ingreser otro numero");
        int numero2= Utils.leerInt();
        
        //procesarMatriz(mat, numero, fila);
        //mostrarMatriz(mat);
    }
}
