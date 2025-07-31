package Practica2;
/*Escribir un programa que mientras que el usuario ingrese un
número distinto de 0, pida ingresar otros dos números e imprima
el resultado de la división entre los dos últimos números
ingresados. ¿Existe alguna restricción para la división? */

public class ejercicio_18tp2 {
    public static void main(String[] args) {
        int numero = 0; 
        int numero2 = 0;
        int numero3 = 0; 
        double resultado ;

        System.out.println("Ingrese un numero");
        numero = Utils.leerInt();

        while(numero !=0){
            System.out.println("Ingrese un numero");
            numero2 = Utils.leerInt();
            System.out.println("Ingrese otro numero");
            numero3 = Utils.leerInt();
            resultado = numero2/numero3;
            System.out.println("El resultado de la divion es: " + resultado );
        }
    }
}
