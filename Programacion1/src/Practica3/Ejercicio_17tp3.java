package Practica3;
/*Escribir un programa que mientras que el usuario ingrese un
carácter letra minúscula, pida ingresar un número entero. Si el
número ingresado está entre 1 y 5 inclusive deberá imprimir la
tabla de multiplicar de dicho número. */

//obtener un caracter 
 //si es letra minuscula 
  //Perdir el ingreso de un numero entero
    // si el numero esta entre 1 y 5 inclusive
      //imprimir tabla de dicho numero

public class Ejercicio_17tp3 {
    public static void main(String[] args) {
        System.out.println("Ingrese un caracter");
        char caracter = Utils.leerChar();

        while(caracter >= 'a' && caracter <= 'z'){
            System.out.println("Ingrese un numero entero");
            int numero = Utils.leerInt();
            if(numero >= 1 && numero <= 5){
                imprimirTabla(numero);
            }
        }
    }

    private static void imprimirTabla(int numero) {
        for(int i = 1; i <=10; i++){
            System.out.println((numero*i));
        }
    }
}
