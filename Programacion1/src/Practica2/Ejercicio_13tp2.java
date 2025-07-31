package Practica2;
/*Escribir un programa que mientras que el usuario ingrese un
caracter letra minúscula, pida ingresar un número entero. Si el
número ingresado está entre 1 y 5 inclusive deberá imprimir la
tabla de multiplicar de dicho número. */

public class Ejercicio_13tp2 {
    public static void main(String[] args) {
        final char valMin = 'a';
        final char valMax = 'z';
        char letra;

        System.out.println("Ingrese una letra minuscula");
        letra = Utils.leerChar();

        while (letra>=valMin && letra<=valMax) {
            int entero;
            System.out.println("Ingrese un numero entero");
            entero = Utils.leerInt();

            if(entero >= 1 && entero <= 5){
                for(int i = 1; i <= 10; i++){
                    System.out.println(entero+" * "+i+" = "+(entero * i));
                }
            }

        }

    }
}
