package Practica5;
/*Hacer un programa que dado un número N ingresado por el
usuario, elimine las secuencias de tamaño N de números distintos
de cero. */

import Practica3.Utils;

//Ingresar un numero que va indicar el tamaño de la secuencia 
 //buscamos el inicio y fin 
  //definimos el tamaño de la secuencia 
   // comparamos el tamaño con el numero ingresado N
    //eliminar las secuencias de tamaño N distintos de cero
        // actulizamos el fin;
   
public class Ejercicio_27tp5 {
    final static int MAX = 20;
    final static int SEPARADOR = 0;

    public static void main(String[] args) {
        int [] arreglo = {0,1,2,3,0,0,6,7,0,2,4,8,9,0,2,0,11,12,10,0};
        System.out.println("Ingrese un numero");
        int numero = Utils.leerInt();

        mostrarArreglo(arreglo);
        int inicio = 0; 
        int fin = -1;
        int tamaño = 0;

        while (inicio<MAX) {
            inicio = obtenerInicio(arreglo, fin+1);
            if(inicio<MAX){
                fin = obtenerFin(arreglo, inicio);
                tamaño = fin - inicio + 1;

                if (tamaño == numero) {
                        eliminarSecuencia(arreglo, inicio, fin);
                        //MODIFICAR EL FIN
                        fin = inicio; 
                }
            }
        }
        System.out.println();
        System.out.println("Arreglo moficado");
        mostrarArreglo(arreglo);
    }
    public static void mostrarArreglo(int [] arreglo){
        for(int i = 0; i < MAX; i++){
            System.out.print("|" +arreglo[i]);
        }
    }
    public static int obtenerInicio(int[] arreglo, int pos){
        while (pos<MAX && arreglo[pos]==SEPARADOR) {
            pos++;
        }
        return pos;
    }
    public static int obtenerFin(int [] arreglo, int pos){
        while (pos<MAX && arreglo[pos]!=SEPARADOR) {
            pos++;
        }
        return pos-1;
    }
    public static void eliminarSecuencia(int [] arreglo, int ini, int fin){
        for(int i = ini; i<= fin; i++){// i sirve solo para contar la cantidad de elimininaciones
            corrimientoAIzquierda(arreglo, ini);
        }
    }
    public static void corrimientoAIzquierda(int [] arreglo, int pos){
        for(int i = pos; i<MAX-1; i++){
            arreglo[i] = arreglo[i+1];
        }
    }

}
