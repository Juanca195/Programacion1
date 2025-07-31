package Practica5;
/*Hacer un programa que elimine de un arreglo todas las
secuencias que tienen orden descendente entre sus elementos.
 */  
    //Definir el arreglo de secuencias 
     //Buscar el inici y fin de secuencias 
      //Verrificar cuales se encuentran el orden desendente
       //eliminar esas secuencias 
        // actualizar el fin 
public class Ejercicio_29tp5 {
    final static int MAX = 20;
    final static int SEPARADOR = 0; 
    public static void main(String[] args) {
        int [] arreglo = {0,3,2,1,0,0,8,7,0,2,4,8,9,0,2,0,12,11,10,0}; 

        int inicio = 0;
        int fin = -1;
        
        while(inicio< MAX){
            inicio = obtenerInicio(arreglo, fin+1);
                if(inicio< MAX){
                    fin = obtenerFin(arreglo, inicio);
                    if (ordenDesendente(arreglo,inicio, fin)) {
                        eliminarSecuencia(arreglo, inicio, fin);
                        fin= inicio;
                    }
                    
                }
        }
        mostrarArreglo(arreglo);
    }
    public static void mostrarArreglo(int [] arreglo){
        for(int i = 0; i < MAX; i++){
            System.out.print("|" +arreglo[i]);
        }
    }
    private static boolean ordenDesendente(int[] arreglo, int inicio, int fin) {
        boolean esDesendete = true;
        for(int i = inicio; i< fin; i++){
            if(arreglo[i] <= arreglo[i+1]){
                esDesendete = false;
            }
            else{
                esDesendete = true;
            }
        }
        return esDesendete ; 
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

}
