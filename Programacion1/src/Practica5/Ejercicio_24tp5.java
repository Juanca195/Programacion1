package Practica5;
/*Hacer un programa que devuelva la posición de inicio y fin de la
secuencia de números distintos de ceros cuya suma del contenido
sea mayor. */
        //buscar el inicio y fin de la secuencia distinto de ceros
            // sumar el contenido de dicha secuencia 
             //comparar si esa suma es la mayor del arreglo de secuencias
               //Mostrar el dicho arreglo y mayor suma
public class Ejercicio_24tp5 {
    final static int MAX = 20;
    final static int SEPARADOR = 0;

    public static void main(String[] args) {
        int[] arrSec = {0,1,2,3,0,0,7,8,9,0,4,5,6,7,0,0,12,13,0,20};

        procesarArreglo(arrSec);
        mostrarArreglo(arrSec);
    }

    public static void mostrarArreglo(int[] arrSec) {
        for(int i = 0; i< MAX; i++){
            System.out.print("|" + arrSec[i]);
        }
    }

    public static void procesarArreglo(int[] arrSec) {
        int inicio = 0; 
        int fin = -1;
        int suma = 0;
        int mayorActual = 0;
        int inicioMayorsec =-1;
        int finMAyorsec = -1;

        while(inicio<MAX){
            inicio = obtenerInicio(arrSec, fin+1);
            if(inicio<MAX){
                fin = obtenerFin(arrSec, inicio);
                suma = obtenerSuma(arrSec, inicio, fin);
                if(suma >mayorActual){
                    mayorActual = suma;
                    inicioMayorsec = inicio;
                    finMAyorsec = fin;
                }
            }
        }
        System.out.println(" inicion secMayor " +inicioMayorsec+ " fin mayor " +finMAyorsec+ " Suma mayor " +mayorActual );

       
    }
    public static int obtenerInicio(int[] arrSec, int ini ){
        while (ini < MAX && arrSec[ini]==0) {
            ini++;
        }
        return ini;
    }
    public static int obtenerFin(int [] arrSec, int ini){
        while(ini < MAX && arrSec[ini]!=0){
            ini++;
        }
        return ini -1;
    }
    public static int obtenerSuma(int [] arrSec, int ini, int fin){
        int suma = 0;
        for(int i = ini; i<=fin; i++){
            suma += arrSec[i];
        }
        return suma;
    }
}
