package Practica5;
/*Hacer un programa que dado un arreglo de enteros y un número
N, genere un arreglo con las posiciones donde se encuentra dicho
número. A continuación, multiplicar por un número M todas las
ocurrencias del número N en el arreglo original. */

 // dado un arreglo de enteros y un numero N 
   //generar un arreglo  con las posiciones donde se encuentra dicho numero
    //multiplicar por M todas las ocurriencias del numero N

public class Ejercicio_7 {
    final static int N = 5;
    final static int M= 4;
    final static int MAX = 10;
    public static void main(String[] args) {
        int []arrEnteos = {1,2,5,4,5,6,7,5,9,10};
        generarArreglo(arrEnteos);
        mostrarArreglo(arrEnteos);
       
    }
    public static void mostrarArreglo(int[] arreglo) {
        for(int pos = 0; pos<MAX ; pos++){
         System.out.print("|" + arreglo[pos]);
        }
     }
    public static void generarArreglo(int[] arrEnteos) {
        int cant =  cantidadN(arrEnteos);
        int [] arregloMod = new int[cant];

        int cantActual = 0;
        int pos = 0;
        while(cant > cantActual && pos <MAX){
            if (arrEnteos[pos]==N) {
                arregloMod[cantActual]= pos;
                cantActual++;
            }
            pos++;
        }
        multplicar(arrEnteos, arregloMod, cant);
    }
    public static void multplicar(int [] arrEnteos, int [] arregloMod, int cant) {//{1,2,3,4,5,6,7,8,9,10};  {5};
        
        for(int i = 0; i< cant; i++){
            arrEnteos[arregloMod[i]]*=M;
        }
    }
    public static int cantidadN(int[] arrEnteos) {
        int cant = 0; 
        for(int pos = 0; pos < MAX; pos++ ){
            if(arrEnteos[pos] == N){
                cant++;
            }
        }
        return cant;
    }

}
