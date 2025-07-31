package Practica5;

import Practica3.Utils;

/*Hacer un programa que dado un arreglo ordenado creciente de
enteros de tamaño 10 que se encuentra precargado, solicite al
usuario un número entero y lo inserte en el arreglo manteniendo
su orden. Para ello tendrá que realizar un corrimiento a derecha
(se pierde el último valor del arreglo) y colocar el número en el
arreglo en la posición indicada.
 */
  //Dado un arreglo ordenado creciente de enteros
   //solicitar al usuario un numero entero
    //Si el numero es entero 
     //insertar numero 
      // mantener su orden/// Preguntar sobre esto
       // colocar el numero en el arreglo manteniendo el orden
public class Ejercicio_35tp5 {
    final static int MAX = 10; 
    
    public static void main(String[] args) {
        int [] arrEnteros = {2,4,6,8,10,12,14,16,18,20};

        System.out.println("Ingrese un numero");
        int numero = Utils.leerInt();

        int pos=0;
        while(pos < MAX && arrEnteros[pos] < numero){
            pos++;
        }
        if(pos < MAX){
            corrimientoDerecha(arrEnteros, pos);
            arrEnteros[pos]= numero;
        }else{
            arrEnteros[MAX-1]= numero;
        }
       mostrarArreglo(arrEnteros);
    }

    public static void mostrarArreglo(int [] arrEnteros){
        for(int i =0; i < MAX; i++){
            System.out.print("|" + arrEnteros[i]);
        }
    }
    
     public static void corrimientoDerecha(int [] arr, int numero){
        for(int pos = MAX-1; pos >numero; pos--){
            arr[pos] = arr[pos-1];
        }
    }
    

}
