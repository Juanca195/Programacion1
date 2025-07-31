package Practica2;
/*Escribir un programa que dado un valor ingresado por el
usuario menor que 10 y mayor a 1, muestre por pantalla una
cuenta regresiva de números desde dicho valor hasta el 0
inclusive.
 */

public class ejercicio_17tp2 {
    public static void main(String[] args) {
        int numero = 0; 
        System.out.println("Ingrese un valor");
        numero = Utils.leerInt();

       if (numero > 1 && numero <10) {
            System.out.println("cuenta regresiva");
            for(int i = numero; i >=0; i--){
                System.out.println(i);
            }
       }
    }
}
