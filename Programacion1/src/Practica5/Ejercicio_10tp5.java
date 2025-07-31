package Practica5;

import Practica3.Utils;

/*Hacer un programa que verifique en un arreglo si tiene al
menos N números primos. N debe ser ingresado por el usuario.
Reutilizar los métodos ya desarrollados.
 */
  //Hacer un arreglo 
   // contar la camtidad de numeros primos 
public class Ejercicio_10tp5 {
    final static int MAX = 10;

    public static void main(String[] args) {
        int [] arrEnteros = {5,6,89,12,14,18,20,23,35,9};
        int numero = obtenerNumero();
        obtenerNumeroprimos(arrEnteros, numero);
        mostraArreglo(arrEnteros);
        
    }
    private static void mostraArreglo(int[] arrEnteros) {
        for(int pos = 0; pos < MAX; pos++){
            System.out.print("|" +arrEnteros[pos] );
        }
    }
    private static void obtenerNumeroprimos(int[] arrEnteros, int numero) {
        for(int i = 0; i * i < numero ; i++){
            if(numero % i == 0){
                System.out.println("los numeros primos son: " );
            }
        }
    }
    private static int obtenerNumero() {
        System.out.println("Ingrese un numero");
        int numero = Utils.leerInt();
        return numero;
    }
}
