package Practica5;
/*Hacer un programa que reemplace de un arreglo A todas las
ocurrencias de una secuencia patrón dada en un arreglo P, por la
secuencia contenida en el arreglo R de igual tamaño. */
    
public class Ejercicio_30tp5 {
    final static int MAX = 20;
    final static int MAXR = 2;
    final static int SEPARADOR = 0;

    public static void main(String[] args) {
        int [] arrA = {0,4,6,8,7,0,7,11,10,0,4,5,6,9,10,0,12,13,0,0};
        int [] arrP = {12,13};
        int [] arrR = {9,3};
         
        System.out.println("Arreglo sin modificar");
        mostrarArreglo(arrA);
        reemplazarEnA(arrA,arrP,arrR);
        System.out.println("Arreglo modificado");
        mostrarArreglo(arrA);
    }
    public static void reemplazarEnA(int [] arrA, int[] arrP, int [] arrR){
        int inicio = 0;
        int fin = -1;
        
        while(inicio< MAX){
            inicio = obtenerInicio(arrA, fin+1);
                if(inicio< MAX){
                    fin = obtenerFin(arrA, inicio);
                    if (esIgualSecuencia(arrA,inicio, fin, arrP)) {
                        reemplazarSec(arrA, inicio, fin, arrR);
                    }
                    
                }
        }
    }
     public static void reemplazarSec(int[] arrA, int inicio, int fin, int[] arrR){
        int posR = 0;
        for(int i = inicio; i<=fin; i++){
            arrA[i]= arrR[posR];
            posR++;
        }
        
     } 

     public static boolean esIgualSecuencia(int[] arrA, int inicio, int fin, int[] arrP) {
        int tamañoSec = fin - inicio + 1;
        boolean esIgual = true;

        if(tamañoSec == MAXR){
            int pos = inicio;
            int posP = 0;
            while (pos<=fin && esIgual) {
                if(arrA[pos]!=arrP[posP]){
                    esIgual = false;
                    pos++;
                    posP++; 
                }
            }
        }
        else esIgual = false;

        return esIgual;
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
    public static void mostrarArreglo(int [] arreglo){
        for(int i = 0; i < MAX; i++){
            System.out.print("|" +arreglo[i]);
        }
    } 
}
