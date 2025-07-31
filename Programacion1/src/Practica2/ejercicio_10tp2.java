package Practica2;
/*Escribir un programa que mientras que el usuario ingrese un
número entero entre 1 y 10 inclusive, lleve la suma de los
números ingresados. Finalmente, cuando sale del ciclo muestre
por pantalla el resultado de la suma. ¿En qué casos termina? */

public class ejercicio_10tp2 {
    public static void main(String[] args) {
        int entero = 0;
        int suma =0;

        //System.out.println("Ingrese un entero entre 1 y 10");
        //entero = Utils.leerInt();523
        for (entero = 1 ; entero <=10; entero++){
            System.out.println("Ingrese un entero entre 1 y 10");
            entero = Utils.leerInt();
            suma += entero;
            entero = suma;
        }
        System.out.println("El resultado de la suma es: " + suma);
    }
}
