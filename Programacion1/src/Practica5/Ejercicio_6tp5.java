package Practica5;
/*Hacer un programa que dado un arreglo de enteros de tamaño 10
que se encuentra cargado, obtenga la cantidad de números pares
que tiene y la imprima.
 */
    //cargar un arreglo de eneteros de tamaño 10
    //obtener la cantidad de numeros pares
    // imprimir la cantidad
public class Ejercicio_6tp5 {
    final static int MAX = 10;
    public static void main(String[] args) {
        int [] enteros = {1,2,3,4,5,6,7,8,9,10};
        obtenerPares(enteros);
    }
    public static void obtenerPares(int[] enteros) {
        int cant = 0;
        for(int pos = 0; pos < MAX; pos++){
            if(enteros[pos] % 2==0){
                cant++;
            } 
        }
        System.out.println("La cantidad de pares es: " +cant);
    }

}
