package Practica2;
/* Escribir un programa que mientras que el usuario ingrese un
número entero distinto de 0, pida ingresar otro número entero y lo
imprima.
 */

public class ejercicio_8tp2 {
    public static void main(String[] args) {
        int entero = 0;
        int entero2 ;

        System.out.println("Ingrese un numero entero distinto de 0");
        entero = Utils.leerInt();

        while (entero != 0) {
            System.out.println("Ingrese otro numero");
            entero2 = Utils.leerInt();
            System.out.println("Numero ingresado es: " + entero2 );
        }
    }
}
