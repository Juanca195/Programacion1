package Practica5;
/*Dado un arreglo de tamaño de arreglo MAX=20 de secuencias. En
    el caso de eliminar secuencias se debe hacer corrimiento.
23. Hacer un programa que devuelva la posición de inicio y fin de la
primera secuencia de números distinta de ceros.
 */
public class Ejercicio_23tp5 {
    final static int MAX = 20;

    public static void main(String[] args) {
        int [] arrSec = {0,1,2,3,0,0,7,8,9,0,4,5,6,7,0,0,12,13,0,20};

        buscarIincioFin(arrSec);
        mostrarArreglo(arrSec);
        
    }
    public static void buscarIincioFin(int [] arrSec){
        int inicio = 0; 
        int fin = -1;

        while(inicio < MAX && arrSec[inicio]==0){
            inicio = obtenerInicio(arrSec, fin+1);
            if(inicio < MAX ){
                fin = obtenerFin(arrSec, inicio);  
            }
            System.out.println("El inicio de la secuencia es  "  +inicio+  " el fin es " +fin);
        }  
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
    public static void mostrarArreglo(int [] arrSec){
        for(int i = 0; i < MAX; i++){
            System.out.print("|" + arrSec[i]);
        }
    }
}
