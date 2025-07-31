package PracticaParciales;
//arreglo con secuencias 
// esas secuencias tiene elementos repetidos
//  Si hay mas de X elementos repetidos en una secuencia
//   comprimir secuencia
      // agregar la cantdad de elementos repetidos en negativo, seguido del elemento el cual se repite.
public class EjerciTipoparcial1 {
    final static int MAX = 21;
    final static int SEP = 0;
    final static int X = 3;

    public static void main(String[] args) {
        int [] arrPixeles = {0,67,67,67,67,67,67,67,67,0,14,0,33,33,33,33,0,0,5,98,0};
        mostrarArreglo(arrPixeles);
        int inicio = 0;
        int fin = -1;
        while(inicio<MAX){
            inicio = obtenerInicio(arrPixeles, fin+1);
            if(inicio<MAX){
                fin = obtenerFin(arrPixeles, inicio);
                fin = comPrimirSecuencias(arrPixeles, inicio, fin);
            }
        }
        System.out.println("");
        mostrarArreglo(arrPixeles);
    }
    public static int comPrimirSecuencias(int[] arrPixeles, int inicio, int fin) {
            int i = inicio;
            int valor = arrPixeles[i];
            int j = i+1;
            int contador = 1;   

            while(j<=fin && arrPixeles[j] == valor){
                contador++;
                j++;
            }  
            if(contador>X){
                arrPixeles[i]= -contador;
                arrPixeles[i+1]= valor;
                for (int k = 0 ; k < contador-2; k++) {
                corrimientoIzquierda(arrPixeles, i+2);
                } 
                fin = i+1;
            }
            return fin; 
    }  
      public static void corrimientoIzquierda(int[] arreglo, int ini) {       
        for (int i = ini; i < MAX -1; i++) {
            arreglo[i] = arreglo[i + 1];
        }

    }
     public static int obtenerInicio(int[] arrSec, int ini ){
        while (ini < MAX && arrSec[ini]==SEP) {
            ini++;
        }
        return ini;
    }
    public static int obtenerFin(int [] arrSec, int ini){
        while(ini < MAX && arrSec[ini]!=SEP){
            ini++;
        }
        return ini -1;
    }
    public static void mostrarArreglo(int [] arrEnteros){
        for(int i = 0; i < MAX; i++){
            System.out.print("|" + arrEnteros[i]);
        }
    }

}
