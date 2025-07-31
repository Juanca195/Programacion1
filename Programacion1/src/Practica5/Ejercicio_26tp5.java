package Practica5;
/*Hacer un programa que devuelva la posición de inicio y de fin
de la secuencia de mayor tamaño.
 */
  // buscar inicio y fin 
   //de la secuencia de mayor tamaño;
   // tamaño de secuencia fin-ini+1

public class Ejercicio_26tp5 {
    final static int MAX = 20;

    public static void main(String[] args) {
        int [] arrSec = {0,4,6,8,7,0,7,11,10,0,4,5,6,9,10,0,12,13,0,0};

        procesarArreglo(arrSec);
    }
    public static void procesarArreglo(int [] arrSec){
        int inicio = 0; 
        int fin = -1;
        
        int finMayorsec = -1;
        int inicioMayorsec= -1;
        int mayorTamanio = -1;//Le damos un tamaño por el cual empezar
    
        while(inicio<MAX){
            inicio = obtenerInicio(arrSec, fin+1);
            if (inicio<MAX) {
                fin = obtenerFin(arrSec, inicio);
                int tamañoActual = fin-inicio+1;
                if(tamañoActual > mayorTamanio){//si tamañoactual es mayor a mayortamaño, mayortamaño se vuelve tamañoactual;
                    mayorTamanio= tamañoActual;
                    inicioMayorsec = inicio;//Guarda el inicio de la mayor secuencia
                    finMayorsec = fin;// guarda el fin de la mayor secuencia, hababalando del tamaño;
                }
            }
        }
        System.out.println("El inicio de mayor tamaño es: " +inicioMayorsec+ " el fin de mayor tamaño es: " + finMayorsec );
    }
    public static int obtenerInicio(int [] arrSec, int ini){
        while(ini< MAX && arrSec[ini]==0){
            ini++;
        }
        return ini;
    }
    public static int obtenerFin(int [] arrSec, int ini){
        while(ini < MAX && arrSec[ini]!=0){
            ini++;
        }
        return ini-1;
    }
}
