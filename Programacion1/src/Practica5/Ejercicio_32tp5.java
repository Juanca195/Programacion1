package Practica5;
/*Se tiene un arreglo de enteros de tamaño 20 de secuencias de
números entre 1 y 9, separadas por 0. El arreglo está precargado,
y además empieza y termina con uno o más separadores 0. Hacer
un programa que permita obtener a través de métodos la posición
de inicio y la posición de fin de la secuencia ubicada a partir de
una posición entera ingresada por el usuario. Finalmente, si
existen imprima por pantalla ambas posiciones obtenidas.
 */
        //HACER CONSULTA: Resuelto
import Practica3.Utils;

public class Ejercicio_32tp5 {
    final static int MAX = 20;
    final static int SEPARADOR = 0;

    public static void main(String[]args){
        int[] arreglo = {0,1,2,3,4,0,0,0,5,6,0,0,0,7,8,9,0,0,0,0};

        System.out.println("Imgrese un numero");
        int numero = Utils.leerInt();

        procesarArrglo(arreglo, numero);
    }
    public static void procesarArrglo(int [] arreglo, int numero){
        int inicio = 0; 
        int fin = -1;

        if(numero !=0){
            inicio = obtenerInicio_izqui(arreglo, numero);  //buscamos el inicio a partir del numero ingresado, 
            fin = obtenerFin(arreglo, inicio);                       //teniendo en cuenta que la posicion este en el medio de la secuencia.
            System.out.println("Las posiciones son inicio " +inicio+ " | fin "   +fin);
        }else{
            inicio = obtenerInicio(arreglo,numero);
            if(inicio<MAX){
                fin = obtenerFin(arreglo, inicio);
                System.out.println("Las posiciones son: " +inicio+ " |" +fin);
            }else{
                System.out.println("No esxiste ninguna secuencia despues de la psosicon que ingresaste");
            }
        }
        
    }
    public static int obtenerInicio(int[] arreglo, int pos){
        while (pos<MAX && arreglo[pos]==SEPARADOR) {
            pos++;
        }
        return pos;
    }
    public static int obtenerInicio_izqui(int [] arreglo, int pos){
        while( pos < MAX && arreglo[pos-1]!=SEPARADOR){
            pos--;
        }
        return pos;
    }
    public static int obtenerFin(int [] arreglo, int pos){
        while(pos < MAX && arreglo[pos]!=SEPARADOR){
            pos++;
        }
        return pos-1;
    }
}
