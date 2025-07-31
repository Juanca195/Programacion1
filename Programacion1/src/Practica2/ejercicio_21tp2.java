package Practica2;
/*Pedir por consola un número entero e informar si es un número
primo. Un número es primo si solo es divisible por 1 y por sí
mismo */

public class ejercicio_21tp2 {
    public static void main(String[] args) {
        int numero = 0;
        boolean esPrimo = false;

        System.out.println("Ingrese un numero entero"); 
        numero = Utils.leerInt();

        if(numero == 0){
            esPrimo = true;
        }
        for(int i = 2; i <=numero / 2; i++){
            if(numero % i ==0){
                esPrimo = true; 
            }
        }
        if(!esPrimo){
            System.out.println(numero + " Es primo");
        }
        else {
            System.out.println(numero + " No es primo");
        }

    }
}
