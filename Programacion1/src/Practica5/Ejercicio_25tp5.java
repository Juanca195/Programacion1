package Practica5;
/*Hacer un programa que devuelva la posición de inicio y fin de la
anteúltima secuencia de números distintos de ceros. */
  // buscar inicio y fin 
   //de la anteultima secuencia 
    //

public class Ejercicio_25tp5 {
    final static int MAX = 20; 

    public static void main(String[] args) {
        int [] arrSec = {0,4,6,8,0,0,7,11,10,0,4,5,6,15,0,0,12,13,0,0};

        procesarArreglo(arrSec);
    }
    public static void procesarArreglo(int [] arrSec){
        int inicio = 0;
        int fin=-1;
        int iniUltimaSec= -1;
        int finUltimaSec = -1;
        int inianteUtimaSec = -1;
        int finanteUltimaSec = -1;

        while(inicio<MAX){
            inicio = obtenerInicio(arrSec, fin+1);
            if (inicio<MAX) {
                fin = obtenerFin(arrSec, inicio);
                    inianteUtimaSec = iniUltimaSec;
                    finanteUltimaSec = finUltimaSec;
                    iniUltimaSec = inicio;
                    finUltimaSec = fin;
            }
        }
        System.out.println("El inicio de la ante ultima secuencia es: " +inianteUtimaSec+ " el finde la anteultima secuencia es: " +finanteUltimaSec);
    }
    public static int obtenerInicio(int [] arrSec, int ini){
        while(ini < MAX && arrSec[ini]==0){
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
