package Practica5;
/*Hacer un programa que dado un arreglo ordenado creciente de
enteros de tamaño 10 que se encuentra precargado, solicite al
usuario un número entero y elimine la primera ocurrencia de
número (un número igual) en el arreglo (si existe). Informar si no
existe en el arreglo. */

import Practica3.Utils;

//Dado un arreglo ordenado creciente, Tamaño 10
   //Pedir un numero entero al usuario
    //ver di el numero entero existe en el arreglo
    //informar si existe 
    //eliminar numero
      // si no existe tamebien 
       
public class Ejercicio_36tp5 {
    final static int MAX = 10;

    public static void main(String[] args) {
        int [] arrEnteros = {1,2,3,4,5,6,7,8,9,10};

        System.out.println("Ingrese un numero entero");
        int numero = Utils.leerInt();

        int pos = 0;
        while (pos < MAX && arrEnteros[pos]!= numero) {
            pos++;
        }
        if(pos < MAX){
                eliminarNumero(arrEnteros, pos);
                System.out.println("Existe el numero en el arreglo"); 
            }
            else{
                System.out.println("no existe el numero en arreglo");
            }
        mostrarArreglo(arrEnteros);
    }
    public static void eliminarNumero(int [] arrEnteros, int pos){
        for(int i = pos; i < MAX-1; i++){
            arrEnteros[i] = arrEnteros[i+1];
        }
    }
    public static void mostrarArreglo(int [] arrEnteros){
        for(int i = 0; i < MAX; i++){
            System.out.print("|" + arrEnteros[i]);
        }
    }
}
