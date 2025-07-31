package Practica5;
/*Hacer un programa que elimine de un arreglo todas las
ocurrencias de una secuencia patrón dada por otro arreglo.
 */
  //Defini un arreglo de secuencias 
   // definir una secuencia patron
     //buscar inicio y fin de las secuencias 
       // comparar la secuencia con el patron
         //eliminar la secuencia 
          // actualizar el fin

public class Ejercicio_28tp5 {
    final static int MAXA = 20;
    final static int MAXP = 4;
    final static int SEPARADOR = 0; 


    public static void main(String[] args) {
        int [] arreglo = {0,1,2,3,0,0,6,7,0,2,4,8,9,0,2,0,11,12,10,0}; 
        int [] patron = {2,4,8,9}; 

        mostrarArreglo(arreglo);
        System.out.println();
        procesarArreglos(arreglo, patron);
        System.out.println("Arreglo modificado");
        mostrarArreglo(arreglo);
    }
    public static void mostrarArreglo(int [] arreglo){
        for(int i = 0; i < MAXA; i++){
            System.out.print("|" +arreglo[i]);
        }
    }
    public static void procesarArreglos(int [] arreglo, int [] patron){
        int inicio = 0;
        int fin = -1;
        
        while(inicio< MAXA){
            inicio = obtenerInicio(arreglo, fin+1);
                if(inicio< MAXA ){
                    fin = obtenerFin(arreglo, inicio);
                    if(patroIgual(arreglo, patron, inicio, fin)){
                        eliminarSecuencia(arreglo, inicio, fin);
                        fin= inicio;
                    }
                }
            }
    }
    public static boolean patroIgual(int[] arreglo, int[] patron, int inicio, int fin) {
        for(int i = inicio; i <= fin; i++){
            boolean encontrado = false; 
            for(int j = 0; j < MAXP; j++){
              if(arreglo[i]==patron[j]){
                encontrado = true;
              }
            }
            if(!encontrado){
              return false;
            }
        }
        return true;
    }
    public static void eliminarSecuencia(int [] arreglo, int ini, int fin){
        for(int i = ini; i<= fin; i++){// i sirve solo para contar la cantidad de elimininaciones
            corrimientoAIzquierda(arreglo, ini);
        }
    }
    public static void corrimientoAIzquierda(int [] arreglo, int pos){
        for(int i = pos; i<MAXA-1; i++){
            arreglo[i] = arreglo[i+1];
        }
    }
    public static int obtenerInicio(int[] arreglo, int pos){
        while (pos<MAXA && arreglo[pos]==SEPARADOR) {
            pos++;
        }
        return pos;
    }
    public static int obtenerFin(int [] arreglo, int pos){
        while (pos<MAXA && arreglo[pos]!=SEPARADOR) {
            pos++;
        }
        return pos-1;
    }   

}
