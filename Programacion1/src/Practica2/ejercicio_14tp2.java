package Practica2;
/*Pedir por consola el ingreso de 10 números enteros positivos.
Contar cuántas veces se ingresaron números pares y mostrarlo
por pantalla. */

public class ejercicio_14tp2 {
    public static void main(String[] args) {
        int entero ;
        int cantPares =0;
        for(entero = 1; entero <= 10; entero++){
            System.out.println("ingrese un numero entero positivo");
            entero = Utils.leerInt();

            if(entero % 2 ==0){
                cantPares++;
                entero += cantPares;
            }
        }
        System.out.println("Cantidad de pares: " + cantPares);
    }
}
