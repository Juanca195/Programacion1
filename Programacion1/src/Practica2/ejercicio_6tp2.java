package Practica2;
/*Escribir un programa que mientras el usuario ingrese un número
entero menor que 100 y mayor a 1, muestre por pantalla si el
número es múltiplo de 2 y múltiplo de 3 simultáneamente. (¿Los
valores mencionados en el enunciado deberían ser constantes?.
De a poco habría que definirlos como constantes).
 */

public class ejercicio_6tp2 {
    public static void main(String[] args) {
        final int MAX = 100;
        final int MIN = 1;
        int entero = 0;

        System.out.println("Ingrese un numero entero");
        entero = Utils.leerInt();
        
       while (entero > MIN && entero < MAX) {
            if(entero % 2 ==0 && entero % 3 ==0){
                System.out.println("Es multiplo de 2 y 3: " + entero);
                entero++;
            } 
        }

    }
}
