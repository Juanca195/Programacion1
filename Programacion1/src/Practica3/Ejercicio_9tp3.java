package Practica3;
/*Escribir un programa que mientras el usuario ingrese un número
entero entre 1 y 10, pida ingresar un carácter, y por cada carácter
ingresado imprima:
a. “letra minúscula” si el carácter es una letra del abecedario en
minúscula;
b. “letra mayúscula” si el carácter es una letra del abecedario
en mayúscula;
c. “dígito” si el carácter corresponde a un número;
d. “otro” para los restantes casos de caracteres.
*/


public class Ejercicio_9tp3 {

    final static int MIN = 1, MAX = 10; 
    final static char minMayuscula = 'A', maxMayuscula = 'Z', minMinuscula = 'a', maxMinuscula = 'z', digitoMin = '0', digitoMax = '9'; 
    public static void main(String[] args) {    
        System.out.println("Ingrese un numero entre 1 y 10");
        int numero = Utils.leerInt();
        char caracter ;
        
        while (numero >=MIN && numero <= MAX) {
            System.out.println("Ingrese un caracter");
            caracter = Utils.leerChar();
            verificarCaracter(caracter);
            System.out.println("Ingrese un numero entre 1 y 10");
            numero = Utils.leerInt();
            
        }
        
    }
    private static void verificarCaracter(char caracter) {
        if(caracter >= minMayuscula && caracter <= maxMayuscula){
            System.out.println("El caracter es Mayuscula");
        }  else if(caracter >= minMinuscula && caracter <= maxMinuscula){
             System.out.println("El caracter es Minuscula");
            } else if (caracter >= digitoMin && caracter <= digitoMax){
                System.out.println("El caracter es Digito");
                }else{
                  System.out.println("Es otro tipo de caracter");
                 }
    }
}
